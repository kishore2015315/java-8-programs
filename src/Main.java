import java.util.List;
import java.util.Optional;

public class Main {
    private static List<String> list;
    static {
        list.add("a");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = null;
        String k = String.valueOf(Optional.empty().map(s1 -> s1.hashCode()).orElse(2));
        System.out.println(k);
        Person a = new Person("kishore",24);
        System.out.println(a.toString());
    }

    static class Person {
        private String name;
        private int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Person{");
            sb.append("name='").append(name).append('\'');
            sb.append(", age=").append(age);
            sb.append('}');
            return sb.toString();
        }
    }
}