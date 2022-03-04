package config;

import java.util.Scanner;

public class Input {
  private static Scanner scanner = new Scanner(System.in);

  public static <T> String inputUser(T input) {
    System.out.print(input + ": ");
    String data = scanner.nextLine();
    return data;
  }
}
