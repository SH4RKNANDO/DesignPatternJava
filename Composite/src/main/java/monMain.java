public class monMain {

    public static void main(String[] args) {

        /* Folders */
        Folder d1 = new Folder("Folder D1");
        Folder d2 = new Folder("Folder D2");
        Folder d3 = new Folder("Folder D3");

        /* Files */
        File f1 = new File("File F1", "Data of F1");
        File f2 = new File("File F2", "Data of F2");
        File f3 = new File("File F3", "Data of F3");

        /* Add File into Directory */
        d3.AddComponent(f3);
        d2.AddComponent(f2);
        d2.AddComponent(d3);

        /* Root Folder */
        d1.AddComponent(f1);
        d1.AddComponent(d2);

        /* Display All Components */
        d1.Display("");
    }
}
