
public class PointThreeD {
	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	
	public PointThreeD() {
		this.xPoint=0;
		this.yPoint=0;
		this.zPoint=0;
	}
	public PointThreeD(double x, double y,  double z) {
		this.xPoint=x;
		this.yPoint=y;
		this.zPoint=z;
	}
	public double getxPoint() {
		return xPoint;
	}
	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}
	public double getyPoint() {
		return yPoint;
	}
	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}
	public double getzPoint() {
		return zPoint;
	}
	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}

}
