package mastermind.game;

import java.util.Random;

/**
 * An enumerator which stores the colors for the game.
 */
public enum Color {
    
    /**
     * Red
     */
    RED,
    /**
     * Blue
     */
    BLUE,
    /**
     * Green
     */
    GREEN,
    /**
     * Orange
     */
    ORANGE,
    /**
     * White
     */
    WHITE,
    /**
     * Yellow
     */
    YELLOW;

    /**
     * Gets a random color from the enumerator.
     * @return 
     */
    public static Color random() {
        return values()[new Random(System.nanoTime()).nextInt(values().length)];
    }

    /**
     * Take a character; converts it to a String and runs valueOf on it.
     * @param in The character to check the value of.
     * @return The Color value of the character input.
     */
    public static Color charValueOf(char in) {
        String inString = Character.toString(in);
        return Color.valueOf(inString);
    }

    /**
     * Returns the possible colors as a String.
     * @return The possible colors as a String.
     */
    public static String stringValues() {
        StringBuilder s = new StringBuilder();
        for (Color v : values()) {
            s.append(v.toString());
        }
        return s.toString();
    }
}
