// 16.WAP to find number of days in a month using switch statement.

import java.util.Scanner;
public class Program16{

public static void main(String...k){

System.out.println("Enter month number (1-12): ");

Scanner sc=new Scanner(System.in);
int month=sc.nextInt();
 switch (month) {
    case 1: // January
    case 3: // March
    case 5: // May
    case 7: // July
    case 8: // August
    case 10: // October
    case 12: // December
      System.out.println("31 days\n");
      break;
    case 4: // April
    case 6: // June
    case 9: // September
    case 11: // November
      System.out.println("30 days\n");
      break;
    case 2: // February
      System.out.println("28 or 29 days (depending on leap year)\n");
      break;
    default:
      System.out.println("Invalid month number\n");
  }

}

}
