
public class Employee {
    private String name;
    private int id;
    private String p;
     private String d;

    public Employee(String name, int id, String p, String d) {
        this.name = name;
        this.id = id;
        this.p = p;
        this.d = d;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        p="";
        d="";}

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
    
    
}
