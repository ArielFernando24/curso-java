/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.controllers.PersonController
 *  br.com.ariel.curso_java.dto.v1.PersonDTO
 *  br.com.ariel.curso_java.dto.v2.PersonDTOV2
 *  br.com.ariel.curso_java.exception.ResourceNotFoundException
 *  br.com.ariel.curso_java.mapper.ObjectMapper
 *  br.com.ariel.curso_java.mapper.custom.PersonMapper
 *  br.com.ariel.curso_java.model.Person
 *  br.com.ariel.curso_java.repository.PersonRepository
 *  br.com.ariel.curso_java.services.PersonService
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
 *  org.springframework.stereotype.Service
 */
package br.com.ariel.curso_java.services;

import br.com.ariel.curso_java.controllers.PersonController;
import br.com.ariel.curso_java.dto.v1.PersonDTO;
import br.com.ariel.curso_java.dto.v2.PersonDTOV2;
import br.com.ariel.curso_java.exception.ResourceNotFoundException;
import br.com.ariel.curso_java.mapper.ObjectMapper;
import br.com.ariel.curso_java.mapper.custom.PersonMapper;
import br.com.ariel.curso_java.model.Person;
import br.com.ariel.curso_java.repository.PersonRepository;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final Logger logger = Logger.getLogger(PersonService.class.getName());
    @Autowired
    PersonRepository repository;
    @Autowired
    PersonMapper converter;

    public List<PersonDTO> findAll() {
        this.logger.info("Finding all people!");
        List persons = ObjectMapper.parseListObject((List)this.repository.findAll(), PersonDTO.class);
        persons.forEach(arg_0 -> this.addHateoasLinks(arg_0));
        return persons;
    }

    public PersonDTO findById(Long id) {
        this.logger.info("Finding one person!");
        Person entity = (Person)this.repository.findById((Object)id).orElseThrow(() -> new ResourceNotFoundException("Person not found with id " + id));
        PersonDTO dto = (PersonDTO)ObjectMapper.parseObject((Object)entity, PersonDTO.class);
        this.addHateoasLinks(dto);
        return dto;
    }

    public PersonDTO create(PersonDTO person) {
        this.logger.info("Creating one person!");
        Person entity = (Person)ObjectMapper.parseObject((Object)person, Person.class);
        PersonDTO dto = (PersonDTO)ObjectMapper.parseObject((Object)((Person)this.repository.save((Object)entity)), PersonDTO.class);
        this.addHateoasLinks(dto);
        return dto;
    }

    public PersonDTOV2 createV2(PersonDTOV2 person) {
        this.logger.info("Creating one person V2!");
        Person entity = this.converter.convertToDTOEntity(person);
        return this.converter.convertEntityToDTO((Person)this.repository.save((Object)entity));
    }

    public PersonDTO update(PersonDTO person) {
        this.logger.info("Updating one person!");
        Person entity = (Person)this.repository.findById((Object)person.getId()).orElseThrow(() -> new ResourceNotFoundException("Person not found with id " + person.getId()));
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        PersonDTO dto = (PersonDTO)ObjectMapper.parseObject((Object)((Person)this.repository.save((Object)entity)), PersonDTO.class);
        this.addHateoasLinks(dto);
        return dto;
    }

    public void delete(Long id) {
        this.logger.info("Deleting one person!");
        Person entity = (Person)this.repository.findById((Object)id).orElseThrow(() -> new ResourceNotFoundException("Person not found with id " + id));
        this.repository.delete((Object)entity);
    }

    private void addHateoasLinks(PersonDTO dto) {
        dto.add(WebMvcLinkBuilder.linkTo((Object)((PersonController)WebMvcLinkBuilder.methodOn(PersonController.class, (Object[])new Object[0])).findById(dto.getId())).withSelfRel().withType("GET"));
        dto.add(WebMvcLinkBuilder.linkTo((Object)((PersonController)WebMvcLinkBuilder.methodOn(PersonController.class, (Object[])new Object[0])).findAll()).withRel("findAll").withType("GET"));
        dto.add(WebMvcLinkBuilder.linkTo((Object)((PersonController)WebMvcLinkBuilder.methodOn(PersonController.class, (Object[])new Object[0])).create(dto)).withRel("create").withType("POST"));
        dto.add(WebMvcLinkBuilder.linkTo((Object)((PersonController)WebMvcLinkBuilder.methodOn(PersonController.class, (Object[])new Object[0])).update(dto)).withRel("update").withType("PUT"));
        dto.add(WebMvcLinkBuilder.linkTo((Object)((PersonController)WebMvcLinkBuilder.methodOn(PersonController.class, (Object[])new Object[0])).delete(dto.getId())).withRel("delete").withType("DELETE"));
    }
}

