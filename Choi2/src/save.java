import java.util.Scanner;

public class save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int �����;
		int ���;
		int ���ʿ�;
		int �ʿ�;
		int sum;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������� ������ �Է��Ͻÿ� : ");
		����� = input.nextInt();
		System.out.print("����� ������ �Է��Ͻÿ� : ");
		��� = input.nextInt();
		System.out.print("���ʿ��� ������ �Է��Ͻÿ� : ");
		���ʿ� = input.nextInt();
		System.out.print("�ʿ��� ������ �Է��Ͻÿ� : ");
		�ʿ� = input.nextInt();
		
		sum = (�����*500)+(���*100)+(���ʿ�*50)+(�ʿ�*10);
		
		System.out.print("�����뿡 ����ִ� �� �׼� : "+sum);
		
	}

}
