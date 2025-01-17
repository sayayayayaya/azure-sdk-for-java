// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AnomalyDimensionList model. */
@Fluent
public final class AnomalyDimensionList {
    /*
     * The @nextLink property.
     */
    @JsonProperty(value = "@nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private List<String> value;

    /** Creates an instance of AnomalyDimensionList class. */
    public AnomalyDimensionList() {}

    /**
     * Get the nextLink property: The @nextLink property.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<String> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the AnomalyDimensionList object itself.
     */
    public AnomalyDimensionList setValue(List<String> value) {
        this.value = value;
        return this;
    }
}
