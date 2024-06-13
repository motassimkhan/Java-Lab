class student{
    int id;
    String name;
}
public class Method_outside_main{
    public static void main(String[] args) {
        student S1 = new student();
        S1.id = 1;
        S1.name = "name";
        System.out.println(S1.id+"\n"+S1.name);
    }
}