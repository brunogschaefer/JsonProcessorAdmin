package com.broker.jsonprocessoradmin.entities;

import java.util.Map;

import com.broker.jsonprocessoradmin.dto.JoltSpecDTO;
import com.broker.jsonprocessoradmin.enums.JoltOperationEnum;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("spec")
public class JoltSpec {

    @Id
    private String id;
    private String name;
    private JoltOperationEnum operation;
    private Map<String, Object> spec;

    public JoltSpec () {}

    public JoltSpec (JoltSpecDTO dto) {
        this.id = dto.getId();
        this.name = dto.getName();
        this.operation = dto.getOperation();
        this.spec = dto.getSpec();
    }

    public JoltSpec (String id, String name, JoltOperationEnum operation) {
        this.id = id;
        this.name = name;
        this.operation = operation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
