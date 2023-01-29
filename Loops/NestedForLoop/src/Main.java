public class Main {
    public static void main(String[] args) {
    //Nested for loop is a concept of having a for loop inside another for loop is used to print pattern or sequential
        //paired number

        /*
        Syntax of nested for loop:

        for (initialization;condition1;updation)//outer loop
        {
            for (initialization;condition2;updation)//inner loop1
            {
                    for (initialization;condition2;updation)//inner loop2
                    {
                        for(.....n)//till inner loop n
                        {
                        }
                     }
             }
         }


         a nested loop can have 2 or more than 2 inner loop
         */
        int i;
        int j;
        int k;

        for (i=1;i<=3;i++)
        {
            for (j=1 ;j<=3;j++)
            {

                for (k=1;k<=3;k++)
                {
                    System.out.println(i+" "+j+" "+k);
                }


            }
        }

        System.out.println(i);//since we declare i in main() block it will act as a global for outer for loop
        //so when value is initialized to i it will create a memory location in  main() cause outer for loop
        //is in main()
    //  System.out.println(j);//but although j is declared in main() the value initialized to j is in inner for loop
        //which/whose scope is limited to outer for loop  so value initialized to j will not reflect in main block
   //   System.out.println(k);
        //but although k is declared in main() the value initialized to k is in inner for loop
        //which/whose scope is limited to outer for loop  so value initialized to k will not reflect in main block

        System.out.println();
        System.out.println();
        for (i=1;i<=3;i++)
        {
            for (j=1;j<=3;j++)
            {
                System.out.println(i+" "+j);
            }
        }
    }
}