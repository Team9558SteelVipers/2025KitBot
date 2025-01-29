package frc.robot.Subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import frc.robot.RobotMap;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
/**
 *
 */
public class DriveTrain extends SubsystemBase {
	
	


    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveTrain_TankDrive());
    }
	
	public void setMotors(double FrontLeft, double FrontRight, double BackLeft, double BackRight) {
    	FrontLeft = scaleLeft(FrontLeft);
    	FrontRight = scaleRight(FrontRight);
    	
    	setMotors(FrontLeft, FrontRight, BackLeft, BackRight);
    }
    
	
    
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
