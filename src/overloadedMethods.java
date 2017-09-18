import java.util.Scanner;

public class overloadedMethods {
    public static void main (String[] args){
        System.out.println("1. Business");
        System.out.println("2. Residential");

        int buildingType = userInput2("Pick your building type: ");
        String businessName;
        String contactName;
        String phoneNumber;

        switch (buildingType){
            case 1:
                businessName = userInput("Enter business name");
                contactName = userInput("Enter contact name");
                phoneNumber = userInput("Enter phone number");
                System.out.println(building(businessName, contactName, phoneNumber));


                break;

            case 2:
                contactName = userInput("Enter contact name");
                phoneNumber = userInput("Enter phone number");
                System.out.println(building(contactName, phoneNumber));
                break;

            default:
                System.out.println("That is not an option");
                System.exit(42);
                break;
        }

    }

    static String userInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static int userInput2(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static String building (String contactName, String phoneNumber){
        String b1 = contactName;
        String b2 = phoneNumber;
        return "You have entered " + contactName + " and " + phoneNumber;
    }

    static String building (String businessName, String contactName, String phoneNumber){
        String b1 = businessName;
        String b2 = contactName;
        String b3 = phoneNumber;
        return "You have entered " + businessName + ", " + contactName + " and " + phoneNumber;
    }



}
