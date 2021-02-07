package secondclass;


import firstclass.*;

public class FinalYearStudent extends CSEStudent {


    @Override
    protected void displayInfo(){ 
        System.out.println(this.rollNo+" , "+this.name+"  , "+this.semester+"  ,  "+getCGPA());
    }

    public static void main(String[] args){        
        FinalYearStudent fin = new FinalYearStudent();
        fin.displayInfo();
    }


}