public class TriangleClassifier {
    public static String triangle(int edgeA, int edgeB, int edgeC) {
        //throw new UnsupportedOperationException();

        if (edgeA <= 0 || edgeB <= 0 || edgeC <= 0 ||
                Math.abs(edgeA) >= (Math.abs(edgeB) + Math.abs(edgeC)) ||
                Math.abs(edgeB) >= (Math.abs(edgeA) + Math.abs(edgeC)) ||
                Math.abs(edgeC) >= (Math.abs(edgeA) + Math.abs(edgeB))) {
            return "Not a triangle !";

        } else if (edgeA == edgeB) {
            if (edgeB == edgeC) {
                return "A equilateral triangle !";

            } else {
                return "A isosceles triangle !";
            }
        } else if (edgeB == edgeC || edgeC == edgeA) {
            return "A isosceles triangle !";
        }
        return "A normal triangle !";
    }

}




