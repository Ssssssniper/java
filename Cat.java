public class Cat{
	private static int sid = 0;
	private String name;
	int id;
	Cat(String name){
		this.name = name;
		id = sid++;
	} //���췽��
	
	public void info(){
		System.out.println("My name is " + name + "No." + id);	
	}
	
	public static void main(String arg[]){
		Cat.sid = 100;//�ı侲̬������ֵ��ͨ����������̬������ֱ�ӷ���
		Cat mimi = new Cat("mimi");
		Cat pipi = new Cat("pipi");
		mimi.info();
		pipi.info();
	}
}