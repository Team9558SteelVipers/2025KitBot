// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.dynamicDriveCommand;
import frc.robot.commands.shootCoralCommand;
import frc.robot.subsystems.driveSubsystem;
import frc.robot.subsystems.shootCoralSubsystem;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
  
  private final CommandXboxController m_driverController = new CommandXboxController(OperatorConstants.kDriverControllerPort);

  private final driveSubsystem m_driveSubsystem = new driveSubsystem();
  private final shootCoralSubsystem m_shootCoralSubsystem = new shootCoralSubsystem();

  private final dynamicDriveCommand m_dynamicDriveCommand = new dynamicDriveCommand(m_driveSubsystem, m_driverController :: getRightY, m_driverController :: getLeftY);
  private final shootCoralCommand m_shootCoralCommand = new shootCoralCommand(m_shootCoralSubsystem);


  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    m_driverController.a().whileTrue(m_shootCoralCommand);
  }
}
