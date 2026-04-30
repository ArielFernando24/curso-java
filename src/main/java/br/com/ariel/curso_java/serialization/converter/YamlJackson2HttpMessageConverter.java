/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.serialization.converter.YamlJackson2HttpMessageConverter
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.fasterxml.jackson.dataformat.yaml.YAMLMapper
 *  org.springframework.http.MediaType
 *  org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter
 */
package br.com.ariel.curso_java.serialization.converter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

public final class YamlJackson2HttpMessageConverter
extends AbstractJackson2HttpMessageConverter {
    protected YamlJackson2HttpMessageConverter() {
        super(new YAMLMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL), MediaType.parseMediaType((String)"application/x-yaml"));
    }
}

