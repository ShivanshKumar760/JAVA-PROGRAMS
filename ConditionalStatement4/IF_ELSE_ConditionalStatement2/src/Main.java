public class Main {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int num3 = 7;
        int sum = num1+num2;
        int add1 = sum+1;
        if(add1<=num3)
        {
            System.out.println("condition checked on a+b+1 ie "+((num1+num2)+(1))+" <= "+num3);
            System.out.println("the sum of "+num1+" , "+num2+" and "+1+" is not greater than "+num3);

        }
        else//else will get execute when if-block will return false based on the condition parameter passed in if()
        {
            System.out.println("the sum of "+num1+" , "+num2+" and "+1+" is  greater than "+num3);

        }
    }
}