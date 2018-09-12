class T{
	private int i = 0;//类内部可访问
		int j = 1;//类内部，同一个包中可以访问
	protected int k = 2;//类内部、同一个包、子类可访问。
	public int m = 3;
	
	public void m(){
		i = 10;
	}
}

class TT{
	public void m(){
		T t = new T();
		System.out.println(t.j);
	}

}