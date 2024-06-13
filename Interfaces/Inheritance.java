package Interfaces;
interface A{
    void msg();
}

interface B {
    void msgs();
}

public class Inheritance implements A,B {
    public void msg() { 
        System.out.println("welcome to");
    }
    public void msgs(){ 
        System.out.println("Java world"); 
    }
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.msg();
        obj.msgs();
    }
}
