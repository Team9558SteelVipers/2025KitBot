package frc.robot.Subsystems;

import java.lang.ModuleLayer.Controller;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class DriveTrain_TankDrive extends edu.wpi.first.wpilibj2.command.Command {
	
    DriveTrain m_driveTrainSubsystem;
    CommandXboxController m_controller;

    public DriveTrain_TankDrive(DriveTrain driveTrainSubsystem, CommandXboxController controller) {
        m_driveTrainSubsystem = driveTrainSubsystem;
        m_controller = controller;
        addRequirements(m_driveTrainSubsystem);
    }

    @Override
                public void initialize() {

          }

    // Called repeatedly when this Command is scheduled to run
        @Override
        public void execute() {

         double leftSpeed = m_controller.getLeftY();
         double rightSpeed = m_controller.getRightY();

         m_driveTrainSubsystem.setSpeed(leftSpeed, rightSpeed);
  
        }

    // Make this return true when this Command no longer needs to run execute(beemovie)
        @Override
        public boolean isFinished() {
            return false;
        }

    // Called once after isFinished returns true
        @Override
        public void end(boolean interrupted) {
    }
}