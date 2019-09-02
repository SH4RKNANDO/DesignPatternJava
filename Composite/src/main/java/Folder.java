import sun.awt.X11.XSystemTrayPeer;

import java.util.ArrayList;

public class Folder implements IFileComponent {

    /* Attributs */
    private String name;
    private ArrayList<IFileComponent> fileComponents = new ArrayList<>();

    /* Getter / Setter */
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name; }

    /* Add the Component to list of components */
    public void AddComponent(IFileComponent component) {  fileComponents.add(component); }

    /* Default builder */
    public Folder() { }


    /* Builder with Surcharge */
    public Folder(String name) {  setName(name); }

    @Override
    public void Display(String s) {
        s += s;
        System.out.println(s + name);
        for(IFileComponent file: fileComponents ) {  file.Display(s);  }
    }
}
