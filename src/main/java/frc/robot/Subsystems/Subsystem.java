package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.Commands.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Subsystem extends SubsystemBase {

    static TalonSRX FrontLeftMotor = new TalonSRX(Constants.FrontLeftMotor);
    static TalonSRX FrontRightMotor = new TalonSRX(Constants.FrontRightMotor);
    static TalonSRX BackLeftMotor = new TalonSRX(Constants.BackLeftMotor);
    static TalonSRX BackRightMotor = new TalonSRX(Constants.BackRightMotor);

    static CommandXboxController TankDriveController = new CommandXboxController(0);
    
    public static void setSpeed(double Lspeed, double Rspeed){
        FrontLeftMotor.set(ControlMode.PercentOutput, Lspeed);
        FrontRightMotor.set(ControlMode.PercentOutput, -Rspeed);
        BackLeftMotor.set(ControlMode.PercentOutput, Lspeed);
        BackRightMotor.set(ControlMode.PercentOutput, -Rspeed);
        
    }
    

    public static CommandXboxController getController() {
     return TankDriveController;
    }
  }

    

