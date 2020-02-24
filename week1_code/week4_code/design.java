import java.util.Scanner;

class Pattern{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r=in.nextInt(),c=in.nextInt();
        for(int i=0;i<r/2;i++){
            for(int j=0;j<(c/2)-1;j++)
                System.out.print("-");
            System.out.print(".|.");
            for(int j=0;j<c/2;j++)
                System.out.print("-");
            System.out.println("");
        }
        System.out.println("welcome");
        for(int i=0;i<r/2;i++){
            for(int j=0;j<(c/2)-1;j++)
                System.out.print("-");
            System.out.print(".|.");
            for(int j=0;j<c/2;j++)
                System.out.print("-");
            System.out.println("");
        }
        in.close();
    }
}
