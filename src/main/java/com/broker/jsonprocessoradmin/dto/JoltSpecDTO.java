package com.broker.jsonprocessoradmin.dto;

import java.util.Map;

import com.broker.jsonprocessoradmin.entities.JoltSpec;
import com.broker.jsonprocessoradmin.enums.JoltOperationEnum;
import com.broker.jsonprocessoradmin.util.SpecMapDeserializer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class JoltSpecDTO {

    private String id;
    private JoltOperationEnum operation;

    @JsonProperty("spec")
    @JsonDeserialize(using = SpecMapDeserializer.class)
    private Map<String, Object> spec;

    public JoltSpecDTO() {}

    @JsonCreator
    public JoltSpecDTO(String id, JoltOperationEnum operation, Map<String, Object> spec) {
        this.id = id;
        this.operation = operation;
        this.spec = spec;
    }

    public JoltSpecDTO(JoltSpec spec) {
        this.id = spec.getId();
        this.operation = spec.getOperation();
        this.spec = spec.getSpec();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JoltOperationEnum getOperation() {
        return operation;
    }

    public void setOperation(JoltOperationEnum operation) {
        this.operation = operation;
    }

    public Map<String, Object> getSpec() {
        return spec;
    }

    public void setSpec(Map<String, Object> spec) {
        this.spec = spec;
    }
}
