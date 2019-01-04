package rectangle;

public class RectangleArea {

    int Area(int length, int height) {
	return length * height;
    }

    int Area(int[][] location) {

	int length = Math.abs(location[0][0] - location[1][0]);
	int height = Math.abs(location[0][1] - location[1][1]);
	return length * height;
    }

}
