package Interfaces;
interface sum{
    int a = 10;
    void AA();
}
interface sub{
    int b = 10;
    void BB();
}

public class AddSub implements sum,sub{
    public void AA(){
        System.out.println(a+b);
    }
    public void BB(){
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        AddSub obj = new AddSub();
        obj.AA();
        obj.BB();
    }
}
