package frc.robot.Subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.Commands.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Subsystem extends SubsystemBase {

    TalonSRX FrontLeftMotor = new TalonSRX(Constants.FrontLeftMotor);
    TalonSRX FrontRightMotor = new TalonSRX(Constants.FrontRightMotor);
    TalonSRX BackLeftMotor = new TalonSRX(Constants.BackLeftMotor);
    TalonSRX BackRightMotor = new TalonSRX(Constants.BackRightMotor);

    CommandXboxController TankDriveController = new CommandXboxController(0);
    
    public void setSpeed(double Lspeed, double Rspeed){
        FrontLeftMotor.set(ControlMode.PercentOutput, Lspeed);
        FrontRightMotor.set(ControlMode.PercentOutput, -Rspeed);
        BackLeftMotor.set(ControlMode.PercentOutput, Lspeed);
        BackRightMotor.set(ControlMode.PercentOutput, -Rspeed);
        
    }

    public CommandXboxController getController() {
     return TankDriveController;
    }
  }

    

