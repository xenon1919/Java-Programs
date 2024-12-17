import java.io.*;
public class FileClass {
    public static void main(String[] args) throws Exception {
        File f1 = new File("D:\\21015\Employee.txt");
        System.out.println("FileName: "+f1.getName());
        System.out.println("Path: "+f1.getPath());
        System.out.println("Absolute Path: "+f1.getAbsolutePath());
        System.out.println("Parent: "+f1.getParent());
        System.out.println(f1.exists()?"Exists":"Does Not Exist");
        System.out.println(f1.canWrite()?"is Readable":"is Writable");
        System.out.println(f1.canRead()?"is Readable":"is Not Readable");
        System.out.println(f1.isFile()?"is Normal File":"Might be named");
        System.out.println(f1.isAbsolute()?"is Absolute":"is not abs");
        System.out.println("File last mod"+f1.lastModified());
        System.out.println("File Size"+f1.length()+"Bytes");
    }
}
