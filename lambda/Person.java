package lambda;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;

/**
 * Person Pojo.
 */
@Data
public class Person {
  private String givenName;
  private String surName;
  private int age;
  private Character gender;
  private String email;
  private String phoneNumber;
  private String address;

  /**
   * Inner static class Builder to enable instantiating Person object using Builder().
   */
  public static class Builder {
    private String givenName = "";
    private String surName = "";
    private int age = 0;
    private Character gender = 'F';
    private String email = "";
    private String phoneNumber = "";
    private String address = "";

    public Person.Builder givenName(String givenName) {
      this.givenName = givenName;
      return this;
    }

    public Person.Builder surName(String surName) {
      this.surName = surName;
      return this;
    }

    public Person.Builder age(int val) {
      age = val;
      return this;
    }

    public Person.Builder gender(Character val) {
      gender = val;
      return this;
    }

    public Person.Builder email(String val) {
      email = val;
      return this;
    }

    public Person.Builder phoneNumber(String val) {
      phoneNumber = val;
      return this;
    }

    public Person.Builder address(String val) {
      address = val;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }

  private Person() {
    super();
  }

  private Person(Person.Builder builder) {
    givenName = builder.givenName;
    surName = builder.surName;
    age = builder.age;
    gender = builder.gender;
    email = builder.email;
    phoneNumber = builder.phoneNumber;
    address = builder.address;

  }

  public String getGivenName() {
    return givenName;
  }

  public String getSurName() {
    return surName;
  }

  public int getAge() {
    return age;
  }

  public Character getGender() {
    return gender;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getAddress() {
    return address;
  }

  /**
   * creatShortList() method uses builder pattern to create a list of Person object.

   * @return returns list of Person object.
   */
  public static List<Person> createShortList() {
    List<Person> personList = new ArrayList<>();

    personList.add(new Person.Builder()
            .givenName("Poonam")
            .surName("Bansal")
            .age(30)
            .gender('F')
            .email("poonam.bansal@example.com")
            .phoneNumber("9745000111")
            .address("Whitefield")
            .build());

    personList.add(new Person.Builder()
        .givenName("Yashwant")
        .surName("Yashu")
        .age(35)
        .gender('M')
        .email("yashwant.yashu@example.com")
        .phoneNumber("8095000111")
        .address("Whitefield")
        .build());

    personList.add(new Person.Builder()
        .givenName("Viti")
        .surName("Avani")
        .age(18)
        .gender('F')
        .email("viti.avani@example.com")
        .phoneNumber("1234567890")
        .address("Whitefield")
        .build());

    return personList;
  }
}
