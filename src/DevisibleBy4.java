
public class DevisibleBy4 {
	public static void main(String[]args) {
		int total=0;
		int count=0;
		for(int a=0;a<=50;a=a+4) {
			total=total+a;
			count=count+1;
			System.out.println(a);
		}
		System.out.println("AVERAGE = "+total/count);
	}

}
