package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.BeemovieSPX;
public class main {
public static class DriveTrainSubsystem extends SubsystemBase{

    private TalonFX motorFR;
    private TalonFX motorFL;
    private TalonFX motorBR;
    private TalonFX motorBL;
    public DriveTrainSubsystem() {
        motorFR = new TalonFX(Constants.m_left1Port);
        motorFL = new TalonFX(Constants.m_left14Port);
        motorBR = new TalonFX(Constants.m_right0Port);
        motorBL = new TalonFX(Constants.m_right15Port);
    }
   
    public void setSpeed(double leftpower, double rightpower){
        motorBL.set(ControlMode.PercentOutput, leftpower);
        motorFL.set(ControlMode.PercentOutput, leftpower);
        motorBR.set(ControlMode.PercentOutput, rightpower);
        motorFR.set(ControlMode.PercentOutput, rightpower);
    }
}
}