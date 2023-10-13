import java.util.Scanner;

public class ctf {
    public ctf() {
    }

    public static void main(String[] args) {
        double tempCel = 0.0;
        double tempFar = 0.0;
        boolean loopValue = true;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Hello user please enter your temperature in celcius: ");
            if (reader.hasNextDouble()) {
                tempCel = reader.nextDouble();
                loopValue = false;
            } else {
                System.out.println("The value you entered is invalid. Please try again.");
                reader.nextLine();
            }
        } while(loopValue);

        tempFar = tempCel * 1.8 + 32.0;
        System.out.println("The value: " + tempCel + " in farenheit is: " + tempFar);
    }
}
