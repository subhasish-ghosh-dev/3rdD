package firstclass;

public class Student {
	
	protected int rollNo;
    protected String name;
    protected String semester;
    private String CGPA;

    public Student(){           
        System.out.println("STUDENT HAVE BEEN CALLED.");   
            
    }

    public Student(int r, String n, String s, String CGPA){
        System.out.println("INIT");
        this.rollNo=r;
        this.name=n;
        this.semester=s;
        this.CGPA=CGPA;
    }
    
    

    protected String getCGPA(){
        return this.CGPA;
    }
/*
    protected void setCGPA(String CG){
        this.CGPA = cg;
    }*/

    protected void displayInfo(){
        System.out.println(this.rollNo+" , "+this.name+"  , "+this.semester);
    }
}
