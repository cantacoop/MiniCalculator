package mooc.vandy.java4android.calculator.logic;

/**
 * Define the abstract class for calculator two arguments
 */
public abstract class Operation {

    // Declare private arguments
    private int mArgumentOne;
    private int mArgumentTwo;

    // Constructor
    public Operation(int argumentOne, int argumentTwo) {

        // initial arguments
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }

    // Accessor for args1
    public int getArgumentOne() {
        return mArgumentOne;
    }

    // Accessor for args2
    public int getArgumentTwo() {
        return mArgumentTwo;
    }

    // Define abstract method for calculate
    public abstract String calculate();
}
