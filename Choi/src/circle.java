import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ������,����;
		double ����;
		Scanner input = new Scanner(System.in);
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ� : ");
		������ = input.nextInt();
		System.out.print("������� ���̸� �Է��Ͻÿ� : ");
		���� = input.nextInt();
		���� = ������ * ������ * ���� * (Math.PI);
		System.out.print("������� ���Ǵ� "+����+"�Դϴ�.");
		
	}

}
