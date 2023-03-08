import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class Main {
    private static List list;
    static {
        list = new ArrayList<Integer>();
        list.add(1);
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        String s = null;
        String k = String.valueOf(Optional.empty().map(s1 -> s1.hashCode()).orElse(2));
        System.out.println(k);
        Person a = new Person("kishore","A");
        System.out.println(a.toString());
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("hai",1);
        map.put("hello",2);
        map.forEach((k1,v)->{
            System.out.println(k1+","+v);

        });
       datesPoc();
        File f = new File("src/data.csv");
        f.createNewFile();
        FileWriter fileWriter = new FileWriter(f);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("id,name,course");
        printWriter.flush();
        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String contents="";
        while((contents=bufferedReader.readLine())!=null){
            System.out.println(contents);
            String s1 [] = contents.split(",");
            Person p = new Person(s1[0],String.valueOf(s1[1]));
            System.out.println(p);
        }

    }

    static class Person {
        private String name;
        private String age;
        Person(String name, String age) {
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
    private static void datesPoc(){
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(date.isAfter(LocalDate.of(2020,12,23)));
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}