public class Method{
	public static void main(String[] args){
		m();
		m1(2);
		int i = m2(4,8);	
		System.out.println(i);
	}
	
	public static void m(){
		System.out.println("ok");
	}
	
	public static void m1(int i){
		if(i<10){
			System.out.println("i<10");
		}	
	}
	
	public static int m2(int i,int j){
		System.out.println("输出最大值");
		return i > j ? i : j;	
	}
}