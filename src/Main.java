import java.util.*;

public class Main {
    private static List list;
    static {
        list = new ArrayList<Integer>();
        list.add(1);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = null;
        String k = String.valueOf(Optional.empty().map(s1 -> s1.hashCode()).orElse(2));
        System.out.println(k);
        Person a = new Person("kishore",24);
        System.out.println(a.toString());
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("hai",1);
        map.put("hello",2);
        map.forEach((k1,v)->{
            System.out.println(k1+","+v);

        });
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