// Project : Redi`s member Secured Coffee Machine ;
// Programmed by : Beny
// Function : Provide 4 types of coffee and used only by Redi members  **secured** used only with code.(password)
// HINT: cheat sheet for coffee types available and free to every Redi Member;


import java.util.*;

class CoffeeMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\n Start the Machine Yes (Y) or No (N) ?");


        char b;

        b = input.next().charAt(0);

        if (b == 'Y' || b == 'y') {
            IngredientsProcessing ingredients = new IngredientsProcessing();     //Instances For Ingredients
            ingredients.StartMachine();

            //In order to call All Private Method...
            System.out.println("Shutting Down machine..\n");
        } else
            System.out.println("Shutting Down machine...\n");


    }


}



