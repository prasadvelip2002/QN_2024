class Os{
    Os(){
        System.out.println("Os is installed");
    }
    void checkOs(){
        System.out.println("Os is working fine");
    }
}
class Charger{
    String name;
    Charger(String n){
        System.out.println("Charger ready for charging");
        name=n;
    }
    void checkCharger(){
        System.out.println("Charger is working fine");
    }
}
class mobile{
    Os s = new Os();
    mobile(){
        System.out.println("Mobile created with os installed");
    }
    void hasA(Charger c){
        System.out.println("charger connected to mobile phone");
    }
}
public class Delegation {
    public static void main(String[] args) {
        mobile m = new mobile();
        Charger c = new Charger("i phone");

        m.hasA(c);
        m.s.checkOs();
        c.checkCharger();
        m=null;
        // c.checkCharger();

        // m.s.checkOs();
    }
    
}