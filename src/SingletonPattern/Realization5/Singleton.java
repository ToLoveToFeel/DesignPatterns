package SingletonPattern.Realization5;

public class Singleton {
    private static class SingletonHoder{
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton(){}

    public static final Singleton getInstance()
    {
        return SingletonHoder.INSTANCE;
    }

    public void showMessage()
    {
        System.out.println("Hello World five!");
    }
}
