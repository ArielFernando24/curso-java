/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.dto.v2.PersonDTOV2
 *  br.com.ariel.curso_java.mapper.custom.PersonMapper
 *  br.com.ariel.curso_java.model.Person
 *  org.springframework.stereotype.Service
 */
package br.com.ariel.curso_java.mapper.custom;

import br.com.ariel.curso_java.dto.v2.PersonDTOV2;
import br.com.ariel.curso_java.model.Person;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class PersonMapper {
    public PersonDTOV2 convertEntityToDTO(Person person) {
        PersonDTOV2 dto = new PersonDTOV2();
        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setAddress(person.getAddress());
        dto.setBirthDate(new Date());
        dto.setGender(person.getGender());
        return dto;
    }

    public Person convertToDTOEntity(PersonDTOV2 person) {
        Person entity = new Person();
        entity.setId(person.getId());
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        entity.setAge(person.getAge());
        return entity;
    }
}

