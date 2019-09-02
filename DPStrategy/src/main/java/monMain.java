public class monMain {

    public static void main(String[] args) {

        /* Create the File */
        Fichier f1 = new Fichier(new CompressionRar());
        Fichier f2 = new Fichier(new CompressionZip());

        /* Get File Compression */
        f1.GetCompression();
        f2.GetCompression();

        /* Change Compression Type */
         f1.SetCompression(new CompressionZip());
         f2.SetCompression(new CompressionRar());

        /* Get File Compression */
        f1.GetCompression();
        f2.GetCompression();
    }

}
