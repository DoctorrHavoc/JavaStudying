import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args){
        Scanner Get = new Scanner(System.in);
        int Num;
        System.out.println("Enter a number: ");
        Num=Get.nextInt();

        switch (Num){
            case 1:
                P("One");
                break;
            case 2:
                P("Two");
                break;
            case 3:
                P("Three");
                break;
            default:
                P("The number is greater than 3 and smaller than one!");
        }


        Get.close();
    }
    public static void P(String S){
        System.out.println(S);
    }
}
