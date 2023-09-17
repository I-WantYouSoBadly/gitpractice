public class _27_Human {

    String name;
    int age;
    double weight;
    _27_Human(String name, int age, double weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void eat() {
        System.out.println(this.name+" is eating");
    }
    void drink() {
        System.out.println(this.name+" is drinking");
    }
}
