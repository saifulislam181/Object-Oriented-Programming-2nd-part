/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string3;

/**
 *
 * @author User
 */
public class String3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1="hello";
        String s2="hELlo";
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("equal");
        }
        s1="Bangladeshfmiedesh";
        System.out.println(s1.indexOf("desh"));
        System.out.println(s1.lastIndexOf("desh"));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.substring(2, 6));
        System.out.println(s1.substring(2));
        String s3=new String(s2);
        System.out.println(s3.length());
        s3=s1+s2;
        System.out.println(s3);
        // TODO code application logic here
    }
    
}
