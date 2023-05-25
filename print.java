import java.util.Scanner;

public class print {
    public print() {
    }

    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number " + n + " is Even Number");
        } else {
            System.out.print("The number " + n + " is odd nnumber");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "print[]";
    }

}
