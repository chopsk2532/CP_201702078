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
		System.out.println("이름: "+name);
		System.out.println("학번: "+stun);
		System.out.println("학과: "+major);
		System.out.println("학년: "+grade);
		System.out.println("이수학점수: "+credit);
		System.out.println("동아리: "+club);
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
		System.out.println("이름: "+name);
		System.out.println("학번: "+stun);
		System.out.println("학과: "+major);
		System.out.println("학년: "+grade);
		System.out.println("이수학점수: "+credit);
		System.out.println("조교 유형: "+type);
		System.out.println("장하금 비율: "+ratio);
	}
}



public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	college co = new college();
	co.setName("최대우");
	co.setStun(201702078);
	co.setMajor("컴퓨터공학과");
	co.setGrade(1);
	co.setCredit(18);
	co.setClub("SPG");
	co.print();
	gradstu gr = new gradstu();
	gr.setName("최대우");
	gr.setStun(201702078);
	gr.setMajor("컴퓨터공학과");
	gr.setGrade(4);
	gr.setCredit(24);
	gr.setType("연구 조교");
	gr.setRatio(0.8);
	gr.print();	
	}

}
