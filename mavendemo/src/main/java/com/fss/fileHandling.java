package com.fss;
import java.io.File;
import java.util.Scanner;

public class fileHandling {

    public static void main(String[] args) {
        File f = new File("./newfile.txt");

        try {
            f.createNewFile();
           // f.deleteOnExit();

            // FileWriter fw  = new FileWriter(f);
            // fw.append("console");
            // fw.close();

            // FileReader fr =new FileReader(f);
            // while (fr.read()!=-1) {
            //     System.out.println((char)fr.read());
            // }

            // fr.close();


            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
               System.out.println(sc.hasNextLine()); 
            }
            sc.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
