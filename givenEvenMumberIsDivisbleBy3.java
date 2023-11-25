import java.util.Scanner;

public class givenEvenMumberIsDivisbleBy3 {
    public static void main(String[] args) {
        System.out.println("Enter how many");
        Scanner scanner=new Scanner(System.in);
        int value= scanner.nextInt();

       /* // value= Integer.parseInt(scanner.next());
        for(int i=1;i<=10;i++)
        {
            System.out.println(value+"*"+i+"="+value*i);
        }*/
        if(value%2==0&& value%3==0)
        {
            System.out.println("The number is divisible by 6");
        }
        else {
            System.out.println("the number is not divisible by 6");
        }

    }
}
