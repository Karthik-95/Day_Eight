
public class StringReverseSameline {
	public static void main(String[]args) {
		String program="JAVA";
		String reverse="";
		for(int a=program.length()-1;a>=0;a--) {
			reverse=reverse+program.charAt(a);
		}
		System.out.println(reverse);
	}

}
