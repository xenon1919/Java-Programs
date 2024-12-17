class Student1 {
    String name;
    int age;
    double marks;
    char grade;
    public static void main(String args[]) {
        Student1 data  = new Student1();
        data.name = "Rishi";
        data.age = 19;
        data.marks = 95.4;
        data.grade = 'A';

        System.out.println("NAME OF THE CANDIDATE : " + data.name);
        System.out.println("AGE : " + data.age);
        System.out.println("MARKS : " + data.marks);
        System.out.println("GRADE : " + data.grade);



    }
}