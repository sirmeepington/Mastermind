package mastermind.game;

import java.util.Arrays;

/**
 * A class to contain the code for mastermind.
 */
public class Code {

    /**
     * Four colors for the mastermind.
     */
    public final Color[] colors = new Color[4];

    /**
     * Compares a String to the code in this object.
     * @param in The string to compare against the code.
     * @return An array of response pips to signify the result.
     */
    public Response[] compare(String in) {
        Response[] out = new Response[4];
        for (int i = 0; i < in.length(); i++) { // Loop over input
            Color cI = Color.charValueOf(in.charAt(i));
            if (cI.equals(colors[i])) {
                out[i] = Response.RIGHT_PLACE; // Right place all good
            } else if (Arrays.asList(colors).contains(cI)) {
                out[i] = Response.WRONG_PLACE; // Wrong place
            } else {
                out[i] = Response.NOT_PRESENT; // Not in the colors
            }
        }
        return out;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Color c : colors) {
            sb.append(c);
        }
        return sb.toString();
    }
}
