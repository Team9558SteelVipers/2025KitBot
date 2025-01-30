package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants;
public class ControllerSubsystem extends SubsystemBase {
 
  public ControllerSubsystem() {}
 
  public CommandXboxController driverController = new CommandXboxController(0);
 
  public CommandXboxController getDriverController() {
      return driverController;
  }
}