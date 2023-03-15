import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner skan = new Scanner(System.in);

    System.out.println("Podaj liczbe a:");
    int a = skan.nextInt();

    System.out.println("Podaj liczbe b:");
    int b = skan.nextInt();

    System.out.println("Podaj liczbe c:");
    int c = skan.nextInt();

    if (a > b && a > c) {
      System.out.println("Najwieksza liczba: " + a);
    }
    if (b > a && b > c) {
      System.out.println("Najwieksza liczba: " + b);
    } else
      System.out.println("Najwieksza liczba: " + c);
  }
}