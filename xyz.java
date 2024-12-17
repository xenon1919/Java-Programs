public class xyz implements abc {
    public void connect() {
        System.out.println("Connected");
    }
    public void disconnect() {
        System.out.println("Disconnected");
    }
    public static void main(String args[]) {
        xyz obj = new xyz();
        obj.connect();
        obj.disconnect();
    }
}
