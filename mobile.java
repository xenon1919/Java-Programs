import java.util.function.IntPredicate;

class Mobile {
    String comp;
    String battery;
    int price;
    int simslots;
    String networktype;

    public static void main(String args[]) {
        Mobile phone = new Mobile();
        phone.comp = "SAMSUNG";
        phone.battery = "6000 mAh";
        phone.price = 15000;
        phone.simslots = 2;
        phone.networktype = "5G" ;

        System.out.println("PHONE MODEL : " + phone.comp + "\n" + "BATTERY CAPACITY : " + phone.price + "\n" + "PRICE : " + phone.price + "\n" + "SIM SLOTS : " + phone.simslots + "\n" + "NETWORK TYPE : " + phone.networktype  );
    }
        
    }
    

