import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args){
        Scanner Get = new Scanner(System.in);
        Random R = new Random();
        boolean IsPlayable = true;
        int TargetNumber = R.nextInt(50)+1, count=1,Guess;
        System.out.println("Guess the number between 1 to 50.");
        System.out.println(TargetNumber);
        while (IsPlayable==true){
            Guess = Get.nextInt();


            System.out.println(); System.out.println("Attempt number: "+count);
            if (Guess==TargetNumber){
                System.out.println("You guessed correctly!");
                Get.close();
                IsPlayable=false;
            }
            else if(Guess < TargetNumber){
                System.out.println("Trying guessing higher!"); count++;
            }else
                System.out.println("Trying guessing lower!"); count++;
        }



    }



}