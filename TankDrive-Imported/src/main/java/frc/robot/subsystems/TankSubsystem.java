// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.MotorConstants;

public class TankSubsystem extends SubsystemBase {
  // CommandXboxController tankmoverController = new CommandXboxController(0);
  TalonSRX motorFL = new TalonSRX(MotorConstants.motorFL);
  TalonSRX motorFR = new TalonSRX(MotorConstants.motorFR);
  TalonSRX motorBL = new TalonSRX(MotorConstants.motorBL);
  TalonSRX motorBR = new TalonSRX(MotorConstants.motorBR);
 public TankSubsystem() {
  
  
 };

 public void setSpeed(double Lspeed, double Rspeed){
  SmartDashboard.putNumber("Lspeed", Lspeed);
  SmartDashboard.putNumber("Rspeed", Rspeed);
  motorFL.set(ControlMode.PercentOutput, -Lspeed);
  motorBL.set(ControlMode.PercentOutput, -Lspeed);
  motorFR.set(ControlMode.PercentOutput, Rspeed);
  motorBR.set(ControlMode.PercentOutput, Rspeed);
 }
 
 public void TankDrive(double leftDrive, double rightDrive){
  motorFL.set(ControlMode.PercentOutput, leftDrive);
  motorBL.set(ControlMode.PercentOutput, leftDrive);
  motorFR.set(ControlMode.PercentOutput, rightDrive);
  motorBR.set(ControlMode.PercentOutput, rightDrive);
 }

//  public CommandXboxController getController() {
//   return tankmoverController;
//  }
}