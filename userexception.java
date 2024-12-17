class CustomException extends Exception {
    String msg;
    CustomException(String str) {
        msg = str;
    }
    public String toString() {
        return("Custom msg is " + msg);
    }
}
public class userexception {
    public static void main(String args[]) {
        try {
            throw new CustomException("This is User Exception");
        }
        catch(CustomException e) {
            System.out.println(e);
        }
    }
}