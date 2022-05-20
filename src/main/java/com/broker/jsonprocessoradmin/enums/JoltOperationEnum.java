package com.broker.jsonprocessoradmin.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum JoltOperationEnum {

    @JsonProperty("shift")
    SHIFT("shift"),
    @JsonProperty("default")
    DEFAULT("default"),
    @JsonProperty("remove")
    REMOVE("remove"),
    @JsonProperty("sort")
    SORT("sort"),
    @JsonProperty("cardinality")
    CARDINALITY("cardinality");

    public final String label;

    private JoltOperationEnum(String label) {
        this.label = label;
    }
}
