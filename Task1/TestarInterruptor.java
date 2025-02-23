class Interruptor {
    boolean ligado;

    public Interruptor() {
        this.ligado = false;
    }

    public void pressionar() {
        ligado = !ligado;
    }

    public void verificarLampada() {
        if (ligado) {
            System.out.println("A luz está acesa");
        } else {
            System.out.println("A luz está apagada");
        }
    }
}

public class TestarInterruptor {
    public static void main(String[] args) {
        Interruptor interruptor = new Interruptor();

        interruptor.pressionar();
        interruptor.verificarLampada();
// Saida esperada apos troca "A luz está apagada"
        interruptor.pressionar();
        interruptor.verificarLampada();
    }
}
