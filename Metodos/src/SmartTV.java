public class SmartTV {
    boolean ligada = false;
    int canal = 5;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarrVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;

        System.out.println("Volume: " + volume);
    }

    public void subirCanal() {
        canal++;

        System.out.println("Canal " + canal);
    }

    public void descerCanal() {
        canal--;
        System.out.println("Canal " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal " + canal);
    }

}
