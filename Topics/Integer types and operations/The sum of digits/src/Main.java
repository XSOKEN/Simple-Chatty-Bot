import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int f = scanner.nextInt();

            int a = f / 100;
            int b = (f % 100) / 10;
            int c = ((f % 100) % 10) / 1;

            int sum = a + b + c;

            System.out.println(sum);


    }
}