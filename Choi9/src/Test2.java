class Student{
	String name,major;
	int stun,grade,credit;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String m) {
		major=m;
	}
	public int getStun() {
		return stun;
	}
	public void setStun(int s) {
		stun=s;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int g) {
		grade=g;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int c) {
		credit=c;
	}
	
}
class college extends Student{
	String club;
	public String getClub() {
		return club;
	}
	public void setClub(String l) {
		club=l;
	}
	public void print() {
		System.out.println("�̸�: "+name);
		System.out.println("�й�: "+stun);
		System.out.println("�а�: "+major);
		System.out.println("�г�: "+grade);
		System.out.println("�̼�������: "+credit);
		System.out.println("���Ƹ�: "+club);
	}
}
class gradstu extends Student{
	String type;
	double ratio;
	public String getType() {
		return type;
	}
	public void setType(String t) {
		type=t;
	}
	public double getRatio() {
		return ratio;
	}
	public void setRatio(double r) {
		ratio=r;
	}
	public void print() {
		System.out.println("�̸�: "+name);
		System.out.println("�й�: "+stun);
		System.out.println("�а�: "+major);
		System.out.println("�г�: "+grade);
		System.out.println("�̼�������: "+credit);
		System.out.println("���� ����: "+type);
		System.out.println("���ϱ� ����: "+ratio);
	}
}



public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	college co = new college();
	co.setName("�ִ��");
	co.setStun(201702078);
	co.setMajor("��ǻ�Ͱ��а�");
	co.setGrade(1);
	co.setCredit(18);
	co.setClub("SPG");
	co.print();
	gradstu gr = new gradstu();
	gr.setName("�ִ��");
	gr.setStun(201702078);
	gr.setMajor("��ǻ�Ͱ��а�");
	gr.setGrade(4);
	gr.setCredit(24);
	gr.setType("���� ����");
	gr.setRatio(0.8);
	gr.print();	
	}

}
