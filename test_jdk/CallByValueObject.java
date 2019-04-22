

class MyInt{
	int val;
	MyInt(int i){
		val = i;
	}
}

public class CallByValueObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonValue aPerson2 = new PersonValue("±æµ¿");
		MyInt a = new MyInt(33);
		
		aPerson2.setAge(a);
		
		System.out.println(a.val);
	}

}
