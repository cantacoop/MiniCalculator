package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Operation {

    // Constructor
    public Multiply(int argumentOne, int argumentTwo) {
        super(argumentOne, argumentTwo);
    }

    // Calculate method
    @Override
    public String calculate() {

        // Calculate multiply
        int result = getArgumentOne() * getArgumentTwo();

        // Return result to string format
        return String.valueOf(result);
    }
}
