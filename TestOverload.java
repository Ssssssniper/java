public class TestOverload{
	void max(int a, int b){
		System.out.println(a > b ? a : b);
	}
	void max(float a, float b){
		System.out.println(a > b ? a : b);
		System.out.println("调用的此方法");
	}	//方法的重载;仅参数不同（参数个数、参数类型）
	
	public static void main(String [] args){
		TestOverload t = new TestOverload();
		t.max(3, 4);
	}
}