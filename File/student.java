
public class student {
    public int id;
    public String name;
    public String current_trimester;
    public student(){}
    public student(int id,String name, String current_trimester){
        this.id=id;
        this.name=name;
        this.current_trimester=current_trimester;
    }
    public String toString(){
        return "Student id "+this.id+" name "+this.name+" current trimester "+this.current_trimester;
    }
}
