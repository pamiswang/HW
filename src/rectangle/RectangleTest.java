package rectangle;

public class RectangleTest {
    public static void main(String[] args) {

	RectangleArea ra = new RectangleArea();

	System.out.println(ra.Area(6, 3));
	int[][] locate = { { 0, 4 }, { 2, 8 } };
	System.out.println(ra.Area(locate));

	System.out.println(ra.Area(new int[][] { { 0, 4 }, { 2, 2 } }));

    }
}
