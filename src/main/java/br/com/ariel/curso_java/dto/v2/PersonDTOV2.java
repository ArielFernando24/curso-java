/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.dto.v2.PersonDTOV2
 *  lombok.Generated
 */
package br.com.ariel.curso_java.dto.v2;

import java.io.Serializable;
import java.util.Date;
import lombok.Generated;

public class PersonDTOV2
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private Date birthDate;
    private String gender;
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
    public Date getBirthDate() {
        return this.birthDate;
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
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
        if (!(o instanceof PersonDTOV2)) {
            return false;
        }
        PersonDTOV2 other = (PersonDTOV2)o;
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
        Date this$birthDate = this.getBirthDate();
        Date other$birthDate = other.getBirthDate();
        if (this$birthDate == null ? other$birthDate != null : !((Object)this$birthDate).equals(other$birthDate)) {
            return false;
        }
        String this$gender = this.getGender();
        String other$gender = other.getGender();
        return !(this$gender == null ? other$gender != null : !this$gender.equals(other$gender));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PersonDTOV2;
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
        Date $birthDate = this.getBirthDate();
        result = result * 59 + ($birthDate == null ? 43 : ((Object)$birthDate).hashCode());
        String $gender = this.getGender();
        result = result * 59 + ($gender == null ? 43 : $gender.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PersonDTOV2(id=" + this.getId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", address=" + this.getAddress() + ", birthDate=" + String.valueOf(this.getBirthDate()) + ", gender=" + this.getGender() + ", age=" + this.getAge() + ")";
    }

    @Generated
    public PersonDTOV2(Long id, String firstName, String lastName, String address, Date birthDate, String gender, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthDate = birthDate;
        this.gender = gender;
        this.age = age;
    }

    @Generated
    public PersonDTOV2() {
    }
}

