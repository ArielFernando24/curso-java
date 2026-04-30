/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.dto.v1.PersonDTO
 *  br.com.ariel.curso_java.serializer.GenderSerializer
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.fasterxml.jackson.databind.annotation.JsonSerialize
 *  lombok.Generated
 *  org.springframework.hateoas.RepresentationModel
 */
package br.com.ariel.curso_java.dto.v1;

import br.com.ariel.curso_java.serializer.GenderSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.util.Date;
import lombok.Generated;
import org.springframework.hateoas.RepresentationModel;

public class PersonDTO
extends RepresentationModel<PersonDTO>
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String firstName;
    @JsonInclude(value=JsonInclude.Include.NON_NULL)
    private String lastName;
    @JsonInclude(value=JsonInclude.Include.NON_EMPTY)
    private String phoneNumber;
    private String address;
    @JsonSerialize(using=GenderSerializer.class)
    private String gender;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date birthDate;
    private Integer age;
    @JsonIgnore
    private String sensitiveData;

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
    public String getPhoneNumber() {
        return this.phoneNumber;
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
    public Date getBirthDate() {
        return this.birthDate;
    }

    @Generated
    public Integer getAge() {
        return this.age;
    }

    @Generated
    public String getSensitiveData() {
        return this.sensitiveData;
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
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Generated
    public void setAddress(String address) {
        this.address = address;
    }

    @Generated
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonFormat(pattern="dd/MM/yyyy")
    @Generated
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Generated
    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonIgnore
    @Generated
    public void setSensitiveData(String sensitiveData) {
        this.sensitiveData = sensitiveData;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PersonDTO)) {
            return false;
        }
        PersonDTO other = (PersonDTO)o;
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
        String this$phoneNumber = this.getPhoneNumber();
        String other$phoneNumber = other.getPhoneNumber();
        if (this$phoneNumber == null ? other$phoneNumber != null : !this$phoneNumber.equals(other$phoneNumber)) {
            return false;
        }
        String this$address = this.getAddress();
        String other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) {
            return false;
        }
        String this$gender = this.getGender();
        String other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) {
            return false;
        }
        Date this$birthDate = this.getBirthDate();
        Date other$birthDate = other.getBirthDate();
        if (this$birthDate == null ? other$birthDate != null : !((Object)this$birthDate).equals(other$birthDate)) {
            return false;
        }
        String this$sensitiveData = this.getSensitiveData();
        String other$sensitiveData = other.getSensitiveData();
        return !(this$sensitiveData == null ? other$sensitiveData != null : !this$sensitiveData.equals(other$sensitiveData));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PersonDTO;
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
        String $phoneNumber = this.getPhoneNumber();
        result = result * 59 + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
        String $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        String $gender = this.getGender();
        result = result * 59 + ($gender == null ? 43 : $gender.hashCode());
        Date $birthDate = this.getBirthDate();
        result = result * 59 + ($birthDate == null ? 43 : ((Object)$birthDate).hashCode());
        String $sensitiveData = this.getSensitiveData();
        result = result * 59 + ($sensitiveData == null ? 43 : $sensitiveData.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PersonDTO(id=" + this.getId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", phoneNumber=" + this.getPhoneNumber() + ", address=" + this.getAddress() + ", gender=" + this.getGender() + ", birthDate=" + String.valueOf(this.getBirthDate()) + ", age=" + this.getAge() + ", sensitiveData=" + this.getSensitiveData() + ")";
    }

    @Generated
    public PersonDTO(Long id, String firstName, String lastName, String phoneNumber, String address, String gender, Date birthDate, Integer age, String sensitiveData) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.birthDate = birthDate;
        this.age = age;
        this.sensitiveData = sensitiveData;
    }

    @Generated
    public PersonDTO() {
    }
}

