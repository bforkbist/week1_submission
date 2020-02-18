package week1_code.code4_replace_vowel;


import java.util.Scanner;

class Vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        char a=in.next().charAt(0);
        char[] b=s.toCharArray();
        for(int i=0 ;i<b.length;i++){
            if(b[i]=='a' || b[i]=='e' || b[i]=='i' || b[i]=='o' || b[i]=='u' || b[i]=='A' || b[i]=='E' || b[i]=='I' || b[i]=='O' || b[i]=='U'){
                b[i]=a;
            }
        }
        String g= String.valueOf(b);
        System.out.println(g);
        in.close();
    }
}