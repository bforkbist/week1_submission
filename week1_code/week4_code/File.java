import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;
class CSV{
    public static void main(String[] args) {
        try{
                final FileReader myRead = new FileReader("q2sample.csv");
                final Scanner in = new Scanner(myRead);
                String e="raisedAmt";
                Vector<Long> v=new Vector<>();
                String[] s= in.next().split(",");
                String[] data ;
                int p=0;
                for(int i=0;i<s.length;i++){
                    if(e.equals(s[i])) {
                        p=i;
                    }
                }
                final FileReader myRead1 = new FileReader("q2sample.csv");
                final Scanner in1 = new Scanner(myRead1);
                int y=0;
                while (in.hasNextLine()){
                    try{
                    data = in1.nextLine().split(",");}
                    catch(NoSuchElementException j){
                        break;
                    }
                    if(y==0){
                        y++;
                        continue;
                    }
                    try{v.add(Long.parseLong(data[p]));
                    }
                    catch(NumberFormatException q){
                        break;
                    }
                        
                }
                long max=0,min;
                for(long j : v){
                    if(max<j){
                        max=j;
                    }
                }
                min=max;
                for(long j : v){
                    if(min>j){
                        min=j;
                    }
                }
                System.out.println("MAX="+max+" MIN="+min);
                in.close();
        } catch(FileNotFoundException e){
                System.out.println("error");
                e.printStackTrace();
        }
    }
}