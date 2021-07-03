/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.pkg6;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class String6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String []s;
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        s=new String[n];
        String temp;
        for(int i=0;i<n;i++){
            s[i]=in.next();
        }
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i].compareTo(s[j])>0){
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.println("sorted order");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        // TODO code application logic here
    }
    
}
