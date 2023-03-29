
public class ListApp {

	public static void main(String[] args) {
		ArrayList<String> st = new ArrayList<String>(3);
		ArrayList<Square> sq = new ArrayList<Square>(3);
		ArrayList<PointThreeD> p = new ArrayList<PointThreeD>(3);
		System.out.println("Is add item method is able to add to Array:" + st.addItem("Chase"));
		st.addItem("Owen");
		st.addItem("Hall");
		System.out.println("Is add item method is able to add to Array:" + st.addItem("Jr" ));
		System.out.println("String: "+ st.toString());
		
		Square s = new Square(2);
		Square s1 = new Square(3);
		Square s2 = new Square(4);
		sq.addItem(s);
		sq.addItem(s1);
		sq.addItem(s2);
		System.out.println("Square: "+sq.toString());
		
		PointThreeD p1 = new PointThreeD(1,3,5);
		PointThreeD p2 = new PointThreeD(2,4,6);
		PointThreeD p3 = new PointThreeD(1.5,3.5,5.5);
		p.addItem(p1);
		p.addItem(p2);
		p.addItem(p3);
		System.out.println("PointThreeD: " +p.toString());

	}

}
