package frc.robot.Subsystems;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
    
    final DriveTrain driveTrainSubsystem = new DriveTrain();
    public CommandXboxController TankDriveController = new CommandXboxController(0);
    final DriveTrain_TankDrive tankDriveCommand = new DriveTrain_TankDrive(driveTrainSubsystem, TankDriveController);

    public RobotContainer() {
        configureBindings();
    }

    private void configureBindings() {
        driveTrainSubsystem.setDefaultCommand(tankDriveCommand);
    }
}
