// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.MotorConstants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class CoralSubsystem extends SubsystemBase {
        
  TalonSRX motorCoral;
  public CoralSubsystem() {
    motorCoral = new TalonSRX(MotorConstants.motorCoral);
   }
    
  public void outtakeCoral(){
    motorCoral.set(ControlMode.PercentOutput, 0.3);
  }  
}