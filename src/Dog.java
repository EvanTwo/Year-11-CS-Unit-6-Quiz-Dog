public class Dog {

    private int age;
    private String name;
    private String color;

    public Dog(){
        age = 0;
        name = "";
        color = "";
    }

    public Dog(int a, String n, String c){
        age = a;
        name = n;
        color = c;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void addOneAge(){
        this.age++;
    }

    public int birthday(){
        this.addOneAge();
        return age;
    }

    public String toString(){
        return "The dog is named " + this.name + " and is " + age + " years old. This dog is " + this.color + ".";
    }




}
