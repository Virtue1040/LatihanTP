import java.util.Scanner;

public class Latihan01 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int bilanganBulat;
        String isNegativetext = "Negative";
        bilanganBulat = scan.nextInt();

        boolean isNegative = (bilanganBulat < 0);
        if (!isNegative) { isNegativetext = "Positive"; }
        
        System.out.printf("Bilangan %d adalah %s", bilanganBulat, isNegativetext);
    }
}