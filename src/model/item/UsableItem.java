package model.item;

import model.utils.InvokableThread;

import java.lang.reflect.Method;

/**
 * Created by david on 09/09/14.
 */
public abstract class UsableItem extends Item{
    private InvokableThread<UsableItem> ithread;
    public UsableItem(String name, String image) {
        super(name, image);
        init();
    }

    public UsableItem(String name, String image, double weight) {
        super(name, image, weight);
        init();
    }

    private void init() {
        try {
            this.ithread = new InvokableThread(this.getClass().getMethod("action"),this);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void use() {
        this.ithread.start();
    }

    protected abstract void action();
}
