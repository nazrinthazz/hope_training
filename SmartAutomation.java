abstract class  device{
    abstract void turnOn();
    abstract void turnOff();
    String name;
}
class Light extends device{
    void turnOn(){
        System.out.println("Light is switched on");
    }
    void turnOff(){
        System.out.println("Light is turned off");
    }
}
class AC extends device{
    void turnOn(){
        System.out.println("AC is switched on");
    }
    void turnOff(){
        System.out.println("AC is turned off");
    }
}
interface Trigger {
    public boolean isTriggered();
}
class MotionTrigger implements Trigger{
     boolean motionDetected;

    MotionTrigger(boolean motionDetected) {
        this.motionDetected = motionDetected;
    }

    public boolean isTriggered() {
        return motionDetected;
    }
}
class TimeTrigger implements Trigger{
    int time;
    public boolean isTriggered(){
        return time == 19;
    }
    TimeTrigger(int time){
        this.time=time;
    }
}
class TempTrigger implements Trigger{
    int temp;
    public boolean isTriggered(){
        return temp > 30;
    }
    TempTrigger(int temp){
        this.temp=temp;
    }
}
interface Action{
    void execute();
}
class turnOnAction implements Action{
    device d;
    @Override
    public void execute(){
        d.turnOn();
    }
    turnOnAction(device d){
        this.d=d;
    }
}
class turnOffAction implements Action{
    device d;
    @Override
    public void execute(){
        d.turnOff();
    }
    turnOffAction(device d){
        this.d=d;
    }
}
class Rule{
    Trigger t;
    Action a;
    Rule(Trigger t, Action a){
        this.t=t;
        this.a=a;
    }
    void result(){
        if(t.isTriggered()){
            a.execute();
        }else System.out.println("Trigger condition not met");
    }
}

public class SmartAutomation {
    public static void main(String[] args){
                // Devices
        device light = new Light();
        device ac = new AC();

        // Triggers
        Trigger motion1 = new MotionTrigger(true);
        Trigger motion2 = new MotionTrigger(false);
        Trigger time1 = new TimeTrigger(19);
        Trigger time2 = new TimeTrigger(7);
        Trigger temp1 = new TempTrigger(32);
        Trigger temp2 = new TempTrigger(25);

        // Actions
        Action lightOn = new turnOnAction(light);
        Action acOn = new turnOnAction(ac);

        //
        Action lightOff = new turnOffAction(light);
        Action acOff = new turnOffAction(ac);

        // Rules
        Rule rule1 = new Rule(motion1, lightOn); // motion → light ON
        Rule rule2 = new Rule(time1, lightOn);   // 7pm → light ON
        Rule rule3 = new Rule(temp1, acOn);      // temp > 30 → AC ON
        // Rules
        Rule rule11 = new Rule(motion2, lightOff);
        Rule rule22 = new Rule(time2, lightOff);   
        Rule rule33 = new Rule(temp2, acOff);

        // Execute rules
        rule1.result();
        rule2.result();
        rule3.result();
        rule11.result();
        rule22.result();
        rule33.result();
    }
}
