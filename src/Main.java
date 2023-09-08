import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", where are you from?");
        String location = sc.nextLine();
        System.out.println("How old are you, " + name + "?");
        String age = sc.nextLine();
        System.out.println("Good morning, " + name + ", you are from " + location + " and are " + age + " years old! Nice to meet you!");
        System.out.println("What is your favorite activity?");
        String activity = sc.nextLine();
        System.out.println("Have an excellent time next time you go " + activity + ", " + name + "!");
        System.out.println("How much would you like to donate today, " + name + "?");
        double donation = Double.parseDouble(sc.nextLine());
        System.out.println("Thanks for donating $" + donation + ". Have a great day!");
        }
    }