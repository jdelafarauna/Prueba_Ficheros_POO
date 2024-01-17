import java.io.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader in = new BufferedReader(new FileReader("ficheroEntrada.txt"));
            String s = new String();
            StringBuffer s2 = new StringBuffer();
            while(s != null){
                s = in.readLine();
                s2.append(s + "\n");
            }
            System.out.println(s2);
            in.close();

            //System.out.println(st);

            PrintStream flujo;
            flujo = new PrintStream (new FileOutputStream("ficheroSalida.txt"));
            flujo.print(s2);
            flujo.close();
        } catch (IOException e ){}






        }


    }


