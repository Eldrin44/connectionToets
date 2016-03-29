package student;
import javax.faces.applications.FaceMessage;
public class Student {
	
	private int studentId;
    private String name;
    private String surname;
    private String courseName;
    private String year_enrolled;
    private String IdNum;
    private String PhysicalAddress;
    private String PostalAddress;
     private String Zip_code;
    
    public Student(){}
    
     public Student(int studentId,String name,String surname,String courseName,
             String year_enrolled,String IdNum,String PhysicalAddress,String PostalAddress,
             String Zip_code){
         this.studentId=studentId;
         this.name=name;
         this.surname=surname;
         this.courseName=courseName;
         this.year_enrolled=year_enrolled;
         this.IdNum=IdNum;
         this.PhysicalAddress=PhysicalAddress;
         this.PostalAddress=PostalAddress;
         this.Zip_code=Zip_code;
         
     }
        public Student( Student student){
            
            this.studentId=student.getStudentId();
        
        
        
        }

		private int getStudentId() {
			// TODO Auto-generated method stub
			return 0;
		}
	

}
