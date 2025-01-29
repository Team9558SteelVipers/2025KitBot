package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
    
    final Subsystem m_Subsystem = new Subsystem();
        public CommandXboxController TankDriveController = new CommandXboxController(0);

}
