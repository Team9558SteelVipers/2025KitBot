package frc.robot.Subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Subsystems.Commands.Constants;
//import frc.robot.RobotMap;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
/**
 *
 */
public class DriveTrain extends SubsystemBase {
	
    TalonSRX FrontLeftMotor = new TalonSRX(Constants.FrontLeftMotor);
    TalonSRX FrontRightMotor = new TalonSRX(Constants.FrontRightMotor);
    TalonSRX BackLeftMotor = new TalonSRX(Constants.BackLeftMotor);
    TalonSRX BackRightMotor = new TalonSRX(Constants.BackRightMotor);

	public void setSpeed(double Lspeed, double Rspeed){
        FrontLeftMotor.set(ControlMode.PercentOutput, -Lspeed);
        FrontRightMotor.set(ControlMode.PercentOutput, Rspeed);
        BackLeftMotor.set(ControlMode.PercentOutput, -Lspeed);
        BackRightMotor.set(ControlMode.PercentOutput, Rspeed);
        
    }


    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    @SuppressWarnings("unused")
    private double safetyTest(double motorValue) {
        motorValue = (motorValue < -1) ? -1 : motorValue;
        motorValue = (motorValue > 1) ? 1 : motorValue;
        
        return motorValue;
    }
    
    private double scaleLeft(double left) {
    	return 1.0 * left;
    }
    
    private double scaleRight(double right) {
    	return 1.0 * right;
    }


    }
