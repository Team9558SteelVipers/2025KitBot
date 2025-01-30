package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

public class DynamicDriveCommand extends Command {

  private final DriveSubsystem m_driveSubsystem;
  
  Supplier <Double> leftspeed; 
  Supplier <Double> rightspeed; 

  public DynamicDriveCommand(DriveSubsystem subsystem, Supplier <Double> new_leftspeed , Supplier <Double> new_rightspeed) {
    m_driveSubsystem = subsystem;
    new_leftspeed = leftspeed;
    new_rightspeed = rightspeed;
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {

    m_driveSubsystem.dynamicDrive(rightspeed.get(), leftspeed.get());

  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {

    return false;

  }
}
