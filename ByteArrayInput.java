import java.io.*;
public class ByteArrayInput {
    public static void main(String[] args) {
        String tmp = "def";
        byte b[] = tmp.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(b);
        int c;
        while ((c=in.read())!=-1) {
            if(c==0) {
                System.out.println((char)c);
            }
            else {
                System.out.println(Character.toUpperCase((char)c));
            }
        }
        System.out.println(c);
        in.reset();
    }
}
