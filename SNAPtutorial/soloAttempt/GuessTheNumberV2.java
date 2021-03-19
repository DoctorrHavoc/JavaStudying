/*
 import java.util.Scanner;
import java.util.Random;
public class GuessTheNumberV2 {
    public static void main(String[] args) {
        Scanner Get = new Scanner(System.in);
        Random r = new Random();
        int TargetNum = r.nextInt(50) + 1, AttemptNum = 1, GuessNum;
        do {
            System.out.println("Attempt number " + AttemptNum + ":");
            GuessNum = Get.nextInt();
        } while (GuessNum < 1 || 50 < GuessNum);

        switch (GuessNum) {
            case TargetNum:
                System.out.println("Correct guesSs! The number was " + TargetNum);
                Get.close();
                break;
            default:
                System.out.println("test");
                break;
        }
    }
}

// ):

 */
