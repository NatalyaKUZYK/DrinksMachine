public class VendingMachine {
    public static void main(String[] args) {
 String drinksChoice = "tea";
 drinksChoice = drinksChoice.toUpperCase();
 DrinksMachine chosenDrink = DrinksMachine.valueOf(drinksChoice);

 switch (chosenDrink) {
 case COFFEE:
 Main.makeCoffee();
 break;
 case TEA:
 Main.makeTea();
 break;
 case LEMONADE:
 Main.makeLemonade();
 break;
 case MOJITO:
 Main.makeMojito();
 break;
 case MINERAL_WATER:
 Main.makeMineralWater();
 break;
 case COCA_COLA:
 Main.makeCocaCola();
 break;
default:
 System.out.println("Invalid drink choice");
 }

 System.out.println("Number of drinks: " + Main.numberOfDrinks);
 System.out.println("Total price: " + Main.totalPrice);
 }
}
