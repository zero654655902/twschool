package practice_4;

/**
 * Created by lwan on 24/07/2017.
 */
public class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String introduce() {
        return "My name is "+this.name+", I am "+this.age+" years old.";
    }
}
