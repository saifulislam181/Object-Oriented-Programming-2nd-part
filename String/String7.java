/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string7;

/**
 *
 * @author User
 */
public class String7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s=new String("bangladesh is a DeveLoped country and it is a beautiful country");
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a',2));
         System.out.println(s.indexOf("is"));
        System.out.println(s.indexOf("is",12));
        
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.lastIndexOf('a',47));
         System.out.println(s.lastIndexOf("is"));
        System.out.println(s.lastIndexOf("is",40));
        
        s=s.toUpperCase();
        System.out.println(s);
        s=s.toLowerCase();
        System.out.println(s);
        
        // TODO code application logic here
    }
    
}
