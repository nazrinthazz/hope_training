class Character{
    String name;

    public Character(String name) {
        this.name = name;
    }
    void attack(){}
    
}
class warrior extends Character{
    
    void attack(){
        System.out.println(name+" is attacking with sword");
    }

    public warrior(String name) {
        super(name);
    }
}
class mage extends Character{
    void attack(){
        System.out.println(name+" is attacking with magic");
    }
    public mage(String name) {
        super(name);
    }
}
class archer extends Character{
    void attack(){
        System.out.println(name+" is attacking with bow and arrow");
    }
    public archer(String name) {
        super(name);
    }
}
public class Game {
    public static void main(String[] args){
        Character c;
        c = new warrior("Aragorn");
        c.attack();
        c = new mage("Gandalf");
        c.attack();
        c = new archer("Legolas");
        c.attack();
       

    }
}
