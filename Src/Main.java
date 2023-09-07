public class Main {
    public static int numberOfDrinks = 0;
    public static double totalPrice = 0;


    public static void makeCoffee() {
        System.out.println("Making coffee...");
        numberOfDrinks++;
        totalPrice += Drinks.COFFEE_PRICE;
    }

    public static void makeTea() {
        System.out.println("Making tea...");
        numberOfDrinks++;
        totalPrice += Drinks.TEA_PRICE;
    }

    public static void makeLemonade() {
        System.out.println("Making lemonade...");
        numberOfDrinks++;
        totalPrice += Drinks.LEMONADE_PRICE;
    }

    public static void makeMojito() {
        System.out.println("Making mojito...");
        numberOfDrinks++;
        totalPrice += Drinks.MOJITO_PRICE;
    }

    public static void makeMineralWater() {
System.out.println("Making mineral water...");
numberOfDrinks++;
totalPrice += Drinks.MINERAL_WATER_PRICE;
}

    public static void makeCocaCola() {
        System.out.println("Making Coca Cola...");
        numberOfDrinks++;
        totalPrice += Drinks.COCA_COLA_PRICE;
    }
}
