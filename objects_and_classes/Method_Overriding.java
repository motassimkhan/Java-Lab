class Vehicle{
    void run(){
        System.out.println("Vehicle Running!!");
    }
}
class Bike extends Vehicle {
    void run(){
        System.out.println("Bike is running!!");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
