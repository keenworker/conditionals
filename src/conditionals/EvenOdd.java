package conditionals;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		if(n%2==0)
		System.out.println(n+" is even");
		else
		System.out.println(n+" is odd");
	}

}
