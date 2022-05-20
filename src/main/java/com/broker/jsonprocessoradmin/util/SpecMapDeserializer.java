package com.broker.jsonprocessoradmin.util;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SpecMapDeserializer extends JsonDeserializer<Map<String, Object>>{

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public Map<String, Object> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        TypeReference<Map<String, Object>> typeRef = new TypeReference<Map<String,Object>>() {};
        return mapper.readValue(p, typeRef);
    }  
}
