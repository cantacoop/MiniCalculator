package mooc.vandy.java4android.calculator.logic;

import android.graphics.Path;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    // Declare constance operation variables
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION = 4;

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation){

        // Declare operation variable
        Operation opr;

        // Check operation
        switch (operation) {
            case ADDITION:

                // Create instant
                opr = new Add(argumentOne, argumentTwo);
                break;

            case SUBTRACTION:

                // Create instant
                opr = new Subtract(argumentOne, argumentTwo);
                break;

            case MULTIPLICATION:

                // Create instant
                opr = new Multiply(argumentOne, argumentTwo);
                break;

            case DIVISION:

                // Create instant
                opr = new Divide(argumentOne, argumentTwo);
                break;

            default:

                // No operation
                return;
        }

        try {

            // Display result to output
            mOut.print(opr.calculate());
        } catch (IllegalArgumentException e) {

            // Display divine by 0 message
            mOut.print(e.getMessage());
        }
    }
}
