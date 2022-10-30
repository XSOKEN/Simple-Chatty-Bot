import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

            String first_name = scanner.next();
            String years_of_experience = scanner.next();
            String cuisine_preference = scanner.next();

            System.out.println("The form for " + first_name + " is completed. We will contact you if we need a chef who cooks " + cuisine_preference + " dishes and has " + years_of_experience + " years of experience.");
    }
}