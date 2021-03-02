package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {
   private String name;
   private String sBirthDay;
   private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() throws Exception{
        Date birthDay=new SimpleDateFormat("dd/MM/yyyy").parse(sBirthDay);

        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.sBirthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person() {
    }

    public Person(String name, String birthDay, String gender) {
        this.name = name;
        this.sBirthDay = birthDay;
        this.gender = gender;
    }
    @Override
    public int compareTo(Person anotherDate) {
        try {
            return this.getBirthDay().compareTo(anotherDate.getBirthDay());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sBirthDay='" + sBirthDay + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
