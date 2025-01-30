public class coral_subsystem extends SubsystemBase{
public coral_subsystem();
coralmotor = new TalonFx(Motorconstants.motorcontrol);
public void outtakecontrol(){
coralmotor.set(0.3);
}
}