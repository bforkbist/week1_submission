package week1_code.code3_sum_of_array;


import java.util.ArrayList;
import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0,i=0;
        char a;  
        ArrayList<String> n =new ArrayList<>();
        System.out.println("to enter press y else n");
        a=in.next().charAt(0);
        try{
            
            while( a == 'y'){
                n.add(in.next());
                sum=sum+Integer.parseInt(n.get(i));
                i++;
                System.out.println("to enter press y else n");
                a=in.next().charAt(0);
            }
        }catch (NumberFormatException e)  {
            System.out.println("Invalid input");
            e.printStackTrace(); 
        }
        System.out.println(sum);
            in.close();
        }
        
    }