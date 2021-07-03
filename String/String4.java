/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string4;

/**
 *
 * @author User
 */
class A{
    int x;
}
public class String4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1=new String("abac");
        String s2=new String(s1);
        if(s1==s2){
            System.out.println("==  working");
        }if(s1.equals(s2)){
            System.out.println("equals working");
        }
        /*A a=new A();
        a.x=90;
        A b=a;
        b.x=100;
        System.out.println(a.x);
        
        String s3=new String("aba");
        String s4=s3;
        s4=s4.replace("a","tt");
        System.out.println(s4);
        System.out.println(s3);*/
        // TODO code application logic here
    }
    
}
