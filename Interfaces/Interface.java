package Interfaces;
interface printable{
    void print();
}
class A5 implements printable{
    public void print(){
        System.out.println("Hello");
    }
}
public class Interface {
    public static void main(String[] args) {
        A5 obj = new A5();
        obj.print();
    }
}
