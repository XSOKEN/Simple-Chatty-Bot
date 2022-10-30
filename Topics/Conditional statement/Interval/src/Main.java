import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        boolean interval = (a > -15 && a <= 12) || (a > 14 && a < 17) || (a >= 19);
        if (interval) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }




    }
}