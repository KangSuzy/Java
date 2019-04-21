
class SampleClass{
	public int field1;
	protected int field2;
	int field3;
	private int field4;
	
	public int getField4() {
		return field4;
	}
	public void setField4(int f4) {
		field4 = f4;
	}
}
public class FieldAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass fa = new SampleClass();
		fa.field1 = 0;
		fa.field2 = 1;
		fa.field3 = 2;
		fa.setField4(3);
		
	}

}
