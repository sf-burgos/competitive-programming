/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author brayan.burgosd
 */
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
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

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i--) {
                char ch = (char) (start + i);
                System.out.print(ch);
            }
            System.out.println();
        }


    }
}
