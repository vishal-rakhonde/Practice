/*4)Write a program that takes a number representing a weekday (1-7) and prints the name of the
weekday using switch-case. */

import java.util.Scanner;
public class WeekDays{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        //Write your logic here
        switch(day){
            default:
            System.out.println("Enter valid number");
            break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}