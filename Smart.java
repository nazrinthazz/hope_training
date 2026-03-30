abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    void deviceInfo(){
        System.out.println("It is a light!!!");
    }
}

class Light extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("Light On");
    }
    @Override
    void turnOff(){
        System.out.println("Light Off");
    } 
}
//Interface
interface Remote{
    void change();
}
interface WifiControl{
    void connect();
    void change();
}
class TV implements Remote, WifiControl{
    @Override
    public void change(){
        System.out.println("Change channel");
    }
    public void connect(){
        System.out.println("Connection Established");
    }
}
public class Smart{
    public static void main(String[] args){
        Light l=new Light();// only child class can be defined
        l.turnOn();
        l.turnOff();

        //cant initiate object for parent class as it is not defined 
        //SmartDevice s=new SmartDevice();

    }
}

