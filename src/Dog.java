public class Dog {
    private String name;
    private double weight;
    private int age;

    public Dog() {
        name = "Unknown";
        weight = 0.0;
        age = 0;
    }

    public Dog(String nane, int age, double weight){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void speak(){
        System.out.println("Woof");
    }

    public String getName() { return name; }
    public void setName(String name) {this.name = name;}

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
