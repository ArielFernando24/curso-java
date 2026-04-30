/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.config.WebConfig
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.http.MediaType
 *  org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer
 *  org.springframework.web.servlet.config.annotation.WebMvcConfigurer
 */
package br.com.ariel.curso_java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig
implements WebMvcConfigurer {
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(false).ignoreAcceptHeader(false).useRegisteredExtensionsOnly(false).defaultContentType(new MediaType[]{MediaType.APPLICATION_JSON}).mediaType("json", MediaType.APPLICATION_JSON).mediaType("xml", MediaType.APPLICATION_XML).mediaType("yaml", MediaType.APPLICATION_YAML);
    }
}

