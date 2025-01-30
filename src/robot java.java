package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.commands.TankDriveCommand;
import frc.robot.subsystems.ControllerSubsystem;
import frc.robot.subsystems.DriveTrainSubsystem;
public class Robot extends TimedRobot {
    private Command m_autonomousCommand;
  
    private RobotContainer m_robotContainer;
  
    private static ControllerSubsystem m_ControllerSubsystem;
    private static DriveTrainSubsystem m_DriveTrainSubsystem;
  
    private TankDriveCommand m_TankDriveCommand;
    @Override
    public void robotInit() {
        m_ControllerSubsystem = new ControllerSubsystem();
    m_DriveTrainSubsystem = new DriveTrainSubsystem();

    m_TankDriveCommand = new TankDriveCommand(m_ControllerSubsystem, m_DriveTrainSubsystem);

    m_robotContainer = new RobotContainer();
  }
  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
}
@Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}


  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_robotContainer.getAutonomousCommand();

 
    if (m_autonomousCommand != null) {
      m_autonomousCommand.schedule();
    }
  }


  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    if (m_autonomousCommand != null) {
        m_autonomousCommand.cancel();
      }
    }
  

    @Override
    public void teleopPeriodic() {
      m_TankDriveCommand.schedule();
    }
  
    @Override
    public void testInit() {
     
      CommandScheduler.getInstance().cancelAll();
    }
    @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}