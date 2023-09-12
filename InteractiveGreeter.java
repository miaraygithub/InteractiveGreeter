import java.util.Scanner; //We're gonna need scanner objects, so better import those bad bois

public class InteractiveGreeter { //Naming our public class what the assignment said
    public static void main(String[] args) { //main method, the big cahoona
        //Establishing variables for all the needed user inputs
        String userName;
        String userHome;
        int userAge;
        String userActivity;
        double userDonation;
        Scanner sc = new Scanner(System.in); //setting up our scanner object, called sc

        System.out.println("What is your name? "); //prompt user for name
        userName = sc.nextLine(); //store name in userName
        System.out.println("Where are you from? "); //prompt user for hometown/state/whatever
        userHome = sc.nextLine(); //store location in userHome
        System.out.println("How old are you (years)? "); //prompt user for age in years
        userAge = sc.nextInt(); //store the int part of the user input (the part we want)
        sc.nextLine(); //'burning' the 'leftovers' from the userAge input if there are String (an extra space, the word years, etc) symbols unused by the nextInt method.
        System.out.println("Hello " + userName + " from " + userHome + ". You are " + userAge + " years old."); //use all the inputed info to greet user

        System.out.println("What's something you like to do? "); //prompt user for fav activity
        userActivity = sc.nextLine(); //store user response in userActivity
        System.out.println("Have fun next time you " + userActivity + "!"); //wish user luck on their next activity

        System.out.println("How much would you like to donate today? "); //prompt user for donation amount (double)
        userDonation = sc.nextDouble(); //store response
        System.out.println("You will donate $" + userDonation + " today. Yay!"); //regurgitate donation amount back to them.
    }
}
