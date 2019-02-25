package creational_factory_pattern;

import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactoryPattern getPlanFactoryPattern = new GetPlanFactoryPattern();
        Scanner scanner = new Scanner(System.in);
        System.out.println("> enter plan name: ");
        String planName = scanner.nextLine();
        System.out.println("> enter plan units: ");
        int units = Integer.parseInt(scanner.nextLine());
        Plan planChoosen = getPlanFactoryPattern.getPlan(planName);
        double totalRate = planChoosen.calculateBill(units);
        System.out.println("> generated bill (total): " + totalRate);
    }
}
