class Dog {
    void eat() {
        System.out.println("Eating ");
    }
    class Dog extends Animal {
        void bark() {
            System.out.println("Barking ");
    }
    class Testinheritance {
        
        public static void main(String args[]) {
            Dog d = new Dog();
            d.bark();
            d.eat();
        }
    }
    
}

}