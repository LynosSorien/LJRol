package model.evt;

import java.util.EventObject;

/**
 * Created by david on 03/09/14.
 */
public class GameEvent extends EventObject{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public GameEvent(Object source) {
        super(source);
    }
}
