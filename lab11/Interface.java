
interface Person1 {
 void speak();
}

class Student1 implements Person1{
 
 public void speak() {
     System.out.println("today holiday mam");
 }
}


class Teacher implements Person1 {
 
 public void speak() {
     System.out.println("Teacher said: yes students");
 }
}

public class Interface {
 public static void main(String[] args) {
	
     
     Person1 student = new Student1();
     Person1 teacher = new Teacher();

    
     student.speak();
     teacher.speak();
 }
}