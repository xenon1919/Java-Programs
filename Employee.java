class Employee {
    String name;
    int emp_id;
    int salary;
    String position;

    Employee(String name, int emp_id, String position, int salary)
    {
        this.name = name;
        this.emp_id = emp_id;
        this.position = position;
        this.salary = salary;

    }
    public static void main(String args[]) {

        Employee e1 = new Employee("R RISHI SAI TEJA ", 169, "MANAGER", 70000 );
        Employee e2 = new Employee("C PAVAN KALYAN" , 175, "DIRECTOR", 65000 );
        Employee e3 = new Employee("MVNS MANASWI", 11, "ACCOUNTANT", 60000);
        Employee e4 = new Employee("A PRAGNA SAI", 138, "WATCHMAN", 60000);
        Employee e5 = new Employee("C STALIN", 185, "BARTENDER", 60000);

        System.out.println("EMPLOYEE : 1" + "\nEMPLOYEE NAME : " +  e1.name + "\nEMPLOYEE ID :  " + e1.emp_id + "\nROLE : "  + e1.position + "\nSALARY : " + e1.salary + "\n" );
        System.out.println("EMPLOYEE : 2" + "\nEMPLOYEE NAME : " +  e2.name + "\nEMPLOYEE ID :  " + e2.emp_id + "\nROLE : "  + e2.position + "\nSALARY : " + e2.salary +"\n" );
        System.out.println("EMPLOYEE : 3" + "\nEMPLOYEE NAME : " +  e3.name + "\nEMPLOYEE ID :  " + e3.emp_id + "\nROLE : "  + e3.position + "\nSALARY : " + e3.salary+ "\n" );
        System.out.println("EMPLOYEE : 4" + "\nEMPLOYEE NAME : " +  e4.name + "\nEMPLOYEE ID :  " + e4.emp_id + "\nROLE : "  + e4.position + "\nSALARY : " + e4.salary +"\n");
        System.out.println("EMPLOYEE : 5" + "\nEMPLOYEE NAME : " +  e5.name + "\nEMPLOYEE ID :  " + e5.emp_id + "\nROLE : "  + e5.position + "\nSALARY : " + e5.salary +"\n");
        


    }
}
