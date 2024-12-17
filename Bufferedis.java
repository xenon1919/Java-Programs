import java.io.*;
public class Bufferedis {
    public static void main(String[] args) {
        BufferedInputStream br = new BufferedInputStream(System.in);
        System.out.println("Input Stream");
        byte buffer[] = new byte[10];
        try {
            br.read(buffer,0,10);  }
        catch(Exception e) {
            System.out.println("Error"+br.toString()); }
        String ss = new String(buffer);
        System.out.println("Output\n"+ss);
        }
    }    
