import java.util.Scanner;
class Book{
	static boolean book;
	static int[] chairs = {1,2,3,4,5,6,7,8,9,10};
	static boolean[] con = new boolean[10];
	
	public static void Reser() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0) : ");
		book = sc.nextInt()==1 ? true : false;
		Book.Reser2();
	}
		
	public static void Reser2() {
		if (book) {
			System.out.println("������ ���� ���´� ������ �����ϴ�.");
			for(int i=0;i<34;i++) {
				System.out.print("-");
			}
			System.out.println();
			for(int number : chairs) {
				System.out.print(number+" ");
			}
			System.out.println();
			for(int i=0;i<34;i++) {
				System.out.print("-");
		}
			System.out.println();
			for(int k=0;k<10;k++) {
				if(con[k]) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}		
		Book.Reser3();	
		}

		else {
			System.out.print("������ ����մϴ�.");
			Book.Reser();
		}
}

	public static void Reser3() {
		int chair;
		Scanner sc1 = new Scanner(System.in);
		System.out.println();
		System.out.print("�� ��° �¼��� �����Ͻðڽ��ϱ�?");
		chair = sc1.nextInt();
		if(con[chair]) {
			System.out.print("�̹� ����� �¼��Դϴ�.");
			Book.Reser3();
		}
		else {
			System.out.print("����Ǿ����ϴ�.");
			con[chair] = true;
			Book.Reser();
	
		}
	}
}



public class Booktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book();
		bk.Reser();

	}

}
