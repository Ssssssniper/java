public class TestCasting{
	public static void main(String [] args) {
		TestCasting test = new TestCasting();
		Animal a = new Animal("name");
		Cat c = new Cat("catname","blue");
		Dog d = new Dog("dogname","black");
		test.f(a);test.f(c);test.f(d);
	}
	public void f(Animal a) {
		System.out.println("name: " + a.name);
		if(a instanceof Cat){
			Cat cat = (Cat)a;
			System.out.println(" " + cat.eyesColor +" eyes");
		}else if(a instanceof Dog){
			Dog dog = (Dog)a;
			System.out.println(" " + dog.furColor + " fur");
		}
	}
}