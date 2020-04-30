
import java.util.Scanner;


public class IngredientsProcessing {

    static Scanner input = new Scanner(System.in);
    private double water;
    private double grind;
    private double milk;
    private double ice;
    private int Count = 0;

    public IngredientsProcessing() {           // calling for all ingredients.
        this.milk = 0;
        this.water = 0;
        this.grind = 0;
    }

    private void EnterIngredient() {                          //calling for putting Ingredients
        System.out.println("\n putting..");
        this.grind = 250;
        this.milk = 1;
        this.water = 1;
        this.ice = 2;
        System.out.println("putting Completed you can make coffee now.");
    }

    private void GetIngredient() {                                                          //To Get Status
        System.out.println(" Coffee grind (g) " + String.format("%.1f", this.grind));
        System.out.println("  Milk(L) " + String.format("%.1f", this.milk));
        System.out.println(" Water(L) " + String.format("%.1f", this.water));
    }

    private void CoffeeMenu() {                                                           //Coffee Selection Menu
        System.out.println("\n ------------------ ");
        System.out.println("|   Select Type of coffee:   |\n ------------------ \n| 1: Expresso |\n| 2: Latte  |\n| 3: Ice |\n| 4: Drip  |\n|  0 to Cancell  |");
        System.out.println(" ------------------ \n");

        char t = input.next().charAt(0);
        Drinks currentDrink = null;
        switch (t) {
            case '1':
                currentDrink = Drinks.makeEspresso();//Calling Expresso Method
                break;
            case '2':
                currentDrink = Drinks.makeLatte();                                          //Calling Latte Method
                break;
            case '3':
                this.Ice();                                                       //Calling  Ice Method
                break;
            case '4':
                currentDrink = Drinks.makeDrip();
                break;

            case '0':                                                             // cancelling
                break;

        }
        if (currentDrink != null) {
            processDrink(currentDrink);
        }
    }

    private void processDrink(Drinks drink) {
        if (this.grind >= drink.coffee && this.water >= drink.water && this.milk >= drink.milk) {
            System.out.println("\nMaking " + drink.name + "..");
            System.out.println("\nTaking " + drink.coffee + "g of grind.");
            this.grind = this.grind - drink.coffee;
            System.out.println("Taking " + drink.water + " of water.");
            this.water -= drink.water;
            System.out.println("\nYour  " + drink.name + " is Ready.");
            this.Count++;
        } else {
            System.out.println("\nAvailable grind  " + (this.grind));
            System.out.println("Available water " + (this.water));
            System.out.println("\nmissing some ingredients, please put.");
        }
    }

    private void Ice() {                                                      // Ice making Method
        if (this.grind >= 5 && this.ice >= 1) {
            System.out.println("\nMaking Ice coffee...");
            System.out.println("\nTaking 5g of grind.");
            this.grind = this.grind - 5;
            System.out.println("Taking 1 block of ice.");
            this.ice = this.ice - 1;
            System.out.println("\nYour ice Coffee is Ready.");
            this.Count++;
        } else {
            System.out.println("\nAvailable grind  " + (this.grind));
            System.out.println("Available ice " + (this.ice));
            System.out.println("\nmissing some ingredients, please put.");
        }
    }

    public void StartMachine() {   //public Start to access all private method of this class
        System.out.println(" ----------------------------------------------------------------");
        System.out.println(" ----------------------------------------------------------------");


        //System.out.println("Currently We Have Following Operations, Select as your Need:- ");
        System.out.println("\nSelect  what you need among following operations..: ");
        this.GetIngredient();
        boolean t = true;
        while (t) {
            System.out.println("\n -------------------------------- ");
            System.out.println("|1:     Status of Ingredient     |\n -------------------------------- \n|2:      Fill Ingredient         |\n -------------------------------- \n|3:        Make Coffee           |\n -------------------------------- \n|4: How many Coffee We have made?|\n -------------------------------- \n|5:        Exit                  |");
            System.out.println(" -------------------------------- \n\n");
            char c = IngredientsProcessing.input.next().charAt(0);
            switch (c) {    // for obtaining results..
                case '1':
                    System.out.println("------------- Status ------------");
                    GetIngredient();
                    System.out.println("---------------------------------");
                    break;
                case '2':
                    this.EnterIngredient();
                    break;
                case '3':
                    this.CoffeeMenu();
                    break;
                case '4':
                    System.out.println("\nWe Have Made " + this.Count + " Coffees.");
                    break;

                case '5':
                    System.out.println("\nExiting...\n");
                    t = false;
                    break;
            }
        }
    }
}
