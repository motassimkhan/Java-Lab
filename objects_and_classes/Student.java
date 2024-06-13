public class Student{
    int id;
    String name;
    public static void main(String [] args){
        Student S1 = new Student();
        S1.name = "Name";
        S1.id = 1;
        System.out.println(S1.id+"\n"+S1.name);
    }
}