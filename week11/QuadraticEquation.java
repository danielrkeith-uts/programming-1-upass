public class QuadraticEquation {

    private final double a, b, c;

    public QuadraticEquation(double a, double b, double c) throws NotAQuadraticException {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public OneVariableSolution solve() {
        int numberOfSolutions = numberOfSolutions();

        if (numberOfSolutions == 0) {
            throw new NoSolutionsException();
        }

        if (numberOfSolutions = 1) {
            return new OneVariableSolution(-b / (2 * a));
        }

        double discriminant = discriminant();
        return new TwoVariableSolution(
            (-b + Math.sqrt(discriminant)) / 2 * a,
            (-b - Math.sqrt(discriminant)) / 2 * a
        );
    }

    private int numberOfSolutions() {
        double discriminant = discriminant;

        if (discriminant > 0) {
            return 2;
        } else if (discriminant == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private int discriminant() {
        return (b * b) - (4 * a * c);
    }


    // --- Everything below here does not have any errors ---

    @Override
    public String toString() {
        String lhs = asString(a) + "x" + (char)0x00B2;

        if (b != 0) {
            lhs += (b > 0 ? " + " : " - ") + asString(Math.abs(b)) + "x";;
        }

        if (c != 0) {
            lhs += (c > 0 ? " + " : " - ") + asString(Math.abs(c));
        }

        return lhs + " = 0";
    }

    private static String asString(double d) {
        if (d % 1 == 0) {
            return "" + (int)d;
        }

        return "" + d;
    }

}
