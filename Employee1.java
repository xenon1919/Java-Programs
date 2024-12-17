class Employee1 {

    float salary = 12000;
    
}
class Programmer extends Employee1 {
    int bonus = 5000;
    public static void main(String args[]) 
    {
       Programmer p1 = new Programmer();
       System.out.println("Programmer salaryis : " + p1.salary);
       System.out.println("Bonus of Programmer : " + p1.bonus); 
    }
}