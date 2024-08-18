package PadroesComSpring.DIO.singleton;
//singleton lazy

public class SingletonLazu {
    private static SingletonLazu instancia;

    private SingletonLazu() {
        super();
    }

    public static SingletonLazu getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazu();
        }
        return instancia;
    }
}
