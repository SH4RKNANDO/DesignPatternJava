public class Fichier {

    /* Attributs */
    private String name;

    /* Getter / Setter */
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name; }
    public ICompression compression;

    /* Default Builder */
    public Fichier(ICompression _cmp) { compression = _cmp; };

    /* Display the type of Compression */
    public void GetCompression() { compression.Compression(); }


    /* Display the type of Compression */
    public void SetCompression(ICompression Ic) { compression = Ic; }
}
