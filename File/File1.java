/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file1;

import java.io.File;

/**
 *
 * @author User
 */
public class File1 {
    static void p(String s) {
System.out.println(s);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //File f1=new File("C:\\Users\\User\\Downloads\\Documents");
        File f1=new File("ok.txt");
        p("File Name: " + f1.getName());
        p("Path: " + f1.getPath());

        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "does not exist");
        p(f1.canWrite() ? "is writeable" : "is not writeable");
        p(f1.canRead() ? "is readable" : "is not readable");
        p("is " + (f1.isDirectory() ? " a directory" : "not" + " a directory"));

        p("File size: " + f1.length() + " Bytes");
        /*int a=20;
        int b=10;
        System.out.println((a>b)?a:b);*/
        // TODO code application logic here
    }
    
}
