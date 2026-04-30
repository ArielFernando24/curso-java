/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.model.Person
 *  jakarta.persistence.Column
 *  jakarta.persistence.Entity
 *  jakarta.persistence.GeneratedValue
 *  jakarta.persistence.GenerationType
 *  jakarta.persistence.Id
 *  jakarta.persistence.Table
 *  lombok.Generated
 */
package br.com.ariel.curso_java.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Generated;

@Entity
@Table(name="person")
public class Person
implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name", nullable=false, length=80)
    private String firstName;
    @Column(name="last_name", nullable=false, length=80)
    private String lastName;
    @Column(name="address", nullable=false, length=100)
    private String address;
    @Column(nullable=false, length=6)
    private String gender;
    @Column(nullable=true)
    private Integer age;

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getFirstName() {
        return this.firstName;
    }

    @Generated
    public String getLastName() {
        return this.lastName;
    }

    @Generated
    public String getAddress() {
        return this.address;
    }

    @Generated
    public String getGender() {
        return this.gender;
    }

    @Generated
    public Integer getAge() {
        return this.age;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Generated
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Generated
    public void setAddress(String address) {
        this.address = address;
    }

    @Generated
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Generated
    public void setAge(Integer age) {
        this.age = age;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person other = (Person)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$age = this.getAge();
        Integer other$age = other.getAge();
        if (this$age == null ? other$age != null : !((Object)this$age).equals(other$age)) {
            return false;
        }
        String this$firstName = this.getFirstName();
        String other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) {
            return false;
        }
        String this$lastName = this.getLastName();
        String other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) {
            return false;
        }
        String this$address = this.getAddress();
        String other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) {
            return false;
        }
        String this$gender = this.getGender();
        String other$gender = other.getGender();
        return !(this$gender == null ? other$gender != null : !this$gender.equals(other$gender));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof Person;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $age = this.getAge();
        result = result * 59 + ($age == null ? 43 : ((Object)$age).hashCode());
        String $firstName = this.getFirstName();
        result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
        String $lastName = this.getLastName();
        result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
        String $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        String $gender = this.getGender();
        result = result * 59 + ($gender == null ? 43 : $gender.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "Person(id=" + this.getId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", address=" + this.getAddress() + ", gender=" + this.getGender() + ", age=" + this.getAge() + ")";
    }

    @Generated
    public Person(Long id, String firstName, String lastName, String address, String gender, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    @Generated
    public Person() {
    }
}

