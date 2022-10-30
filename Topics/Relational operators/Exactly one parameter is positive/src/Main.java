import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean a1 = a > 0 && b <= 0 && c <= 0;
        boolean b1 = a <= 0 && b > 0 && c <= 0;
        boolean c1 = a <= 0 && b <= 0 && c > 0;


        boolean result = a1 || b1 || c1;


        System.out.println(result);


    }
}