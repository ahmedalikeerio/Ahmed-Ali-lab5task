public class Task7{
	public static void main(String[] args) {
		String str="Ali,18,BE-Software;Aisha,19,BE-Electronics";
		String []s=str.split(";");
		s[0]="Ali,18,BE-Software";
		s[1]="Aisha,19,BE-Electronics";
		String s1[]=s[0].split(",");
		String s2[]=s[1].split(",");
		System.out.println("Student: 1");
		System.out.println("Name: "+s1[0]);
		System.out.println("Age: "+s1[1]);
		System.out.println("Program: "+s1[2]);
		System.out.println();
		System.out.println("Student: 2");
		System.out.println("Name: "+s2[0]);
		System.out.println("Age: "+s2[1]);
		System.out.println("Program: "+s2[2]);
		
	}
}