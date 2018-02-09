package ObserverPatternDemo;

public class EmailObserver implements IObserver {
	
	public EmailObserver() {
		
	}
	
	public String returnType() {
		return "email";
	}
	
	public void update(Student student) {
		System.out.println("Student's email is " + student.getEmail());
	}

}
