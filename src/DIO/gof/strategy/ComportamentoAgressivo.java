package DIO.gof.strategy;


public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se em extremo alerta, ameaça por perto!!");
    }

}