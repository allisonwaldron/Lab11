package Lab;

import java.util.Scanner;

public class Hello {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                String userName;
                System.out.print("Hello. What is your name? ");
                userName = scanner.next();
                System.out.print("It's nice to meet you, " + userName + ". How old are you? ");
                String userAge;
                userAge = scanner.next();
                System.out.println("I see that you are still quite young at only " + userAge + ".");
                System.out.print("Where do you live? ");
                String userLocation;
                userLocation = scanner.next();
                System.out.print("Wow! I've always wanted to go to " + userLocation + ". Thanks for chatting with me. Bye!");

            }
        }




