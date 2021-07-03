/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapbasic;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author User
 */
public class MapBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(10,new Player("Messi",100000.0,10));
        hm.put(9,new Player("Dybala",549898450,21));
        hm.put(100,new String("Rahman"));
        hm.put("karim", "Bangladesh");
        Object o=hm.get(9);
        System.out.println(o);
        o=hm.get(100);
        System.out.println(o);
        o=hm.get("karim");
        System.out.println(o);
        // TODO code application logic here
    }
    
}
