class adder{
    static int add (int a ,int b){
        return a+b;
    }
    static double add (double a, double b){
        return a+b;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        System.out.println("sum of 2 + 60 = "+ adder.add(2, 60));
        System.out.println("Sum of 50.4 + 20.65 = "+ adder.add(50.4, 20.65));
    }
}
