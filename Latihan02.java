import java.util.Scanner;
public class Latihan02 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int bilanganBulat;
        String isGenaptext = "Genap";
        bilanganBulat = scan.nextInt();

        int isGenap = (bilanganBulat %2);
        if (isGenap != 0) { isGenaptext = "Ganjil"; }
        
        System.out.printf("Bilangan %d adalah %s", bilanganBulat, isGenaptext);
    }
}