import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        FOR Loop-Java for loop is used to iterate a part of program several time if the number of iteration is fixed
        we use for loop


        lets understand this :

        suppose we want to print number from 1 to 10 the basic approch wil be to write print statement 10 times
        from 1 to 10

        like this :
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        but this is actually not a optimal way to do it cause firstly our code will become long actually too long
        ,it will be time-consuming ,and we will have to update our code always as per user requirement cause suppose
        first user wants to print from 1 to 10 and next day he/she wants to print number from 1 to 100 we will have to
        add more 90 print line not a optimal way

        instead we can generalize the repeating behaviour via using loop


        one type of loop is :
        for loop its syntax is:
        for(iterator_initialization;condition;updation)
        {
        }



         */

        //lets make a for loop for above program to print number from 1 to 10

        int i;
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        n=sc.nextInt();
        for (i=1;i<=n;i++)
        {
            System.out.println(i);
        }

    }

}