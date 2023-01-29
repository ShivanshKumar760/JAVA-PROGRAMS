import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        //input based if and else-if condition  using String equal operator
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        if(city.equals("Merrut"))
        {
            System.out.println("City is Merrut");
        }
        else if (city.equals("Delhi"))
        {
            System.out.println("City is Delhi");
        }
        else
        {
            System.out.println("City is Noida");
        }

         */


        String city = "Delhi";

        if (city == "Merrut")
        {
            System.out.println("City is Merrut");
        }

        else if(city == "Delhi")
        {
            System.out.println("City is Delhi");
        }

        else
        {
            System.out.println("City is Noida");
        }
    }
}