public class Person {
    String name;
    int age;
    String gender;
    String country;
    String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }
public Person(){}
    public Person(String name, int age, String gender, String country, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "\n"+"Person"  +
                " name=" + name  +
                "age=" + age +
                "gender=" + gender +
                "country=" + country +
                "city=" + city  ;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
