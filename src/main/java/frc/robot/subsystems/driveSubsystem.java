// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


import frc.robot.Constants;
import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class driveSubsystem extends SubsystemBase {

  public TalonSRX FLDriveMotor= new TalonSRX(Constants.FLDriveMotorPort);
  public TalonSRX FRDriveMotor= new TalonSRX(0);
  public TalonSRX BLDriveMotor= new TalonSRX(0);
  public TalonSRX BRDriveMotor = new TalonSRX(0);

  
}
