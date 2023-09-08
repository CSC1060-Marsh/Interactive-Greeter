import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            //This adds a new scanner system.
        Scanner sc = new Scanner(System.in);

            //This asks the first question, "What's your name?" to the user.
        System.out.println("Hello! What's your name?");

            //This defines the user's next input as the string "name".
        String name = sc.nextLine();

            //This prints out the line asking where the user is from.
        System.out.println("Hello " + name + ", where are you from?");

            //This defines the user's input to the previous question as the string "location".
        String location = sc.nextLine();

            //This asks the user their age.
        System.out.println("How old are you, " + name + "?");

            //This defines the user's answer to the above question as the string "age".
        String age = sc.nextLine();

            //This sends a message to the user including their inputs for name, location, and age.
        System.out.println("Good morning, " + name + ", you are from " + location + " and are "
                + age + " years old! Nice to meet you!");

            //This asks the user about their favorite activity.
        System.out.println("What is your favorite activity?");

            //This defines the previous response as the string "activity".
        String activity = sc.nextLine();

            //This tells the user to have fun the next time they do the above activity.
        System.out.println("Have an excellent time next time you go " + activity + ", " + name + "!");

            //This asks the user how much they would like to donate.
        System.out.println("How much would you like to donate today, " + name + "?");

            //This defines the user's next input as a double, accounting for donations with decimals.
        double donation = Double.parseDouble(sc.nextLine());

            //This thanks the user for donating and wishes them well.
        System.out.println("Thanks for donating $" + donation + "0. Have a great day, " + name + "!");

        }
    }