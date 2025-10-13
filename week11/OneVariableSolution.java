public class OneVariableSolution implements Solution {

    private final double solution;

    public OneVariableSolution(double solution) {
        this.solution = solution;
    }

    @Override
    public String toString() {
        return "x = " + solution;
    }
}
