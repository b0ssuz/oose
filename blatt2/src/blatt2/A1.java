package blatt2;

public class A1{
	public static void main(String[] args) {
		System.out.println(fak_rek(10));
		System.out.println(n_k(10,3));
		System.out.println(euklid(33,3));
	}
	static long fak_rek(long n) {
		if(n <= 1) return 1;
		else return (n*(fak_rek(n-1)));
	}
	static long n_k(long n, long k) {
		long res = 0;
		if(0 <= k && k <= n) {
			res = fak_rek(n)/(fak_rek(k)*fak_rek(n-k));
		}
		else if(n >= 0 && n < k){
			return 0;
		}
		return res;
	}
	static long lotto(long n, long k) {
		return (n_k(n,k)*fak_rek(k));
	}
	static long euklid(long a, long b) {
		if(a == 0) return b;
		while(b != 0){
			if(a>b){
				a = a-b;
			}
			else {
				b = b-a;
			}
		}
		return a;
	}
}