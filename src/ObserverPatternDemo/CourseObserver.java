package ObserverPatternDemo;

import java.util.ArrayList;

public class CourseObserver implements IObserver {
	
	public CourseObserver() {
		
	}
	
	public String returnType() {
		return "course";
	}
	
	public void printCourseList(ArrayList<Course> courseList) {
		if (courseList.size() == 0) {
			System.out.println("");
		}
		else {
			for(int i = (courseList.size() - 1); !(i < 0); i--) {
				printCourse(courseList.get(i));
			}
		}
	}
	
	public void printCourse(Course course) {
		if (course == null) {
			throw new IllegalArgumentException("course");
		}
		else {
			System.out.println(course.getName() + ": " + course.getNum() + " for " + course.getCred() + " credits, with professor " + course.getProf().getFirstName() + " " + course.getProf().getLastName());
		}
	}
	
	public void update(Student student) {
		System.out.println("Student's courses are ");
		printCourseList(student.getCourses());
	}

}
