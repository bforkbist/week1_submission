package week1_code.code2_armstrong;

import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),j=0;
        int k=n;
        while(n>10){
            int e=n%10;
            j=j+e*e*e;
            n=n/10;
        }

        j=j+n*n*n;
        if(j==k){
            System.err.println("True");
        }
        else
            System.out.println("False");
        in.close();
    }
}