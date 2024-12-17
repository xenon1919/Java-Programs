abstract class Vehicle {
     
   abstract void start();
}
class Car extends Vehicle {
    void start() {
        System.out.println("It starts with a key");
    }
}
    class Bike extends Vehicle {
        void start() {
            System.out.println("It starts with a kick");
        }
        public static void main(String args[]) {

            Car c = new Car();
            c.start();
            Bike b = new Bike();
            b.start();
        }
    }

