package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Operation {

    // Constructor
    public Subtract(int argumentOne, int argumentTwo) {
        super(argumentOne, argumentTwo);
    }

    // Calculate method
    @Override
    public String calculate() {

        // Calculate subtraction
        int result = getArgumentOne() - getArgumentTwo();

        // Return result to string format
        return String.valueOf(result);
    }
}
