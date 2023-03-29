
public class Square {
	private double side;
	
	public Square() {
		this.side=0;
	}
	
	public Square(double s) {
		this.side=s;
	}
	public double getArea() {
		return Math.pow(side, 2);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
