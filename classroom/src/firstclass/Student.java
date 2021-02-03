package firstclass;

public class Student {
	
	public int rollNo;
    public String name;
    public String semester;

    public Student(){

    }

    public Student(int r, String n, String s){
        this.rollNo=r;
        this.name=n;
        this.semester=s;
    }
	

    public void displayInfo(){
        System.out.println(this.rollNo+" , "+this.name+"  , "+this.semester);
    }
}
