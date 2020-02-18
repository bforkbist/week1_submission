package week1_code.code5_consultadd_training;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i= in.nextInt();
        if( i < 1100){
            if(i%3==0 && i%5==0){
                System.out.println("ConsultaddTraining");
            }
            else if(i%3==0){
                System.out.println("Consultadd");
            }
            else if(i%5==0){
                System.out.println("Training");
            }
        }
        
        in.close();
    }
}