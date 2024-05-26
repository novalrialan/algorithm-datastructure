package Root;

public class RootAlgorithm {

    // Function for which we want to find the root
    public static double function(double x) {
        return x * x - 16; // Example function: f(x) = x^2 - 16
    }

    // Derivative of the function
    public static double derivative(double x) {
        return 2 * x; // Derivative of f(x) = x^2 - 16 is f'(x) = 2x
    }

    // Newton-Raphson method to find the root
    public static double findRoot(double initialGuess, double tolerance, int maxIterations) {
        double x0 = initialGuess;
        int iterations = 0;

        while (Math.abs(function(x0)) > tolerance && iterations < maxIterations) {
            double x1 = x0 - function(x0) / derivative(x0);
            x0 = x1;
            iterations++;
        }

        return x0;
    }

    public static void main(String[] args) {
        double initialGuess = 4.0; // Initial guess for the root
        double tolerance = 0.0001; // Tolerance level
        int maxIterations = 1000; // Maximum number of iterations

        double root = findRoot(initialGuess, tolerance, maxIterations);

        System.out.println("Root found at: " + root);
    }
}