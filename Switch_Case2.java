import java.util.Scanner;

public class Switch_Case2 {
    public static void main(String[] args){
        Scanner Get = new Scanner(System.in);
        int Num;
        System.out.println("Enter a number: ");
        Num=Get.nextInt();

        switch (Num){
            case 1:
            case 2:
            case 3:
                P("This number is smaller than 4 and bigger than 0!");
                break;
            case 4:
            case 5:
            case 6:
                P("This number is smaller than 7 and bigger than 3!");
                break;
            case 7:
            case 8:
            case 9:
                P("This number is smaller than 10 and bigger than 6!");
                break;
            default:
                P("This number is smaller than 1 OR bigger than 9!");
                break;
        }


        Get.close();
    }
    public static void P(String S){
        System.out.println(S);
    }
}
