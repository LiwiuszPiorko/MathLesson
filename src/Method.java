public class Method {

    public boolean isRightTriangle(Triangle triangle1) {

        boolean eqtriangle = triangle1.a * triangle1.a + triangle1.b * triangle1.b == triangle1.c * triangle1.c;

        if (eqtriangle) {
            return true;
        } else {
            return false;
        }
    }
}












