
package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.MotorConstants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;



public class ElevatorSubsystem extends SubsystemBase {
    
    static TalonSRX motorElevator = new TalonSRX(MotorConstants.motorElevator);

public static void spinRight(double elevatorSpeed){

    motorElevator.set(ControlMode.PercentOutput, elevatorSpeed);
}
public static void spinLeft(double elevatorSpeed){

    motorElevator.set(ControlMode.PercentOutput, -elevatorSpeed);
}
}