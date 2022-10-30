import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        String word3 = word1.replace(" ", "");
        String word4 = word2.replace(" ", "");
        System.out.println(word3.equals(word4));

    }
}