package design_patterns.singleton;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){
        //To restrict users to perform object creation for Singleton class using Constructor
    }

    public static Singleton getSingletonInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton1=Singleton.getSingletonInstance();
        Singleton singleton2=Singleton.getSingletonInstance();
        Singleton singleton3=Singleton.getSingletonInstance();
        Singleton singleton4=Singleton.getSingletonInstance();

        System.out.println(" singleton1 "+singleton1);
        System.out.println(" singleton2 "+singleton2);
        System.out.println(" singleton3 "+singleton3);
        System.out.println(" singleton4 "+singleton4);
    }
}
