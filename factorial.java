import java.util.*;
import java.io.*;
import java.math.*;

class fact {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long fact = 1;
        for (int i = 2; i<=N; i++)
            fact = fact*i;
        System.out.println(fact);
    }
}