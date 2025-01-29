//ahhhhhhhh
package frc.robot.commands;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import org.ejml.equation.ManagerFunctions.Input1;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.simulation.XboxControllerSim;
public static class DriveTrainSubsystem extends SubsystemBase{
    
        private TalonFX motorFR;
        private TalonFX motorFL;
        private TalonFX motorBR;
        private TalonFX motorBL;
    
        public DriveTrainSubsystem() {
            motorFR = new TalonFX(1);
            motorFL = new TalonFX(14);
            motorBR = new TalonFX(0);
            motorBL = new TalonFX(15);
        }
        public void setPower(double leftpower, double rightpower){
            motorBL.set(leftpower);
            motorFL.set(leftpower);
            motorBR.set(rightpower);
            motorFR.set(rightpower);
        } 
}
