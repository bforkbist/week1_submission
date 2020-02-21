import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Pattern{
    public static void main(String[] args) {
        try{
            final FileReader myRead = new FileReader("q3sample.csv");
            final Scanner in = new Scanner(myRead);
            Scanner in1 = new Scanner(System.in);
            String s = in1.next();
            int line =0;
            while (in.hasNextLine()){
                line++;
                String data = in.nextLine();
                if(data.contains(s))
                    System.out.println("line no. = "+line+" ,"+data);
            }
            in.close();
        } catch(FileNotFoundException e){
            System.out.println("error");
            e.printStackTrace();
        }

    }
}