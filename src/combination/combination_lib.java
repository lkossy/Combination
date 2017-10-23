package combination;

public class combination_lib {
	public int getFactorial(int n) { 
		int f = 1;
		while(n>0) {
			f=f*n;
			n=n-1;
		}
		return f;
	}
}
