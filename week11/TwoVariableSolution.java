public class TwoVariableSolution implements Solution {

    private final double solutionA, solutionB;

    public TwoVariableSolution(double solutionA, double solutionB) {
        this.solutionA = solutionA;
        this.solutionB = solutionB;
    }

    @Override
    public String toString() {
        if (solutionA == -solutionB) {
            return "x = " + (char)0x00B1 + Math.abs(solutionA);
        }

        return "x = " + solutionA + ", " + solutionB;
    }

}
