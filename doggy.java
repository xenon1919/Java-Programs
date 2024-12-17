class pet {
    void play() {
        System.out.println("I am playing");
    }
}
class doggy extends pet {
    void play() {
        System.out.println("I am playing with a ball");
    }
    public static void main(String args[]) {
        doggy obj = new doggy();
        obj.play();
    }
}