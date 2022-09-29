
public class Training {
	
//		String str  = "raja";
//		char[] strs = str.toCharArray();
//		for(int i =0;i<strs.length;i++) {
//			int val = (strs[i]-32);
//			char c = (char) val;
//			System.out.print(c);
//			
//		}
		String sgtr = "prime";
		public String findPrime(int num) {
			boolean flag = true;
			for(int i = 2;i<num;i++) {
				if(num%i==0) {
					flag = false; 
				}
			}
			if(flag) {
				return "prime";
			} else {
				return "not prime";
			}
			
		}
	

}
