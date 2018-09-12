public class TestFinal {
	public static void main (String [] args) {
		T t = new T();
		//t.i = 8;
	}	
}

class T {
	final int i = 8;
	public final void m(){
		//j = 9;
	}

}

class TT extends T {
	public void m() {
		j = 9;
	}
}