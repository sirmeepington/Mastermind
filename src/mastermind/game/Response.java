package mastermind.game;

/**
 * An enumerator to measure the responses from comparing code values.
 */
public enum Response {
    
    /**
     * Right place right color.
     */
    RIGHT_PLACE,
    /**
     * Right color wrong place.
     */
    WRONG_PLACE,
    /**
     * Wrong color.
     */
    NOT_PRESENT;

    public static String arrayToString(Response[] in) {
        StringBuilder sb = new StringBuilder();
        for (Response r : in) {
            switch (r){
                case RIGHT_PLACE:
                    sb.append('R');
                case WRONG_PLACE:
                    sb.append('W');
                case NOT_PRESENT:
                    sb.append('N');
                default:
                    break;
            }
        }
        return sb.toString();
    }
}
