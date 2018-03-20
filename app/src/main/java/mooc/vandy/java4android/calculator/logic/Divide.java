package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Operation {

    // Constructor
    public Divide(int argumentOne, int argumentTwo) {
        super(argumentOne, argumentTwo);
    }

    // Calculate method
    @Override
    public String calculate() {

        // Check argument2 is 0
        if (getArgumentTwo() == 0) {

            // Throw division by 0 exception
            throw new IllegalArgumentException("warning of division by 0");
        }

        // Retrieve arguments value
        int argsOne = getArgumentOne();
        int argsTwo = getArgumentTwo();

        // Calculate division
        int result = argsOne / argsTwo;

        // Calculate modulo
        int modulo = argsOne % argsTwo;

        // Return result to string format
        return result + " R: " + modulo;
    }
}
