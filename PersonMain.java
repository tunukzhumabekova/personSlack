import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
Person person0=new Person();
Person person1=new Person();
Person person2=new Person();
Person person3=new Person();
Person person4=new Person();
        Person person5=new Person("Frank",35, "Male", "France","Paris");
        Person person6=new Person("Grace", 29, "Female","Italy","Rome");
        Person person7=new Person("Henry", 33, "Male","Spain", "Madrid");
        Person person8=new Person("Ivy", 27, "Female", "Japan", "Tokyo");
        Person person9=new Person( "John", 31, "Male", "Brazil", "Rio de Janeiro");

person0.setName("Alice");
person1.setName("Bob");
person2.setName("Carol");
person3.setName("David");
person4.setName("Eva");

person0.setAge(25);
person1.setAge(30);
person2.setAge(22);
person3.setAge(40);
person4.setAge(28);

person0.setGender("Female");
person1.setGender("Male");
person2.setGender("Male");
person3.setGender("Male");
person4.setGender("Female");

person0.setCountry("USA");
person1.setCountry("Canada");
person2.setCountry("UK");
person3.setCountry("Australia");
person4.setCountry("Germany");

person0.setCity("New York");
person1.setCity("Toronto");
person2.setCity("London");
person3.setCity("Sydney");
person4.setCity("Berlin");

Person[] people={person0,person1,person2,person3,person4,person5,person6,person7,person8,person9};
        System.out.println(Arrays.toString(new Person[]{maxAge(people)}));
        System.out.println(Arrays.toString(getAllPeopleByGender(people,"Male")));
        System.out.println(Arrays.toString(getAllPeopleByGender(people,"Female")));


    } public static Person maxAge(Person[] people) {
        Person person = people [0];
        for (int i = 0; i < people.length; i++) {
            if (people[i].age > person.age) {
                person = people[i];
            }
        }
        return person;
    }
    public static Person [] getAllPeopleByGender(Person[]people,String gender){
        Person[] ByGender = new Person[0];
        for (Person people1 : people) {
            if (people1.getGender().equals(gender)) {
                ByGender = Arrays.copyOf(ByGender, ByGender.length + 1);
                ByGender[ByGender.length - 1] = people1;
            }
        }

        return ByGender;

    }
    }
