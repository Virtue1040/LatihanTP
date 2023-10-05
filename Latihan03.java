import java.util.Scanner;

public class Latihan03 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double bilanganRiil;
        bilanganRiil = scan.nextDouble();
        bilanganRiil += 0.4;
        int bilanganBulat = (int) bilanganRiil;
        
        System.out.printf("Pembulatan : %d", bilanganBulat);
    }
}