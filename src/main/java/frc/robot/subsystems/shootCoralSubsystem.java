// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShootCoralSubsystem extends SubsystemBase {

    TalonSRX coralMotor = new TalonSRX(Constants.coralMotorPort);

  public void shootCoral() {

    coralMotor.set(ControlMode.PercentOutput, Constants.shootingSpeedCoral);
    
  }

  public void stopShotCoral() {

    coralMotor.set(ControlMode.PercentOutput, 0);

  }

}
