package model.evt;

/**
 * Created by david on 03/09/14.
 */
public class DamageDropsToZeroEvent extends GameEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DamageDropsToZeroEvent(Object source) {
        super(source);
    }
}
