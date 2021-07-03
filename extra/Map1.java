/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author User
 */
public class Map1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put("rahim",10000);
        hm.put("karim",1989189);
        hm.put("raju",479349);
        Object o=hm.get("karim");
        System.out.println(o);
        
        // TODO code application logic here
    }
    
}
