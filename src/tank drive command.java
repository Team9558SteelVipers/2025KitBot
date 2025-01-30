package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ControllerSubsystem;
import frc.robot.subsystems.DriveTrainSubsystem;

public static class TankDriveCommand extends CommandBase {

  ControllerSubsystem controllerSubsystem;
  DriveTrainSubsystem driveTrainSubsystem;
  public TankDriveCommand(ControllerSubsystem sub1, DriveTrainSubsystem sub2) {
    controllerSubsystem = sub1;
    driveTrainSubsystem = sub2;
    addRequirements(controllerSubsystem, driveTrainSubsystem);
  }
  @Override
  public void initialize() {}
  @Override
  public void execute() {
    double leftSpeed = controllerSubsystem.getDriverController().getLeftY();
    double rightSpeed = controllerSubsystem.getDriverController().getRightY();

    driveTrainSubsystem.setSpeed(leftSpeed, rightSpeed);
  }

  @Override
  public void end(boolean interrupted) {}
  
  @Override
  public boolean isFinished() {
    return false;
  }
}

