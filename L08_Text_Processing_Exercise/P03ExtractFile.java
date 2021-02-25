package L08_Text_Processing_Exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int dotIndex = input.lastIndexOf(".");
        int slashIndex = input.lastIndexOf("\\");

        String fileName = input.substring(slashIndex + 1, dotIndex);
        String fileExtension = input.substring(dotIndex + 1);

        System.out.printf("File name: %s%nFile extension: %s", fileName, fileExtension);
    }
}
