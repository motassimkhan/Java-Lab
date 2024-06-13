public class Multiple_objects {
    int id;
    String name;
    double percentage;
    public static void main(String [] args){
        Multiple_objects obj1 = new Multiple_objects();
        Multiple_objects obj2 = new Multiple_objects();
        Multiple_objects obj3 = new Multiple_objects();
        obj1.id = 1;
        obj1.name = "name1";
        obj1.percentage = 50.5;
        obj2.id = 1;
        obj2.name = "name1";
        obj2.percentage = 50.5;
        obj3.id = 1;
        obj3.name = "name1";
        obj3.percentage = 50.5;
    System.out.println("id: "+obj1.id+" name: "+obj1.name+" percentage: "+obj1.percentage);
    System.out.println("id: "+obj2.id+" name: "+obj2.name+" percentage: "+obj2.percentage);
    System.out.println("id: "+obj3.id+" name: "+obj3.name+" percentage: "+obj3.percentage);
    }
}
