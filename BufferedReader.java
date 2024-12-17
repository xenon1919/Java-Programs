import java.io.*;
public class BufferedReader {
    public static void main(String[] args) {
        FileReader fr = new FileReader("textout.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while((i = br.read())!=-1) {
            System.out.println((char)i);
        }
        br.clone();
        fr.close();
    }
}