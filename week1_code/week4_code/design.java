import java.util.Scanner;

class Pattern{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r=in.nextInt(),c=in.nextInt();
        int count =0,count1=0;
        for(int i=0;i<r/2;i++){
            for(int j=1;j<(c/2)-(3*i);j++)
                System.out.print("-");
            for(int k=0;k<count;k++){
            	System.out.print(".|.");
            }
            count++;
            System.out.print(".|.");
            for(int k=0;k<count1;k++){
            	System.out.print(".|.");
            }
            count1++;
            for(int j=1;j<(c/2)-(3*i);j++)
                System.out.print("-");
            System.out.println("");
        }
        int t=(c-7)/2;
        for(int i=0;i<t;i++)
        	System.out.print("-");
        System.out.print("WELCOME");
        for(int i=0;i<t;i++)
        	System.out.print("-");
        System.out.println("");

        for(int i=0;i<(r/2);i++){
            for(int j=3*(i+1);j>0;j--)
                System.out.print("-");
            for(int k=count-1;k>0;k--){
            	System.out.print(".|.");
            }
            count--;
            System.out.print(".|.");
            for(int k=count1-1;k>0;k--){
            	System.out.print(".|.");
            }
            count1--;
            for(int j=3*(i+1);j>0;j--)
                System.out.print("-");
            System.out.println("");
        }
        in.close();
    }
}
