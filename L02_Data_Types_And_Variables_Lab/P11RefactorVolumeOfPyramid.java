package L02_Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenght, width, height = 0;
        System.out.print("Length: ");
        lenght = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());

        double volume = (lenght * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
