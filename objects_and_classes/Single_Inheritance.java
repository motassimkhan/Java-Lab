
class employee{
    double salary = 15000.1;
}

class Single_Inheritance extends employee{
    int bonus = 1000;
    public static void main(String[] args) {
        Single_Inheritance p = new Single_Inheritance();
        System.out.println("Programmer Salary: "+ p.salary+"\nProgrammer Bonus: "+ p.bonus);
    }
}
