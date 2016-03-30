package connectionToets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import java.time.*;



public class Test {

	public static void main(String[] args) {
		String main=null;
		String main1="Insert";
		String main2="Delete";
		String main3="Update";
		String main4="Retrieve";
	
		
		
		
		
		
		
		
		
		
		
		main=JOptionPane.showInputDialog(null,"Select option:"+"\n Insert  1."+"\n Delete  2."+"\n Update  3."+"\n Retrieve  4.");
		
		switch (main)
		
		
		
		{
		case "0":
			JOptionPane.showMessageDialog(null,"You selected nothing,system closing...");
			
			System.exit(0);
			
		
		break;
		
		case "1":
			
			Insert();
			
			JOptionPane.showMessageDialog(null,"Record added...");
		break;

		case "2":
			Delete();
			JOptionPane.showMessageDialog(null," Record Deleted!" );
			break;
			
			
			
		case "3":
			Update();
			JOptionPane.showMessageDialog(null,"Record updated... " );
			break;
		case "4":
			Retrieve();
			JOptionPane.showMessageDialog(null,"Record retrieved..." );
		break;
		}
		
		
		
	}
	
	public static void Insert  (){
		
		LocalDate date1 =LocalDate.now();
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
	      

			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Stan123");
						
			
			String studentId,name,surname,courseName,year_enrolled =null;
			
			studentId=JOptionPane.showInputDialog("Enter Student Number:");
			name=JOptionPane.showInputDialog("Enter Student Name:");
			surname=JOptionPane.showInputDialog("Enter Student Surname:");
			courseName=JOptionPane.showInputDialog("Enter Student Course name:");
			year_enrolled=JOptionPane.showInputDialog("Enter Year enrolled:");
			
			String sql=("INSERT INTO student_table(studentId,name,surname,courseName,year_enrolled) VALUES (?,?,?,?,?)");
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1,studentId);
			stmt.setString(2, name);
			stmt.setString(3,surname);
			stmt.setString(4, courseName);
			stmt.setString(5, year_enrolled);
			
			//JOptionPane.showMessageDialog(null, ""+studentId+""+ name+""+ surname+""+ courseName+" "+ year_enrolled);
 
	          System.out.print("Student Information:\n"+"=================================");
	          System.out.print("\nReg date       :" +date1);
	          System.out.print("\nStudent No      : " + studentId);
	          System.out.print("\nName            : " + name);
	          System.out.print("\nSurname         : " + surname);
	          System.out.println("\nCourse          : " + courseName);
	          System.out.println("\nYear enrolled   : " + year_enrolled);
	          System.out.print("=================================");
			
        	 stmt.executeUpdate();
           	 conn.close();
        	
        
	
		
	

		   }catch (Exception e)
		
		  {
			  
			//JOptionPane.showMessageDialog(null,"Connection to the DB failed! ");
            
			
		}
		
		
		
		
		
	}
	
	public static void Update (){
		
		try{
			
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
      

		conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Stan123");
					
		String studentId,name=null;
		
		studentId=JOptionPane.showInputDialog("Enter Student Number:");
		name=JOptionPane.showInputDialog("Enter Student Name:");
		
		String sql = "UPDATE student_table SET studentId=1123 WHERE name=Eldrin";
		
		PreparedStatement updateStmt = conn.prepareStatement( sql );
		
		updateStmt.executeUpdate( sql );
		
	    conn.commit();
		 
		  


		
		
	} catch (Exception e){
		
		
		}
	}
	
	public static void Delete(){
		
	
		 Connection conn = null;
		   Statement stmt = null;
		   
		   
		   try{
		      
		      Class.forName("com.mysql.jdbc.Driver");

		      
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Stan123");
		      
		      
		      String studentId=null;
				
				studentId=JOptionPane.showInputDialog("Enter Student Number:");
		      
		     

//		      while(rs.next()){
//		         
//		         int studentId  = rs.getInt("studentId");
//		         int name = rs.getInt("name");
//		         String surname = rs.getString("surname");
//		         String courseName = rs.getString("courseName");
//		         
//		       //Display values
//		         System.out.print("ID: " + studentId);
//		         System.out.print(", Name: " + name);
//		         System.out.print(",  Surname: " + surname);
//		         System.out.println(", Course Name: " + courseName);
//		         
//		      }

		   }catch(Exception e){
		    	  
		    	 
		 }
		   
	}
		
	
	
	public static void Retrieve(){
		
		
		Connection conn = null;
		   Statement stmt = null;
		   
		   
		   try{
		      
		      Class.forName("com.mysql.jdbc.Driver");

		      
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Stan123");
		      System.out.println("Connected database successfully...");
		      
		

		      String sql = "SELECT studentId, name, surname, courseName FROM student_table";
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
	         
	         int id  = rs.getInt("StudentId");
	         int age = rs.getInt("name");
	         String first = rs.getString("surname");
	         String last = rs.getString("courseName");
	         
	      }
		

	   }catch(Exception e){
		
		   
	   }	 
		
		
	}

}


