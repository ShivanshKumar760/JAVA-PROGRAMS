public class Main {
    public static void main(String[] args) {
        /*
        Java Do while loop syntax is :
        do{
            statement to execute ;
            update iterator command;
           }while(condition);

           note : this loop will run atleast one time.
         */
        int i=0;
        do {
            System.out.println(i);
            i++;

        }while(i<=20);

        //example of False condition and still loop will run once.
        System.out.println("New Command");
        do {
            System.out.println(i);
        }
        while(i<10);
    }
}
