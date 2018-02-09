package ObserverPatternDemo;

import java.util.ArrayList;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course("english", 12334323, 1.4, new Professor("Prof", "Dude", "profdude@shu.edu", 2014092839));
		Course course2 = new Course("not english", 32343321, 4.1, new Professor("Dude", "Prof", "dudeprof@shu.edu", 938904102));
		ArrayList<Course> courselist= new ArrayList<Course>();
		courselist.add(course1);
		courselist.add(course2);
		Student student = new Student("Garett", "Chang", 123456, "changgar@shu.edu");
		
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		EmailObserver emailObserver = new EmailObserver();
		CourseObserver courseObserver = new CourseObserver();
		
		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		student.attachObserver(emailObserver);
		student.attachObserver(courseObserver);
		
		student.setFirstName("Garrett");
		student.setIdNumber(54321);
		student.setEmail("it's so late at night@aol.com");
		student.setCourses(courselist);
		courselist.remove(course1);
		student.setCourses(courselist);
		
	}

}
