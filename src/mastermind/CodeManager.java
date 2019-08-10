package mastermind;

import mastermind.game.Code;
import mastermind.game.Color;
import mastermind.game.Response;

/**
 * Manages the creation and validation of the code.
 */
public class CodeManager {

    /**
     * The code that is generated when the manager is created.
     */
    private static final Code CODE = new Code();

    /**
     * Generates a random code from 4 Colors.
     */
    public void generateCode() {
        for (int i = 0; i < 4; i++) {
            Color c = Color.random();
            CODE.colors[i] = c;
        }
    }

    /**
     * Tests the string code vs the current code.
     * @param in The string code to check.
     * @return The pipped status of the code.
     */
    public String testCode(String in) {
        in = in.toUpperCase();
        System.out.println("Testing code " + in + "...");

        if (in.length() != 4) {
            return "Invalid code. Needs 4 digits";
        }
        Response[] compareCheck = new Response[4];

        try {
            compareCheck = CODE.compare(in);
        } catch (Exception ex) {
            System.err.println("Error occured: " + ex.getLocalizedMessage());
        }
        
        return Response.arrayToString(compareCheck);

    }

    /**
     * Returns the code as a string.
     * @return The code as a string.
     */
    public String sayCode() {
        return CODE.toString();
    }

}
