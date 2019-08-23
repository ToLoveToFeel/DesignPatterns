package SingletonPattern.Realization6;

public class EnumSingleton {
    private EnumSingleton(){}
    public static EnumSingleton getInstance()
    {
        return Singleton.INSTANCE.getSingleton();
    }

    public void showMessage()
    {
        System.out.println("Hello World six!");
    }

    private enum Singleton{
        INSTANCE(new EnumSingleton());
        private EnumSingleton singleton;
        //JVM会保证此方法绝对只调用一次
        Singleton(EnumSingleton singleton)
        {
            this.singleton = singleton;
        }
        public EnumSingleton getSingleton() {
            return singleton;
        }
    }
}
