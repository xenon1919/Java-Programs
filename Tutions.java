class Tutions {

    String name;
    String subject;
    String qualification;
    String ph_no;
    int salary;

    Tutions(String name, String qualification, String subject, int salary, String ph_no) {

        
    this.name=name;
    this.qualification=qualification;
    this.subject=subject;
    this.salary=salary;
    this.ph_no=ph_no;

    }

    public static void main(String args[]) {

        Tutions t1 = new Tutions("R RISHI SAI TEJA", "M.Sc in Physics", "Applied Physics", 25000, "8317653191");
        Tutions t2 = new Tutions("MVNS MANASWI", "M.Sc in Mathematics", "Advanced Mathematics", 25000, "7013685011");
        Tutions t3 = new Tutions("A PRAGNA SAI", "M.A Literature in English", "Advanced Communication Skills", 25000, "6303968316");
        Tutions t4 = new Tutions("C STALIN", "B.Com in Computers", "Computer Networking", 25000, "9347667843");
        Tutions t5 = new Tutions("C PAVAN KALYAN", "MBA", "Finance & Accounting", 25000, "8121770975");


        System.out.println("NAME : " + t1.name + "\n" + "QUALIFICATION : " + t1.qualification + "\n" + "SUBJECT : " + t1.subject + "\n" + "SALARY : " + t1.salary + "\n" + "PHONE NUMBER : " + t1.ph_no + "\n" );
        System.out.println("NAME : " + t2.name + "\n" + "QUALIFICATION : " + t2.qualification + "\n" + "SUBJECT : " + t2.subject + "\n" + "SALARY : " + t2.salary + "\n" + "PHONE NUMBER : " + t2.ph_no + "\n" );
        System.out.println("NAME : " + t3.name + "\n" + "QUALIFICATION : " + t3.qualification + "\n" + "SUBJECT : " + t3.subject + "\n" + "SALARY : " + t3.salary + "\n" + "PHONE NUMBER : " + t3.ph_no + "\n" );
        System.out.println("NAME : " + t4.name + "\n" + "QUALIFICATION : " + t4.qualification + "\n" + "SUBJECT : " + t4.subject + "\n" + "SALARY : " + t4.salary + "\n" + "PHONE NUMBER : " + t4.ph_no + "\n" );
        System.out.println("NAME : " + t5.name + "\n" + "QUALIFICATION : " + t5.qualification + "\n" + "SUBJECT : " + t5.subject + "\n" + "SALARY : " + t5.salary + "\n" + "PHONE NUMBER : " + t5.ph_no + "\n" );
    }
    
}
