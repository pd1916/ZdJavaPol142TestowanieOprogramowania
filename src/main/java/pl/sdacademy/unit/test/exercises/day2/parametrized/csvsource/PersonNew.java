package pl.sdacademy.unit.test.exercises.day2.parametrized.csvsource;

public class PersonNew {
    private final String name;
    private final int age;

    public PersonNew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonNew{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
