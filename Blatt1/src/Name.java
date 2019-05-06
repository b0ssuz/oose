

public class Name {
	public static void main(String[] args) {
		int x;
		int y;
		int op = Integer.parseInt(args[2]);
		;
		int res = -1;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		switch (op) {
		case 0:
			res = x + y;
			break;
		case 1:
			res = x - y;
			break;
		case 2:
			res = x * y;
			break;
		case 3:
			res = x / y;
			break;
		}
		System.out.println(res);
	}
}
