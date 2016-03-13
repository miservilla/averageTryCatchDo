import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String stringNumber;
        double avg;
        double count = 0;
        double number, sumNumber = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numbers to average, enter '*' to calculate average:");

        do {
            stringNumber = in.next();
            if (TryParseIn(stringNumber)) {
                number = Double.parseDouble(stringNumber);
                sumNumber = sumNumber + number;
                count++;
            }
        } while (!stringNumber.equals("*"));

//        while (!stringNumber.equals("*"))
//        {
//            if (TryParseIn(stringNumber)){
//                number = Double.parseDouble(stringNumber);
//                sumNumber = sumNumber + number;
//                count++;
//            }
//            stringNumber = in.next();
//        }
        avg = sumNumber/count;

        System.out.println("The average is " + avg);
    }


    private static boolean TryParseIn(String number){
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            if (!number.equals("*")) {
                System.out.println("Value can't be parsed as a number, please try again!");
            }
            return false;
        }


    }
}
