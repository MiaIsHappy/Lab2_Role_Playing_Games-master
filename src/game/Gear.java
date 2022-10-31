package game;

/**
 * Interface all gears has combine
 */

public interface Gear{

    /**
     * combines the powers and name if they are the same type
     * @param gear
     * @return
     */
    Gear combine(Gear gear);
}
