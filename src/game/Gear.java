package game;

/**
 * Interface all gears has combine
 */

//todo do we need to add all methods in abstractGear to interface?
public interface Gear{
    Gear combine(Gear gear);
}
