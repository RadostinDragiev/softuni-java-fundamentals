package L06_Objects_and_Classes_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06VehicleCatalogue {
    static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", type.substring(0, 1).toUpperCase() + type.substring(1), model, color, horsepower);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();
        String input = scanner.nextLine();
        int carsCount = 0;
        int carsHorsepower = 0;
        int truckCount = 0;
        int truckHorsepower = 0;
        while (!input.equals("End")) {
            String[] inputArr = input.split("\\s+");
            Vehicle vehicle = new Vehicle(inputArr[0], inputArr[1], inputArr[2], Integer.parseInt(inputArr[3]));
            vehicles.add(vehicle);
            if (inputArr[0].equals("car")) {
                carsCount++;
                carsHorsepower += Integer.parseInt(inputArr[3]);
            } else {
                truckCount++;
                truckHorsepower += Integer.parseInt(inputArr[3]);
            }

            input = scanner.nextLine();
        }

        String inputCatalogue = scanner.nextLine();
        while (!inputCatalogue.contains("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(inputCatalogue)) {
                    System.out.println(vehicle);
                }
            }
            inputCatalogue = scanner.nextLine();
        }

        double carsAverageHP = 0;
        if (carsCount > 0) {
            carsAverageHP = carsHorsepower / (double) carsCount;
        }


        double trucksAverageHP = 0;
        if (truckCount > 0) {
            trucksAverageHP = truckHorsepower / (double) truckCount;
        }
        System.out.println(String.format("Cars have average horsepower of: %.2f.", carsAverageHP));
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", trucksAverageHP));
    }
}
