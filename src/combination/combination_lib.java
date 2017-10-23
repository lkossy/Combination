package combination;

public class combination_lib {
	public int getFactorial(int n) { //n‚ÌŠKæ
		int f = 1;
		//ŠKæŒvZ
		while(n>0) {
			f=f*n;
			n=n-1;
		}
		return f;
	}
}
