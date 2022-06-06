// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.communication.fluent.models.DomainResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Object that includes an array of Domains resource and a possible link for next set. */
@Fluent
public final class DomainResourceList {
    /*
     * List of Domains resource
     */
    @JsonProperty(value = "value")
    private List<DomainResourceInner> value;

    /*
     * The URL the client should use to fetch the next page (per server side
     * paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Domains resource.
     *
     * @return the value value.
     */
    public List<DomainResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Domains resource.
     *
     * @param value the value value to set.
     * @return the DomainResourceList object itself.
     */
    public DomainResourceList withValue(List<DomainResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL the client should use to fetch the next page (per server side paging). It's
     * null for now, added for future use.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL the client should use to fetch the next page (per server side paging). It's
     * null for now, added for future use.
     *
     * @param nextLink the nextLink value to set.
     * @return the DomainResourceList object itself.
     */
    public DomainResourceList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}