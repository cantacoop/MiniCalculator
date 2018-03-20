package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Operation {

    // Constructor
    public Add(int argumentOne, int argumentTwo) {
        super(argumentOne, argumentTwo);
    }

    // Calculate method
    @Override
    public String calculate() {

        // Calculate addition
        int result = getArgumentOne() + getArgumentTwo();

        // Return result to string format
        return String.valueOf(result);
    }
}
