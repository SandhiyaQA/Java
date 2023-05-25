import java.util.Scanner;
public class Rateofinterest {
    public static void main(String[] args) {
        System.out.println("Enter the following to calculate Rate of interest");
        Scanner s=new Scanner(System.in);
        System.out.println("Principle:");
int principle=s.nextInt();
System.out.println("Interest rate");
float interest=s.nextFloat();
System.out.println("period of time in months");
int time=s.nextInt();
float simpleinterest=(principle*interest*time)/100;
System.out.println("Calculated simple Interest is:"+simpleinterest);
    }
}