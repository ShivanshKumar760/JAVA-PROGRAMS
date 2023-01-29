public class Main {
    public static void main(String[] args) {
        /*
        The for each loop is used to traverse array or collection in java
        It is easier to use then simple for loop because we wont need to
        increment value and use subscript notation.

        it work on the basis of element and not the index .It returns element one by
        one in the defined Variable.

         */

        /*
        Syntax is :
        for(data_type variable_iterator : array_name)
        {
            //stmt;
        }
         */

        int arr[]={1,3,4,5,6,8};
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}