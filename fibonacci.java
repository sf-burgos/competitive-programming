import java.util.Scanner;

class fibonacci {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int A = in.nextInt();
    int B = in.nextInt();
    int N = in.nextInt();
    System.out.println(fib(A,B,N));
  }

  public static int fib(int initial, int second, int number){
    if (number==0){
      return initial;
    }else if (number==1){
      return second;
    }else{
      return fib(initial, second, number-1) + fib (initial, second, number-2);
    }
  }
}