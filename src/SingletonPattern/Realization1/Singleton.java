package SingletonPattern.Realization1;

public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance()
    {
        if (null == instance)
            instance = new Singleton();
        return instance;
    }

    public void showMessage()
    {
        System.out.println("Hello World one!");
    }
}
