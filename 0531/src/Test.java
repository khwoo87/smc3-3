import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int f = sc.nextInt();
		int s = sc.nextInt();
		String op = sc.next();
		int res = 0;
		
		if(op.equals("+")) {
			res += f + s;
		}
		else if(op.equals("-")) {
			res = f - s;
		}
		else if(op.equals("*")) {
			res = f * s;
		}
		else if(op.equals("/")) {
			res = f / s;
		}
		
		System.out.println(res);

	}

}