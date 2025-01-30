// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ShootCoralSubsystem;

import edu.wpi.first.wpilibj2.command.Command;

public class ShootCoralCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  private final ShootCoralSubsystem m_shootCoralSubsystem;

  public ShootCoralCommand(ShootCoralSubsystem subsystem) {
    m_shootCoralSubsystem = subsystem;
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {

    m_shootCoralSubsystem.shootCoral();

  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {

    m_shootCoralSubsystem.stopShotCoral();
    
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
