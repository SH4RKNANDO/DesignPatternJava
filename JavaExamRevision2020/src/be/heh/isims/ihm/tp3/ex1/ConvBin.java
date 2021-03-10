package be.heh.isims.ihm.tp3.ex1;

public class ConvBin implements IObserver {

    /* Default Builder */
    public ConvBin() { }

    @Override
    public void maj(int number) {
        System.out.println("La valeure Binaire est : " + Integer.toBinaryString(number));
    }
}
