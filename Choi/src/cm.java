import java.util.Scanner;

public class cm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cm,��Ʈ;
		double ��ġ;
		Scanner input=new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		cm = input.nextInt();
		��Ʈ =(int)(cm/(2.54*12));
		��ġ = (cm-(��Ʈ*2.54*12))/2.54; 
		System.out.print(cm+"cm�� "+��Ʈ+"��Ʈ "+��ġ+"��ġ�Դϴ�.");
	
	}

}
