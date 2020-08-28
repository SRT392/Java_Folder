//importing the scanner to take inputs from the keyboard/user.
import java.text.DecimalFormat;
import java.util.Scanner;

public class F_to_C_Conversion {
    public static void main (String[] args) {
        // String response is letting java know that the response will be a string.
        String response;
        // letting the program know that the variable temp will be a floating point integer.
        float temp;
        //format for the result to be .xx two decimals accuracy like requested.
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        // this section of code will ask the user to enter a temp. to convert, scanner will take in the input, variable temp will
        //become the number entered. Next temp will run the formula for conversion and print out the result.
        //next it will ask whether the user wants to run another conversion or not. it will close out if no is selected.
        do {
            System.out.println("Enter temperature to convert to Celsius: ");
            Scanner input = new Scanner(System.in);
            temp = input.nextFloat();
            temp = ((temp - 32) * 5 / 9);

            System.out.println("The converted temperature is: " + (df.format(temp)) + " Celsius.");

            System.out.println("\nDo you want to do another conversion? Yes/No");
            response = input.next();

        }
        //this piece of code will keep running the "do" part everytime the user times in Yes or yes for the answer.
        while (response.equalsIgnoreCase("Yes"));
        //otherwise it will exit out and say program closing.
        System.out.println("Program closing.... .... .... .... .... .... .... .... ...." +
                "\nThank you, Have a good day!");
        System.out.println("\nHello Instructor White, This is INF231 Final Assignment for: Roman Artemenko");
    }
}
