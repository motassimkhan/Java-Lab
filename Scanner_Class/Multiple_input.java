package Scanner_Class;
import java.util.Scanner;

public class Multiple_input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name, age, salary: ");
        String name = obj.nextLine();
        int age = obj.nextInt();
        double salary = obj.nextDouble();
        System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary);
        obj.close();
    }    
}
