package Abst;
public class student extends person{
  private int StudenID;
  {
    super(nm,gen);
    this.StudentID=id;
  }
  public void Studying(){
    if(StudentID==0){
  System.out.println("Not Studying");
  }
    else{
      System.out.println("Persuing a Degree in Bachelor of Engineering");
      
    }
    }
  public static void main(String args[]){
    person student=new student("Priya","Female",0);
    person student1=new student("karan","Male",201021);
    person student2=new student("kumari","Female",101021);
    person student3=new student("ravi","Male",201661);
    student.Studying();
     student1.Studying();
     student2.Studying();
     student3.Studying();
  }
  }
} 
  }
}