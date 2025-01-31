// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.CoralSubsystem;
import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.TankSubsystem;

import java.io.Console;
import java.util.function.Supplier;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.Subsystem;
//import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;



public class ButtonCommand extends Command {
  
  public Supplier <Double> leftSpeed;
  public Supplier <Double> rightSpeed;
  CoralSubsystem m_CoralSubsystem;
  TankSubsystem m_TankSubsystem;
  CommandXboxController m_tankmoverController;
  // public ButtonCommand(TankSubsystem Subsystem, Double newSpeed) {
    
  //   speed = newSpeed;
  //   addRequirements(Subsystem);
  // }
  // public ButtonCommand(ElevatorSubsystem ElevatorSubsystem, Double verticalSpeed) {
    
  //   Yspeed = verticalSpeed;
  //   addRequirements(ElevatorSubsystem);
  // }
  // public ButtonCommand(CoralSubsystem CoralSubsystem) {

  // m_CoralSubsystem = CoralSubsystem;
  // addRequirements(CoralSubsystem);
  // }
  public ButtonCommand(TankSubsystem tankSubsystem, Supplier <Double> rSpeed, Supplier <Double> lSpeed) {
    m_TankSubsystem = tankSubsystem;
    leftSpeed = lSpeed;
    rightSpeed = rSpeed;
    addRequirements(m_TankSubsystem);
  }
  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // leftSpeed = m_tankmoverController.getLeftY();
    // rightSpeed =m_tankmoverController.getRightY();
    m_TankSubsystem.setSpeed(leftSpeed.get(), rightSpeed.get());
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
