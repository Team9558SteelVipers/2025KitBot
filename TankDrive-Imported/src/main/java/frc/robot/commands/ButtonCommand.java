// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.CoralSubsystem;
import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.TankSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.Subsystem;
//import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;



public class ButtonCommand extends Command {
  
  double speed;
  double Yspeed;
  CoralSubsystem m_CoralSubsystem;
  TankSubsystem m_TankSubsystem;
  CommandXboxController m_tankmoverController;
  public ButtonCommand(TankSubsystem Subsystem, Double newSpeed) {
    
    speed = newSpeed;
    addRequirements(Subsystem);
  }
  public ButtonCommand(ElevatorSubsystem ElevatorSubsystem, Double verticalSpeed) {
    
    Yspeed = verticalSpeed;
    addRequirements(ElevatorSubsystem);
  }
  public ButtonCommand(CoralSubsystem CoralSubsystem) {

  m_CoralSubsystem = CoralSubsystem;
  addRequirements(CoralSubsystem);
  }
  public ButtonCommand(TankSubsystem tankSubsystem, CommandXboxController tankmoverController) {
    m_TankSubsystem = tankSubsystem;
    m_tankmoverController = tankmoverController;
    addRequirements(m_TankSubsystem);
  }
  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftSpeed = m_TankSubsystem.getController().getLeftY();
    double rightSpeed = m_TankSubsystem.getController().getRightY();

    m_TankSubsystem.setSpeed(leftSpeed, rightSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
