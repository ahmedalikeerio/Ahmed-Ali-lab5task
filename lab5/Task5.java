import java.util.*;
class Marksheet{
	int oop;
	int dcld;
	int laag;
	int total;
	float per;
	void getDetails(){
		oop=80;
		dcld=90;
		laag=95;
	}
	void getTotal(){
		total=oop+laag+dcld;
		System.out.println("Total marks is:"+total);
	}
	void getPercentage(){
		per=(float)(total*100)/300;
		System.out.println("Percentage is: "+per);
	}
	void getGrade(){
		if(per>90){
System.out.println("Grade: A");
}
else if(per>=80){
System.out.println("Grade: B");
}
else if(per>=70){
System.out.println("Grade: C");
}
else if(per>=60){
System.out.println("Grade: D");
}
else if(per<60){
System.out.println("You are fail");
	}
}
}
public class Task5{
	public static void main(String[] args) {
		Marksheet s=new Marksheet();
		s.getDetails();
		s.getTotal();
	s.getPercentage();
		s.getGrade();
	}
}