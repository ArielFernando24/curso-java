/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.model.Person
 *  br.com.ariel.curso_java.repository.PersonRepository
 *  org.springframework.data.jpa.repository.JpaRepository
 */
package br.com.ariel.curso_java.repository;

import br.com.ariel.curso_java.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository
extends JpaRepository<Person, Long> {
}

