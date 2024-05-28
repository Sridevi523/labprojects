import java.io.*;
 public class StudentId implements Serializable{
	 public StudentId() {
		super();
		
	}


	public int getId() {
		return id;
	}


	public String getStudentName() {
		return StudentName;
	}


	public boolean isActive() {
		return active;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	private int id ;
	 private String StudentName;
	 private boolean active ;
	 public StudentId(int id, String StudentName, boolean active) {
	        this.id = id;
	        this.StudentName = StudentName;
	        this.active = active;
	    }


	public static void main(String[] args) {
		
		StudentId studentId = new StudentId(13, "Sri", true);

        
        System.out.println("Student ID: " + studentId.getId());
        System.out.println("Student Name: " + studentId.getStudentName());
        System.out.println("Is Active: " + studentId.isActive());
	}

}

