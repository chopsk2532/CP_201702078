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
	
		System.out.println("가로의 길이 : "+getWidth());
		System.out.println("세로의 길이 : "+getLength());
		System.out.println("높이의 길이  : "+getHeight());
		System.out.println("부피 : "+getVolume());
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
