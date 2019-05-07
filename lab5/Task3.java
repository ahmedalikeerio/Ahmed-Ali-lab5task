
class Dog{
	String name;
	String breed;
	int age;
	boolean check=false;
	void setDetails(String n,String b, int a){
		name=n;
		breed=b;
		age=a;
		check=true;
	}
	void showDetails(){
		if(check==true){
		System.out.println("Name: "+name);
		System.out.println("Breed: "+breed);
		System.out.println("Age: "+age);}
		else
			System.out.println("Details are unavailable");
	}
}
public class Task3{
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.setDetails("tommy" , "gull dog", 10);
		d1.showDetails();
	}
}