package model.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by david on 09/09/14.
 */
public class InvokableThread<V> extends Thread{
    private Method method;
    private V object;
    private Object[] parameters;
    public InvokableThread(Method method, V object, Object ... parameters) {
        this.method = method;
        this.parameters = parameters;
        this.object = object;
    }
    @Override
    public void run() {
        try {
            this.method.invoke(object, parameters);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}