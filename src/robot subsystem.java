package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class main {
public static class DriveTrainSubsystem extends SubsystemBase{

    private static TalonSRX motorFR;
    private static TalonSRX motorFL;
    private static TalonSRX motorBR;
    private static TalonSRX motorBL;
    public DriveTrainSubsystem() {
        motorFR = new TalonSRX(Constants.m_left1Port);
        motorFL = new TalonSRX(Constants.m_left14Port);
        motorBR = new TalonSRX(Constants.m_right0Port);
        motorBL = new TalonSRX(Constants.m_right15Port);
    }
   
    public void setSpeed(double leftpower, double rightpower){
        motorBL.set(ControlMode.PercentOutput, leftpower);
        motorFL.set(ControlMode.PercentOutput, leftpower);
        motorBR.set(ControlMode.PercentOutput, rightpower);
        motorFR.set(ControlMode.PercentOutput, rightpower);
    }
}
}