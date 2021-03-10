package be.heh.isims.ihm.tp3.ex1;

public class ConvOctale implements IObserver {

    /* Default Builder */
    public ConvOctale() { }


    @Override
    public void maj(int number) {
        System.out.println("La valeure octale est : " + Integer.toOctalString(number));
    }

}
