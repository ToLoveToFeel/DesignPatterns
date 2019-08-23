/*                  双检锁/双重校验锁
JDK 版本：JDK1.5 起
是否 Lazy 初始化：是
是否多线程安全：是
实现难度：较复杂
描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
getSingleton() 的性能对应用程序很关键
 */
package SingletonPattern.Realization4;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.showMessage();
    }
}
