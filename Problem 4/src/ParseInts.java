

import java.util.Scanner;

public class ParseInts {

    public static void main(String[] args) {

        int val, sum = 0;

        Scanner scan = new Scanner(System.in);

        String line;

        System.out.println("Enter a line of text");

        line = scan.nextLine();

        Scanner scanLine = new Scanner(line);

        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Do nothing for non-integer tokens
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}
