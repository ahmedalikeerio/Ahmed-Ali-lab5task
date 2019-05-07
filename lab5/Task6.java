class Student{
		 String name;
	     String roll;
		 String dept;
		int age;
		String domecile;
		String uni;
	Student(String n,String r,String d,int a,String y,String u){
		name=n;
		roll=r;
		dept=d;
		age=a;
		domecile=y;
		uni=u;
	}
	void showData(){
		System.out.println("Name :"+name);
		System.out.println("Roll no :"+roll);
		System.out.println("Department :"+dept);
		System.out.println("Age :"+age);
		System.out.println("Domecile :"+domecile);
		System.out.println("University/Institute :"+uni);
	}
}
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
class Combine{
	Student std;
	Marksheet m;
public Combine(Student std, Marksheet m){
	this.std=std;
	this.m=m;
	}
	public void createStudentresult(){
		std.showData();
		m.getDetails();
		m.getTotal();
		m.getPercentage();
		m.getGrade();
	}
}
public class Task6{
	public static void main(String[] args) {
		Student std=new Student("Ahmed Ali" , "18SW56","Software Engineering",19,"Nausharo Feroze","MUET Jamshoro");
	Marksheet m=new Marksheet();
	Combine c=new Combine(std,m);
		c.createStudentresult();
	}

}

