package SingletonPattern.Realization4;

public class Singleton {
    private volatile static Singleton singleton;
    private Singleton(){}

    public static Singleton getSingleton()
    {
        if (null == singleton)
        {
            synchronized (Singleton.class)
            {
                if (null == singleton)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }

    public void showMessage()
    {
        System.out.println("Hello World four!");
    }
}
