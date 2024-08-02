class ani{
void sound(){
    System.out.println("Some generic animal sound");
}
}
class dog extends ani{
    void bark(){
        System.out.println("bow");
    }
}
public class animal {
    public static void  main(String [] args){
        ani a=new ani();
        dog d=new dog();
        d.bark();
        d.sound();
    }
}
