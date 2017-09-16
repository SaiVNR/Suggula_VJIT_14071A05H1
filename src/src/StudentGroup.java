import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	ArrayList<Student> al=new ArrayList<Student>();
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		ArrayList<Student> al=new ArrayList<Student>();
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return al.toArray(new Student[al.size()]);
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try
		{
			if(students==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				this.students=students;
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try
		{
			if(index<0 || index>=al.size())
			{
				throw new IllegalArgumentException();
			}
			else
			{
				return (Student)al.get(index);
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try
		{
			if(student==null || index>=al.size())
			{
				throw new IllegalArgumentException();
			}
			else
			{
				//this.students[index]=student;
				al.set(index,student);
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		
		try
		{
			if(student==null )
			{
				throw new IllegalArgumentException();
			}
			else
			{
				//this.students[index]=student;
				al.add(0,student);
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try
		{
			if(student==null )
			{
				throw new IllegalArgumentException();
			}
			else
			{
				//this.students[index]=student;
				al.add(student);
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try
		{
			if(student==null || index>=al.size())
			{
				throw new IllegalArgumentException();
			}
			else
			{
				//this.students[index]=student;
				al.add(index,student);
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try
		{
			if(index>=al.size())
			{
				throw new IllegalArgumentException();
			}
			else
			{
				//this.students[index]=student;
				al.remove(index);
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try
		{
			if(student==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				//this.students[index]=student;
				if(al.remove(student))
				{

				}
				else
				{
					throw new IllegalArgumentException("Student not exist");
				}
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try
		{
			if( index>=al.size())
			{
				throw new IllegalArgumentException();
			}
			else
			{
				//this.students[index]=student;
				//al.removeRange(index+1,al.size());
				al.subList(index+1, al.size()).clear();
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try
		{
			if( student==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				//this.students[index]=student;
				//al.removeRange(index+1,al.size());
				int index=al.indexOf(student);
				al.subList(index+1, al.size()).clear();
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}

	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		try
		{
			if( index>=al.size())
			{
				throw new IllegalArgumentException();
			}
			else
			{
				//this.students[index]=student;
				//al.removeRange(index+1,al.size());
				al.subList(0,index).clear();
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}

	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		try
		{
			if( student==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				//this.students[index]=student;
				//al.removeRange(index+1,al.size());
				int index=al.indexOf(student);
				al.subList(0,index).clear();
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0; i<al.size(); i++)
		{
		        for(int k= i+1; k <al.size(); k++)
		        {
		                if((al.get(k)).compareTo(al.get(i)) > 0)
		                {
		                        Student temp = al.get(i);
		                        al.set(i, al.get(k));
		                        al.set(k,temp);

		                }
		        }  
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
		try
		{
			if(date==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
					ArrayList<Student> dl=new ArrayList<Student>();
				Student[] temp=getStudents();
				for(Student g:temp){
					if(g.getBirthDate().equals(date)||g.getBirthDate().before(date)){
						dl.add(g);
					}
				}
				return dl.toArray(new Student[dl.size()]);

			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		} 
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		try
		{
			if(firstDate==null || lastDate==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				ArrayList<Student> dl=new ArrayList<Student>();
				Student[] temp=getStudents();
				for(Student g:temp){
					if(g.getBirthDate().after(firstDate)&&g.getBirthDate().before(lastDate)){
						dl.add(g);
					}
				}
				return dl.toArray(new Student[dl.size()]);
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		} 
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		try{
			if(date==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				ArrayList<Student> dl=new ArrayList<Student>();
				Student[] temp=getStudents();
				int i=0;
					while(i<=days){
						for(Student g:temp){
						if(g.getBirthDate().equals(addDays(date,i)))
						{
							dl.add(g);
						}
					}i++;
					/*if((g.getBirthDate().before(addDays(date,days))&& g.getBirthDate().after(date))||g.getBirthDate().equals(date)){
						dl.add(g);
					}*/
				}
				return dl.toArray(new Student[dl.size()]);

			}

		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}

		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		try
		{
			if(indexOfStudent==0 )
			{
				throw new IllegalArgumentException();
			}
			else
			{
				Calendar cal = Calendar.getInstance();
		      	cal.setTime(((Student)al.get(indexOfStudent)).getBirthDate());  //use java.util.Date object as arguement
		      // get the value of all the calendar date fields.
		       	int birthyear =(int)cal.get(Calendar.YEAR);
				System.out.println("##"+birthyear);
				Calendar now=Calendar.getInstance();
				int year=now.get(Calendar.YEAR);
				System.out.println("##"+year);
		      	return (year-birthyear);
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
		return 1;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		Calendar cal = Calendar.getInstance();
        //use java.util.Date object as arguement
      // get the value of all the calendar date fields.
       
		
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		System.out.println("##"+year);


		ArrayList<Student> dl=new ArrayList<Student>();
		Student[] temp=getStudents();

		for(Student each:temp)
		{
			cal.setTime(each.getBirthDate());
            int birthyear =(int)cal.get(Calendar.YEAR);
            if(year-birthyear == age)
            {
            	dl.add(each);
            }
		}

		return dl.toArray(new Student[dl.size()]);

	
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double max=-1.0;
		for(int i=0;i<al.size();i++)
		{
			Student stu=(Student)al.get(i);
			if(stu.getAvgMark()>max)
			{
				max=stu.getAvgMark();
			}
		}

		ArrayList<Student> dl=new ArrayList<Student>();
		Student[] temp=getStudents();

		for(Student each:temp)
		{
			if(each.getAvgMark()==max)
			{
				dl.add(each);
			}
		}

		return dl.toArray(new Student[dl.size()]);


		
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		try
		{
			if(student==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				int index=al.indexOf(student);
				if(index==al.size()-1)
				{
					return null;
				}
				else
				{
					return (Student)al.get(index+1);
				}
			}
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
		}
		return null;
	}

	public static Date addDays(Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
				
		return cal.getTime();
	}
}
