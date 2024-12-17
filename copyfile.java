import java.io.*;
public class copyfile {
    public static void main(String args[]) throws IOException {
        FileInputStream in=null;
        FileOutputStream out=null;
        try {
            in=new FileInputStream("input.txt");
            out=new FileOutputStream("output.txt");
            int c;
            while((c=in.read())!=-1) {
                out.write(c);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}