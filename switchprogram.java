import java.util.Scanner;
public class switchprogram {
    public static void main(String[] args) {
System.out.println("Enter the month and year to find no. of days in the month:");
Scanner s=new Scanner(System.in);
int month=s.nextInt();
int year=s.nextInt();
int leap_year=0;
if(year%4==0) {
    leap_year = 29;
}
else {
    leap_year = 28;
}
switch(month)
{
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12: System.out.println(31 +"Days");
        break;
    case 2: System.out.println(leap_year+" Days");
    break;
    case 4:
    case 6:
    case 9:
    case 11:
            System.out.println(30 +"Days");
    break;
    default: System.out.println("Try Again!");
  break;
}
}
}