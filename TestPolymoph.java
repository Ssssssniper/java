abstract class Animal {
	public String name;
	Animal(String name){
		this.name = name;
	}
	public abstract void enjoy(); //�������󷽷����������󷽷������������Ϊ�����ࡣ
}

class Bird extends Animal {
	public String furcolor;
	Bird(String name, String c) {
		super(name);
		furcolor = c;
	}
	public void enjoy() {
		System.out.println("�����....");
	}
}

class Snake extends Animal {
	public String size;
	Snake(String name,String s) {
		super(name);
		size = s;
	}
	public void enjoy() {
		System.out.println("�߽���....");
	}
}

class Lady {
	private String name;
	private Animal pet;
	Lady(String name, Animal pet) {
		this.name = name; this.pet = pet;
	}
	public void myPetEnjoy(){pet.enjoy();}
}

public class TestPolymoph{
	public static void main(String [] args) {
			Bird b = new Bird("birdname","blue");
			Snake s = new Snake("snakename","22");
			Lady l1 = new Lady("bird1",b);
			Lady l2 = new Lady("snake",s);
			l1.myPetEnjoy();
			l2.myPetEnjoy();
	}
}