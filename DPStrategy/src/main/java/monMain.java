public class monMain {

    public static void main(String[] args) {

        /* Compression Generique */
        Fichier f11 = new Fichier("F1");
        Fichier f22 = new Fichier("F2");
        System.out.println(f11.GetCompression());
        System.out.println(f22.GetCompression());

        /* Compression avec Constructeur Override */
        Fichier f1 = new Fichier(new CompressionRar(), "F1");
        Fichier f2 = new Fichier(new CompressionZip(), "F2");
        System.out.println(f1.GetCompression());
        System.out.println(f2.GetCompression());


        /* Compression en ZIP */
        f1.SetCompression(new CompressionZip());
        f2.SetCompression(new CompressionRar());
        System.out.println(f1.GetCompression());
        System.out.println(f2.GetCompression());

        /* Changement de Compression Dynamique => DP Strategy*/
    }

}
