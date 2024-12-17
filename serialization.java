import java.io.*;
public class serialization {
    public static void main(String args[]) {
        try {
            Student s1=new Student(1,"Rishi");
            FileOutputStream fout=new FileOutputStream("f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Success");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}