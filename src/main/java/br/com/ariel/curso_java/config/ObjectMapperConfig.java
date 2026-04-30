/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.config.ObjectMapperConfig
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  com.fasterxml.jackson.databind.ser.FilterProvider
 *  com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
 *  com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider
 *  org.springframework.context.annotation.Bean
 */
package br.com.ariel.curso_java.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.context.annotation.Bean;

public class ObjectMapperConfig {
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        SimpleFilterProvider filterProvider = new SimpleFilterProvider().addFilter("PersonFilter", SimpleBeanPropertyFilter.serializeAllExcept((String[])new String[]{"sensitiveData"}));
        mapper.setFilterProvider((FilterProvider)filterProvider);
        return mapper;
    }
}

