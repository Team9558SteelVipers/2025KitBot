package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

    public TalonSRX FLDriveMotor = new TalonSRX(Constants.FLDriveMotorPort);
    public TalonSRX FRDriveMotor = new TalonSRX(Constants.FRDriveMotorPort);
    public TalonSRX BLDriveMotor = new TalonSRX(Constants.BLDriveMotorPort);
    public TalonSRX BRDriveMotor = new TalonSRX(Constants.BRDriveMotorPort);

  public void dynamicDrive(Double rightspeed , Double leftspeed){

    FLDriveMotor.set(ControlMode.PercentOutput, leftspeed);
    FRDriveMotor.set(ControlMode.PercentOutput, rightspeed);
    BLDriveMotor.set(ControlMode.PercentOutput, leftspeed);
    BRDriveMotor.set(ControlMode.PercentOutput, rightspeed);

  }
  
}
