import java.util.Scanner;

public class Latihan06 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] main) {
        int x1,x2,y1,y2,hasilxy1, hasilxy2;;

        x1 = scan.nextInt();
        x2 = scan.nextInt();
        y1 = scan.nextInt();
        y2 = scan.nextInt();

        //rumus
        hasilxy1 = y1 - (x1);
        hasilxy2 = y2 - (x2);

        System.out.println((hasilxy1 + hasilxy2));
    }
}