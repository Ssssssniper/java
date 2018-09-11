public class Person{
	int id;
	int age = 20;
	
	Person(int n,int i){
		id = n;
		age = i;	
	}
	
	public static void main(String [] args){
		Person lee = new Person(1, 20);
		Person jack = new Person(2, 25);
		Point p = new Point();	//Point类中编译器自动为其添加构造方法Point（）{}；
	}
}

class Point{
	int x;
	int y;
}