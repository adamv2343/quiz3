package quiz3;

public class triangle{
	public double side1 = 1.0;
	public double side2 = 1.0;
	public double side3= 1.0;
	
	public triangle(double side1, double side2, double side3){
		this.side1 = side1;
	    this.side2 = side2;
	    this.side3 = side3;
	     
		
	
	}
	public double setSide1(){
		return side1;
		
	}
	public double setSide2(){
		return side2;
		
	}
	public double setSide3(){
		return side3;
		
	}
	
	public double getArea(){
		return (side1+side2+side3)/2;
		
	}
	public double getPerimeter(){
		return side1+side2+side3;
		
	}
	public String toString(){
		return " side 1 = " +side1+" side2 = " + side2+" side3 = "+side3;
		
	}
}

