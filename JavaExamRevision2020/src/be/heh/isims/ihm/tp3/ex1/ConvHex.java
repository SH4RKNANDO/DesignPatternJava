package be.heh.isims.ihm.tp3.ex1;

public class ConvHex implements IObserver {

    /* Default Builder */
    public ConvHex() { }

    @Override
    public void maj(int number) {
        System.out.println("La valeure Hexadécimal est : " + Integer.toHexString(number));
    }
}
