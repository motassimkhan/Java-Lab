package Scanner_Class;
import java.util.Scanner;
public class Taking_input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = obj.nextLine();
        System.out.println("Username is: "+ username);
        obj.close();
    }
}
