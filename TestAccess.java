class T{
	private int i = 0;//���ڲ��ɷ���
		int j = 1;//���ڲ���ͬһ�����п��Է���
	protected int k = 2;//���ڲ���ͬһ����������ɷ��ʡ�
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