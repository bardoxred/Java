
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String personChoice,personChoice2;
        String computerChoice ="";

        boolean restart=false;
        boolean pomRestart=false;
        int computerRandom;
        do {

        System.out.println("Let's play Rock-Scissors-Paper!");
        System.out.println("Press - R for Rock");
        System.out.println("Press - S for Scissors");
        System.out.println("Press - P for Paper");

        computerRandom = random.nextInt(3)+1;

        if(computerRandom==1)
            computerChoice="R";
        else if(computerRandom==2)
            computerChoice="S";
        else if(computerRandom==3)
            computerChoice="P";



            System.out.println("Enter your choice: ");
            personChoice = scanner.next();
            personChoice = personChoice.toUpperCase();
            System.out.println("Your choice: " + personChoice);
            System.out.println("Computer choice: " + computerChoice);

            if (personChoice.equals(computerChoice))
                System.out.println("It's a tie!");

            else if (personChoice.equals("R")) {
                if (computerChoice.equals("S"))
                    System.out.println("Rock crushes scissors. You win!!");
                else if (computerChoice.equals("P"))
                    System.out.println("Paper eats rock. You lose!!");
            } else if (personChoice.equals("P")) {
                if (computerChoice.equals("S"))
                    System.out.println("Scissor cuts paper. You lose!!");
                else if (computerChoice.equals("R"))
                    System.out.println("Paper eats rock. You win!!");
            } else if (personChoice.equals("S")) {
                if (computerChoice.equals("P"))
                    System.out.println("Scissor cuts paper. You win!!");
                else if (computerChoice.equals("R"))
                    System.out.println("Rock breaks scissors. You lose!!");
            } else if (personChoice != "R" || personChoice != "S" || personChoice != "R")
                System.out.println("Invalid user input.");

            System.out.println();
            System.out.println("Restart? Press 'O'");
            System.out.println("Quit? Press 'E'");
            personChoice2=scanner.next();
            do {
                if(personChoice2.toUpperCase().equals("O")){
                    System.out.println("Restarting...");
                    pomRestart=false;
                    restart=true;
                }
                else if(personChoice2.toUpperCase().equals("E")){
                    System.out.println("See you later...");
                    restart=false;
                    pomRestart=false;
                }
                else{
                    System.out.println("Invalid user input");

                }
            }
            while (pomRestart==true);


        }
        while(restart==true);


    }

}
