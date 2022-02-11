
package SchoolSystem;

import java.util.ArrayList;
import java.util.List;
public class Main {
public static void main(String[] args) {
		
		
	
	Teacher lizzy =new Teacher(1,"Lizzy",500);
		Teacher mellisa =new Teacher(2,"Mellisa",700);
		Teacher vanderhorn =new Teacher(3,"Vanderhorn",600);
	
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);

		Student tamasha= new Student(1,"Tamasha",4);
		Student rakshit= new Student(2,"Rakshit",12);
        Student rabbi= new Student(3,"Rabbi",5);
        
        List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rakshit);
		studentList.add(rabbi);
        
        School ghschool=new School(teacherList,studentList);
        
        tamasha.payFees(5000);
        rakshit.payFees(6000);
        rabbi.payFees(3000);
        
        System.out.println("G.H. School has earned $" + ghschool.getTotalMoneyEarned());

        System.out.println("------MAKING SCHOOL PAY SALARY----");
        lizzy.reveivesalary(lizzy.getSalary());
        System.out.println("G.H.SCHOOL has spent for salary to " + lizzy.getName() 
        + " and now has $" +ghschool.getTotalMoneyEarned());
        
        vanderhorn.reveivesalary(vanderhorn.getSalary());
        System.out.println("G.H.SCHOOL has spent for salary to " + vanderhorn.getName() 
        + " and now has $" +ghschool.getTotalMoneyEarned());
        
       mellisa.reveivesalary(mellisa.getSalary());
        System.out.println("G.H.SCHOOL has spent for salary to " + mellisa.getName() 
        + " and now has $" +ghschool.getTotalMoneyEarned());
        
        System.out.println("--------Paid fees so far by students------");
        System.out.println(rakshit);
        System.out.println(rabbi);
        System.out.println(tamasha );
	
}
}




