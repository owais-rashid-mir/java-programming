//Multilevel inheritance
class ExamMarks{
	int sub1,sub2;
	
	void setEM(int x,int y) {
		sub1=x;
		sub2=y;
	}
	
	void displayEM() {
		System.out.println("Exam Marks: ");
		System.out.println("Marks in subject 1 :" + sub1);
		System.out.println("Marks in subject 2 :" + sub2);
	}
}

class PracticalMarks extends ExamMarks{
	int p1,p2;
	
	void setPM(int x,int y) {
		p1=x;
		p2=y;
	}
	
	void displayPM() {
		System.out.println("Practical Marks: ");
		System.out.println("Marks in practical subject 1 :" + p1);
		System.out.println("Marks in practical subject 2 :" + p2);
	}
}

class TotalMarks extends PracticalMarks{
	int tot;
	
	void sumAll() {
		tot = sub1 + sub2 + p1 + p2;
		System.out.println("Total marks in Exam and Practical: " + tot);
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		
		TotalMarks obj = new TotalMarks();
		
		obj.setEM(20, 20);
		obj.displayEM();
		
		obj.setPM(10, 10);
		obj.displayPM();
		
		obj.sumAll();

	}

}
