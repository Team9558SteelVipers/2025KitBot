// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.DynamicDriveCommand;
import frc.robot.commands.ShootCoralCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ShootCoralSubsystem;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
  
  private final CommandXboxController m_driverController = new CommandXboxController(OperatorConstants.kDriverControllerPort);

  private final DriveSubsystem m_driveSubsystem = new DriveSubsystem();
  private final ShootCoralSubsystem m_shootCoralSubsystem = new ShootCoralSubsystem();

  private final DynamicDriveCommand m_dynamicDriveCommand = new DynamicDriveCommand(m_driveSubsystem, m_driverController :: getRightY, m_driverController :: getLeftY);
  private final ShootCoralCommand m_shootCoralCommand = new ShootCoralCommand(m_shootCoralSubsystem);


  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    m_driverController.a().whileTrue(m_shootCoralCommand);
  }
}
