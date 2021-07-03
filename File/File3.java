/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author User
 */
public class File3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("C:\\Users\\User\\Downloads\\Compressed\\code\\ok.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        String s1="";
        while((s = br.readLine()) != null) {
            System.out.println(s);
            s1+=s.toUpperCase();
            s1+="\n";
        }
        fr.close();
        FileWriter f0 = new FileWriter("file3.txt");
        f0.write(s1);
        
        f0.close();

        }

}

    
        