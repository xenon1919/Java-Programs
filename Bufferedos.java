import java.io.*;
public class Bufferedos {
    public static void main(String[] args) {
        String ss = new String("Hello World\n");
        byte buffer[] = new byte[64];
        ss.getBytes(0,ss.length(),buffer,0);
        BufferedOutputStream br = new BufferedOutputStream(System.out);
        try {
            br.write(buffer,0,64);
            br.flush();
        } catch (Exception e) {
            System.out.println("Error "+e.toString());
        }
    }
}
