import java.util.Scanner;

public class weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    double Ű,ü��,ǥ��ü��;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Ű�� �Է��Ͻÿ� : ");
    Ű = input.nextDouble();
    System.out.print("ü���� �Է��Ͻÿ� : ");
    ü�� = input.nextDouble();
    
    ǥ��ü�� = (Ű - 100)*0.9;
    if (ǥ��ü��-ǥ��ü��*0.1<ü�� && ü��<ǥ��ü��+ǥ��ü��*0.1 )
    	System.out.print("���� ü���Դϴ�.");
    else if (ü��>ǥ��ü��+ǥ��ü��*0.1)
    	System.out.print("��ü���Դϴ�.");
    else if (ü��<ǥ��ü��-ǥ��ü��*0.1)
    	System.out.print("��ü���Դϴ�.");
 
	
	}

}
