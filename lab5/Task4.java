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
public class Task4{
	public static void main(String[] args) {
		Student s1=new Student("Ahmed Ali" , "18SW56","Software Engineering",19,"Nausharo Feroze","MUET Jamshoro");
		s1.showData();
	}
}