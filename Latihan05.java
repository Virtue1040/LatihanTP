import java.util.Arrays;
import java.util.Scanner;

public class Latihan05 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //
        int angka1, angka2, angka3, urutan1, urutan2, urutan3;
        angka1 = scan.nextInt(); angka2 = scan.nextInt(); angka3 = scan.nextInt();
        urutan1 = angka1; urutan2 = angka2; urutan3 = angka3;

        int[] tableUrutan = {angka1, angka2, angka3};
        
        Arrays.sort(tableUrutan);

        if (angka1 < angka2) {
            urutan1 = angka2;
            urutan2 = angka3;
            urutan3 = angka1;
            if (angka2 < angka3) {
                urutan1 = angka3;
                urutan2 = angka2;
                urutan3 = angka1;
            }
        }
        if (angka2 < angka1) {
            urutan1 = angka3;
            urutan2 = angka1;
            urutan3 = angka2;
            if (angka3 < angka1) {
                urutan1 = angka1;
                urutan2 = angka3;
                urutan3 = angka2;
            }
        }
        if (angka3 < angka1) {
            urutan1 = angka1;
            urutan2 = angka2;
            urutan3 = angka3;
            if (angka1 < angka2) {
                urutan1 = angka2;
                urutan2 = angka1;
                urutan3 = angka3;
            }
        }
        

        System.out.printf("%d, %d, %d", urutan3, urutan2, urutan1);
    }
}