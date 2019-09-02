public class File implements IFileComponent {

    /* Attributs */
    private String name;
    private String data;

    /* Getter / Setter */
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name; }
    public String getData() {  return data;  }
    public void setData(String data) {  this.data = data;  }

    /*Default Builder*/
    public File() {}


    /* Builder with Surcharge */
    public File(String name, String data) {  setName(name); setData(data); }


    @Override
    public void Display(String s) {
        s += s;
        System.out.println(s + getName() + "  data : " + data );
    }

}

