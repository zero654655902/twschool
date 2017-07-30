package practice_13;

/**
 * Created by lwan on 30/07/2017.
 */
public class Person {
    private final String id;
    protected final String name;
    private final int age;

    private final String introduceFormat="My name is %s, I am %d years old.";
    public Person(String id, String name, int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }


    public String introduce() {
        return String.format(introduceFormat,this.name,this.age) ;
    }

    public boolean isSameTo(Person person) {
        return this.id==person.id;
    }
}
