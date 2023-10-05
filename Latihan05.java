import java.util.Arrays;
import java.util.Scanner;

public class Latihan05 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int angka1, angka2, angka3;
        angka1 = scan.nextInt(); angka2 = scan.nextInt(); angka3 = scan.nextInt();

        int[] tableUrutan = {angka1, angka2, angka3};
        
        Arrays.sort(tableUrutan);

        System.out.printf("%d, %d, %d", tableUrutan[0], tableUrutan[1], tableUrutan[2]);
    }
}