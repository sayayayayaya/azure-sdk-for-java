// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobErrors model. */
@Fluent
public final class JobErrors {
    /*
     * The errors property.
     */
    @JsonProperty(value = "errors")
    private List<Error> errors;

    /**
     * Get the errors property: The errors property.
     *
     * @return the errors value.
     */
    public List<Error> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: The errors property.
     *
     * @param errors the errors value to set.
     * @return the JobErrors object itself.
     */
    public JobErrors setErrors(List<Error> errors) {
        this.errors = errors;
        return this;
    }
}