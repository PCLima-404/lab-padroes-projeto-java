package DIO.gof;

import DIO.gof.Facade.Facade;
import DIO.gof.Singleton.SingletonEager;
import DIO.gof.Singleton.SingletonLazy;
import DIO.gof.Singleton.SingletonLazyHolder;
import DIO.gof.strategy.Comportamento;
import DIO.gof.strategy.ComportamentoAgressivo;
import DIO.gof.strategy.ComportamentoDefensivo;
import DIO.gof.strategy.ComportamentoNormal;
import DIO.gof.strategy.Robo;

public class Main {

    public static void main(String[] args) {

//Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

//Stratefy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
//Facade
        Facade facade = new Facade();
        facade.migrarCliente("Pedro", "25603256");
    }

}