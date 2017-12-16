import java.util.Scanner;
class Book{
	static boolean book;
	static int[] chairs = {1,2,3,4,5,6,7,8,9,10};
	static boolean[] con = new boolean[10];
	
	public static void Reser() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("좌석을 예약하시겠습니까?(1 또는 0) : ");
		book = sc.nextInt()==1 ? true : false;
		Book.Reser2();
	}
		
	public static void Reser2() {
		if (book) {
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
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
			System.out.print("예약을 취소합니다.");
			Book.Reser();
		}
}

	public static void Reser3() {
		int chair;
		Scanner sc1 = new Scanner(System.in);
		System.out.println();
		System.out.print("몇 번째 좌석을 예약하시겠습니까?");
		chair = sc1.nextInt();
		if(con[chair]) {
			System.out.print("이미 예약된 좌석입니다.");
			Book.Reser3();
		}
		else {
			System.out.print("예약되었습니다.");
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
