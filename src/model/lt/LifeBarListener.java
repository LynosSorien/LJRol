package model.lt;

import model.evt.DamageDropsToZeroEvent;
import model.evt.DamageReceivedEvent;

/**
 * Created by david on 03/09/14.
 */
public interface LifeBarListener extends CharacterListener
{
    public void onDamageReceived(DamageReceivedEvent dre);
    public void onLifeBarDropsToZero(DamageDropsToZeroEvent ddtze);
}
