class Point{
	double x,y,z;
	
	Point(double x1, double y1, double z1){
		x = x1;
		y = y1;
		z = z1;
	}

	void setX(int x2){
		x = x2;
	}
	void setY(int y2){
		y = y2;
	}
	void setZ(int z2){
		z = z2;
	}
	
	double distance(){
		double d = x*x + y*y + z*z;
		return d;
	}
}

public class TestPoint{
	public static void main (String [] args){
		Point p = new Point(2,2,2);
		double t1 = p.distance();
		System.out.println(t1);
		p.setX(1);
		p.setY(1);
		p.setZ(1);
		double t2 = p.distance();
		System.out.println(t2);
	}
}