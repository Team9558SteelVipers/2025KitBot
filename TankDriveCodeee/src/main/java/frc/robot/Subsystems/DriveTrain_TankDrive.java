package frc.robot.Subsystems;

public class DriveTrain_TankDrive extends edu.wpi.first.wpilibj2.command.Command {
	
    Subsystem m_Subsystem;

    @Override
                public void initialize() {

          }

    // Called repeatedly when this Command is scheduled to run
        @Override
        public void execute() {
         double leftSpeed = m_Subsystem.getController().getLeftY();
         double rightSpeed = m_Subsystem.getController().getRightY();

         m_Subsystem.setSpeed(leftSpeed, rightSpeed);
  
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