import javax.swing.*;

public class Sibling implements Status {
    private String name;
    private int age;
    private int weight;

    public Sibling(String n, int a, int w){
        this.name = n;
        this.age = a;
        this.weight = w;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getStatus(){
        String status = "Student\nAge="+age+", Name="+name+"Weight="+weight+"\n";
        return status;
    }

    public void displayStatus(){
        String status = getStatus();
        JOptionPane.showMessageDialog(null,status);
    }
}
