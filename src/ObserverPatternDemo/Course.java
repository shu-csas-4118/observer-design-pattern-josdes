package ObserverPatternDemo;

public class Course {
	private String name;
	private int number;
	private double credit;
	private Professor professor;
	
	public Course(String nam, int num, double cred, Professor prof) {
		name = nam;
		number = num;
		credit = cred;
		professor = prof;
	}
	
	public void setName(String replace) {
		name = replace;
	}
	public void setNum(int replace) {
		number = replace;
	}
	public void setCred(double replace) {
		credit = replace;
	}
	public void setProf(Professor replace) {
		professor = replace;
	}
	
	public String getName() {
		return name;
	}
	public int getNum() {
		return number;
	}
	public double getCred() {
		return credit;
	}
	public Professor getProf() {
		return professor;
	}
}
