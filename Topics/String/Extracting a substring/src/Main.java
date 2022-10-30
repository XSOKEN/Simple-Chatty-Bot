import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String word3 = word1.substring(a, ++b);

        System.out.println(word3);
    }
}