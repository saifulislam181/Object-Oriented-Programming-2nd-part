/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapbasic;

/**
 *
 * @author User
 */
class Player {
    public String name;
    public double salary;
    public int jersey_number;
    public Player(){
        
    }
    public Player(String name,double salary, int jersey_number){
        this.name=name;
        this.salary=salary;
        this.jersey_number=jersey_number;
    }
    public String toString(){
        return "Player name "+this.name+" salry "+Double.toString(salary)+" Jersey number "+Integer.toString(this.jersey_number)+"\n";
    }
    
}
