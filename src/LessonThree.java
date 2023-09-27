import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {

        int a;
        System.out.println("Enter the number: ");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        if (a % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");


        int t;
        System.out.println("Temp: ");

        t = input.nextInt();

        if (t > -5)
            System.out.println("Warm");
        else if (t < -20)
            System.out.println("Cold");
        else
            System.out.println("Normal");


        for (int z = 10; z <= 20; z++)
            System.out.println(z * z);

        int r = 7;
        while (r <= 98) {
            System.out.print (r+" ");
            r = r + 7;
        }
    }
}
