package DIO.gof.strategy;


public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se atentamente... Possiveis ameaças detectadas");
    }

}