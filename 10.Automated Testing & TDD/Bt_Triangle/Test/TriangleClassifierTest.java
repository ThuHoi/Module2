import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleClassifierTest {
    @Test
    @DisplayName("Testing 8,2,3")
    void checkTriangle1() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;

        String expected = "Not a triangle! ";
        int result = TriangleClassifier.triangle(edgeA, edgeB, edgeC);
        Assertions.assertEquals(expected, result);



    }

    @Test
    @DisplayName("Testing -1,2,1")
    void checkTriangle2() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;

        String expected = "Not a triangle! ";

    }

    @Test
    @DisplayName("Testing 0,1,1")
    void checkTriangle3() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;

        String expected = "Not a triangle! ";
    }

    @Test
    @DisplayName("Testing 2,2,2")
    void checkTriangle4() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;

        String expected = "Not a triangle! ";
    }

    @Test
    @DisplayName("Testing 2,2,3")
    void checkTriangle5() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;

        String expected = "Not a triangle! ";
    }

    @Test
    @DisplayName("Testing 3,4,5")
    void checkTriangle6() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;

        String expected = "Not a triangle! ";
    }


}
