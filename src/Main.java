import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) throws Exception {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit

		/*String dateString = "29 04 1997";
    	//System.out.println(dateString);

    	DateFormat formatter = new SimpleDateFormat("dd MM yyyy");
    	Date date = formatter.parse(dateString);
    		 

		StudentGroup sg=new StudentGroup(10);
		Student s1=new Student(101,"teja",date,120.2);
		Student s2=new Student(103,"raju",new Date(),120.5);
		sg.addFirst(s1);
		sg.addLast(s2);
		sg.add(s2,1);
		sg.add(s1,2);

		System.out.println(sg.getCurrentAgeByDate(0));
		
		Student s3=sg.getNextStudent(s2);
		//System.out.println(s3);
		
		//sg.remove(s1);
		//sg.removeFromIndex(1);

		Student[] students=sg.getStudents();
		for(Student each:students)
		{
			System.out.println(each.getId());
			System.out.println(each.getFullName());
			System.out.println(each.getBirthDate());
			System.out.println(each.getAvgMark());
			System.out.println("------------------------");
		}
		System.out.println("****************************************");

		String dateString1 = "22 04 1997";
    	//System.out.println(dateString);

    	
    	Date date2 = formatter.parse(dateString1);
		Student[] student=sg.getNearBirthDate(date2,10);
		for(Student each:student)
		{
			System.out.println(each.getId());
			System.out.println(each.getFullName());
			System.out.println(each.getBirthDate());
			System.out.println(each.getAvgMark());
			System.out.println("------------------------");
		}*/

		StudentGroup sg=new StudentGroup(10);
		Student s1=new Student(101,"teja",new SimpleDateFormat("dd MM yyyy").parse("29 04 1997"),120.2);
		Student s2=new Student(102,"raju",new SimpleDateFormat("dd MM yyyy").parse("12 03 2000"),120.5);
		Student s3=new Student(103,"gouthi",new SimpleDateFormat("dd MM yyyy").parse("01 08 1996"),120.7);
		Student s4=new Student(104,"dinu",new SimpleDateFormat("dd MM yyyy").parse("04 10 1995"),120.7);


		sg.addFirst(s1);
		sg.addLast(s2);
		sg.addLast(s3);
		sg.addLast(s4);
		
		sg.bubbleSort();


		Student[] students=sg.getStudents();
		for(Student each:students)
		{
			System.out.println(each.getId());
			System.out.println(each.getFullName());
			System.out.println(each.getBirthDate());
			System.out.println(each.getAvgMark());
			System.out.println("------------------------");
		}
		System.out.println("****************************************");

		//Student temp=sg.getStudent(2);
		//System.out.println(temp.getId());

		/*sg.setStudent(s3,1);
		Student[] students=sg.getStudents();
		for(Student each:students)
		{
			System.out.println(each.getId());
			System.out.println(each.getFullName());
			System.out.println(each.getBirthDate());
			System.out.println(each.getAvgMark());
			System.out.println("------------------------");
		}
		System.out.println("****************************************");*/

		
		Student[] student=sg.getStudentsWithMaxAvgMark();
		for(Student each:student)
		{
			System.out.println(each.getId());
			System.out.println(each.getFullName());
			System.out.println(each.getBirthDate());
			System.out.println(each.getAvgMark());
			System.out.println("------------------------");
		}
		System.out.println("****************************************");

	}

}
