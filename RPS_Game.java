import java.util.Random;
import java.util.Scanner;

public class RPS_Game {  // Rock, Paper & Scissor Game
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // 0--> For Rock
        // 1--> For Papaer
        // 2--> For Scissor

        System.out.print("Enter User choice --> 0 or 1 or 2 = ");
        int userInput=sc.nextInt();
        sc.close();

        Random random=new Random();
        int computerInput=random.nextInt(3);

        if(userInput==computerInput){
            System.out.println("Draw");
        }
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("You Win");
        }
        else{
            System.out.println("Computer Win");
        }

        System.out.println("Computer choice: "+computerInput);
        
        if(computerInput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper");
        }
        else{
            System.out.println("Computer choice: Scissor");
        }

    }
    
}
