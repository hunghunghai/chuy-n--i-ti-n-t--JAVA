import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("USD ");
        int rate = 23000;
        int USD = scanner.nextInt();
        int VND = USD * rate;
        System.out.println("VND " + VND);
    }
}
