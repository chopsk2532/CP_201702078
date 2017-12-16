import java.util.Scanner;

public class cm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cm,피트;
		double 인치;
		Scanner input=new Scanner(System.in);
		System.out.print("키를 입력하시오 : ");
		cm = input.nextInt();
		피트 =(int)(cm/(2.54*12));
		인치 = (cm-(피트*2.54*12))/2.54; 
		System.out.print(cm+"cm는 "+피트+"피트 "+인치+"인치입니다.");
	
	}

}
