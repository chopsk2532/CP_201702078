class Box{
		
	int width;
	int length;
	int height;
	int volume;
	
	public int getWidth()  { return  width; }
	public void setWidth(int w) { width = w; }
	public int getLength() { return length;}
	public void setLength(int l) { length = l; }
	public int getHeight() { return height;}
	public void setHeight(int h) {height = h; }
	
	public int getVolume() { return volume=getWidth() * getLength() * getHeight();} 
		
		

	public void print () {
	
		System.out.println("������ ���� : "+getWidth());
		System.out.println("������ ���� : "+getLength());
		System.out.println("������ ����  : "+getHeight());
		System.out.println("���� : "+getVolume());
	}

	
}

public class Boxtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox = new Box();
		mybox.setHeight(50);
		mybox.setLength(20);
		mybox.setWidth(10);
		mybox.print();
		mybox.getVolume();
		
		
		
	}

}
