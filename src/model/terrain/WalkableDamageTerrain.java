package model.terrain;

/**
 * Created by david on 03/09/14.
 */
public class WalkableDamageTerrain extends WalkableTerrain{
    private int damage;

    public WalkableDamageTerrain(String image, int damage) {
        super(image);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
