/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostring;

/**
 *
 * @author User
 */
class person {
    public int NID;
    public String name;
  public  person(){
        
    }
    public person(int NID,String name){
        this.NID=NID;
        this.name=name;
    }
    public String toString(){
        return "person's name"+this.name+"\t NID"+Integer.toString(NID);
    }
}
