/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.mapper.ObjectMapper
 *  com.github.dozermapper.core.DozerBeanMapperBuilder
 *  com.github.dozermapper.core.Mapper
 */
package br.com.ariel.curso_java.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import java.util.ArrayList;
import java.util.List;

public class ObjectMapper {
    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <O, D> D parseObject(O origin, Class<D> destination) {
        return (D)mapper.map(origin, destination);
    }

    public static <O, D> List<D> parseListObject(List<O> origin, Class<D> destination) {
        ArrayList<Object> destinationObjects = new ArrayList<Object>();
        for (O o : origin) {
            destinationObjects.add(mapper.map(o, destination));
        }
        return destinationObjects;
    }
}

