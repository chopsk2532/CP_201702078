import java.util.Scanner;
class loginn {
	
	String id,pass;
	
	public String getId()  { return  id; }
	public void setId(String i) { id = i; }
	public String getPass() { return pass;}
	public void setPass(String p) { pass = p; }
	
	
	public void userid() {
		Scanner input = new Scanner(System.in);
		System.out.print("���̵� �Է��Ͻÿ� : ");
		id = input.nextLine();
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		pass = input.nextLine();
		
	}

	public void login() {
		System.out.println("<�α���>");
	String loginid,loginpass;
	Scanner sc = new Scanner(System.in);
	System.out.print("ID : ");
	loginid = sc.nextLine();
	System.out.print("PASSWORD : ");
	loginpass = sc.nextLine();
	
	if (id == loginid && pass == loginpass) 
		System.out.print("�α��ο� �����Ͽ����ϴ�.");
		else if (id != loginid && pass != loginpass ) 
			System.out.print("�α��ο� �����ϼ̽��ϴ�.");
	}
	
	}
	
	




public class logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<��������>");
		loginn log = new loginn();
		log.userid();
		log.login();
	}

}
