class Plane {
	private String con;
	private String model;
	private int num;
	public static int planenum;
	
	public String setCon() { return con;}
	public void getCon(String c) {con = c;}
	public String setModel() {return model;}
	public void getModel(String m) { model = m;}
	public int setNum() {return num;}
	public void getNum(int n) {num =n;}
	
	public Plane(String c,String m,int n) {
		con = c;
		model =m;
		num=n;
		planenum++;
	}
	
	public Plane() {
		con = "�������2";
		model = "747";
		num=400;
		planenum++;
		
	}
	public static int getPlanenum() {
		return planenum;
	}

	public void print() {
		System.out.println("���ۻ�: "+con+" �� : "+model+" �ִ� �°���: "+num);
	}
}



public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Plane pl1 = new Plane("�������1","757",500);
	pl1.print();
	Plane pl2 = new Plane();
	pl2.print();
	int n = Plane.getPlanenum();
	System.out.println("���ݱ��� ������ ����� �� :" + n);
	}

}
