public class _27_Constructors {
    public static void main(String[] args) {

        _27_Human human = new _27_Human("Rick", 65, 70);
        _27_Human human2 = new _27_Human("Morty", 16, 50);

        //System.out.println(human.name);
        //System.out.println(human2.name);

        human2.eat();
        human.drink();

    }
}
