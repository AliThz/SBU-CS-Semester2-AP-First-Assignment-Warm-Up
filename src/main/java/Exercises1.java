public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        if (n == 1 || n == 0)
            return 1;

        return n * factorial(n - 1);
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        char[][] starTable = new char[rows][];

        for (int i = 0; i < rows; i++) {
            starTable[i] = new char[i + 1];
            for (int j = 0; j < i + 1; j++) {
                starTable[i][j] = '*';
            }
        }

        return starTable;
    }


    public static void main(String[] args) {
        // test your code here!
    }

}