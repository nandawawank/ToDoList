package utils;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static String input (String info) {
        System.out.println("Info : " + info);
        String data = scanner.nextLine();
        return data;
    }
}
