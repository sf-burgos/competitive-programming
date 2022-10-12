import java.util.*;
import java.io.*;
import java.math.*;

/**
 ALPHABET Pyramid
 
 A
 AB
 ABC
 ABCD
 ...
 **/
class Solution {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    char start = 'A' - 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        char ch = (char) (start + j);
        System.out.print(ch);
      }
      System.out.println();
    }

  }
}