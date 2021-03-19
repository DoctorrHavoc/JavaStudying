package cinema;
import java.util.Scanner;
public class Cinema {

    public static void main(String[] args) {
        int nRows=0, nSeats=0;
        Scanner get = new Scanner((System.in));

        System.out.println("Enter the number of rows:");
        nRows = get.nextInt();
        System.out.println("Enter the number of seats in each row:");
        nSeats = get.nextInt();

        if (nRows*nSeats<60){
            System.out.println("Total income: \n $" + (nRows*nSeats)*10);
        }
        else {
            if(nRows%2==0){
                System.out.println("Total income: \n $" + ((nRows/2)*nSeats*10+(nRows/2)*nSeats*8));
            }
            else{System.out.println("Total income: \n $" + ((nRows/2)*nSeats*10+(nRows/2+1)*nSeats*8));}
        }
    }
}
