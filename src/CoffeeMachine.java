// Project : Redi`s member Secured Coffee Machine ;
// Programmed by : Beny



import java.util.*;

class CoffeeMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\n Start the Machine Yes (Y) or No (N) ?");


        char b;

        b = input.next().charAt(0);

        if (b == 'Y' || b == 'y') {
             //Instances For Ingredients
            IngredientsProcessing ingredients = new IngredientsProcessing();    
            ingredients.StartMachine();

            //In order to call All Private Method...
            System.out.println("Shutting Down machine..\n");
        } else
            System.out.println("Shutting Down machine...\n");


    }


}



