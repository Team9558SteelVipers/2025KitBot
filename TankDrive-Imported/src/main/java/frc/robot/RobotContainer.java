// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//import frc.robot.MotorConstants.OperatorConstants;
//import frc.robot.commands.Autos;
import frc.robot.commands.ButtonCommand;
import frc.robot.subsystems.CoralSubsystem;
import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.TankSubsystem;
//import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
//import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer{
// public CommandXboxController m_Tankcontroller = new CommandXboxController(0);

  final TankSubsystem m_TankSubsystem = new TankSubsystem();
  final ElevatorSubsystem m_ElevatorSubsystem = new ElevatorSubsystem();
  final CoralSubsystem m_CoralSubsystem = new CoralSubsystem();
  public CommandXboxController tankmoverController = new CommandXboxController(0);
  final ButtonCommand m_TankCommander = new ButtonCommand(m_TankSubsystem, tankmoverController);
    ButtonCommand m_ButtonCommandUP = new ButtonCommand(m_ElevatorSubsystem, 1.0);
    ButtonCommand m_ButtonCommandDOWN = new ButtonCommand(m_ElevatorSubsystem, -1.0);
    ButtonCommand m_CoralOuttake = new ButtonCommand(m_CoralSubsystem);


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    
    tankmoverController.a().whileTrue(m_CoralOuttake);
    tankmoverController.rightTrigger().whileTrue(m_ButtonCommandUP);
    tankmoverController.leftTrigger().whileTrue(m_ButtonCommandDOWN);
    m_TankSubsystem.setDefaultCommand(m_TankCommander);
  }
}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   * @return the command to run in autonomous
   */
  //public Command getAutonomousCommand()
    // An example command will be run in autonomous
    //return Autos.exampleAuto(m_ButtonCommand100);

