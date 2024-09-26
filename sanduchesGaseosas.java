import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class SanduchesGaseosas {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int i = 0; i < T; i++) {
      int A = in.nextInt();
      int B = in.nextInt();
      if(A%B==0 || B%A==0){
        System.out.println("YES");
      }
      System.out.println("NO");
    }
  }
}