class Birthdate{
	int day;
	int month;
	int year;

	public Birthdate(int i,int j,int k){
		day = i;
		month = j;
		year = k;
	}

	public void setDay(int d){
		day = d;
	}
	public void setMonth(int m){
		month = m;
	}
	public void setYear(int y){
		year = y;
	}
	
	public getDay(){
		return day;
	}
	public getMonth(){
		return month;
	}
	public getYear(){
		return year;	
	}
	
	public void display(){
		System.out.println(day + "-" + month + "-" + year);
	}
}

public class TestBirthdate{
	public static void main(String [] args){
		TestBirthdate test = new TestBirthdate();
		int Date = 9;
		Birthdate b1 = new Birthdate(7,7,1999);
		Birthdate b2 = new Birthdate(1,1,2000);
		test.change1(Date);
		test.change2(b1);
		test.change3(b2);
		System.out.println("date=" + Date);
		b1.display();
		b2.display();
	}
	
	public void change1(int i){
		i = 1234;
	}
	
	public void change2(Birthdate b){
		b = new Birthdate(22,2,2222);
	}
	
	public void change3(Birthdate b){
		b.setDay(22);
	}
}