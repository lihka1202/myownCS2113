public class Person implements Printable {

    private String name;

    // todo: add missing methods
    Person(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Person of name " + this.name);
    }
}
