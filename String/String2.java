/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string2;

/**
 *
 * @author User
 */
public class String2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] c={'a','b','c'};
        String s=new String(c);
        System.out.println(s);
        int age=22;
        double salary=88.2;
        s="My age is"+age+" and my salary is"+salary;
        System.out.println(s);
        c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
        // TODO code application logic here
    }
    
}
