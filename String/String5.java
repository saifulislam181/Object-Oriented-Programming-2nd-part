/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string5;

/**
 *
 * @author User
 */
public class String5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="foobar";
        if(s.startsWith("foo")){
            System.out.println("foo is the first substring");
        }
        if(s.endsWith("bar")){
            System.out.println("bar is the last substring");
        }
        s="    hello    are you ok?    ";
        s=s.trim();
        System.out.println(s);
        // TODO code application logic here
    }
    
}
