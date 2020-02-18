package week1_code.code1_palindrome;

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        String str = in.next();
        char[] a=str.toCharArray();
        int n=a.length;
        int i=0,j=n-1,count=0;
        while(i!=j){
        	if(a[i]!=a[j])
        		break;
            else{    
                count++;
                i++;
                j--;
            }
        }
        if(count==n/2)
            System.out.println("true");
        else 
            System.out.println("false");
        in.close();
    }
}