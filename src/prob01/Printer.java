package prob01;
 
public class Printer{
	public void println(int data) {
		System.out.println(data);
	}
	public void println(double data) {
		System.out.println(data);
	}
	public void println(boolean data) {
		System.out.println(data);
	}
	public void println(String data) {
		System.out.println(data);
	}
	public void println(int data1, boolean data2, double data3, String data4) {
		println(data1);
		println(data2);
		println(data3);
		println(data4);
	}
	
	public int sum(int data1, int data2, int data3) {
		return sum(data1, data2, data3, 0, 0);
	}
	public int sum(int data1, int data2, int data3, int data4, int data5) {
		return data1+data2+data3+data4+data5;
	}
}
