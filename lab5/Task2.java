import java.util.*;
class Array{
	int array[]=new int[5];
	void populateArray(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter elements: ");
		for(int i=0; i<array.length;i++){
			array[i]=input.nextInt();
		}
	}
	void displayArray(){
		System.out.println("Elements are: ");
		for(int j=0;j<array.length;j++){
			System.out.print(array[j]+" ");
		}
	}
}
public class Task2{
	public static void main(String[] args) {
		Array a1=new Array();
		a1.populateArray();
		a1.displayArray();
	}
}