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
    private JoltOperationEnum operation;
    private Map<String, Object> spec;

    public JoltSpec () {}

    public JoltSpec (JoltSpecDTO dto) {
        this.id = dto.getId();
        this.operation = dto.getOperation();
        this.spec = dto.getSpec();
    }

    public JoltSpec (String id, JoltOperationEnum operation) {
        this.id = id;
        this.operation = operation;
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
