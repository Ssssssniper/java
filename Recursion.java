public class Recursion{
	public static void main(String [] args){
		System.out.println(Method(5));
	}
	public static int Method(int i){
		if(i==1){
			return 1;
		}else{
			return i*Method(i-1);
		}	
	}
}