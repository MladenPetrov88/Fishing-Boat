import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        double result = 0;
        if (season.equals("Spring")) {
            if (fisherman <= 6) {
                result = 3000 - 3000 * 0.10;
            } else if (fisherman >= 7 && fisherman <=11) {
                result = 3000 - 3000 * 0.15;
            } else {
                result = 3000 - 3000 * 0.25;
            }

        } else if (season.equals("Summer") || season.equals("Autumn")) {
            if (fisherman <= 6) {
                result = 4200 - 4200 * 0.10;
            } else if (fisherman >= 7 && fisherman <=11) {
                result = 4200 - 4200 * 0.15;
            } else {
                result = 4200 - 4200 * 0.25;
            }

        } else {
            if (fisherman <= 6) {
                result = 2600 - 2600 * 0.10;
            } else if (fisherman >= 7 && fisherman <=11) {
                result = 2600 - 2600 * 0.15;
            } else {
                result = 2600 - 2600 * 0.25;
            }

        }
        if (!season.equals("Autumn") && fisherman % 2 == 0) {
            result = result - result * 0.05;
        }
            double moneyLeft = budget - result;
            double moneyNeed = result - budget;
        if (budget >= result) {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
        }

    }
}
