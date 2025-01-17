// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.models.TableGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.models.TableGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An Azure Cosmos DB Table. */
@Fluent
public final class TableGetResultsInner extends ArmResourceProperties {
    /*
     * The properties of an Azure Cosmos DB Table
     */
    @JsonProperty(value = "properties")
    private TableGetProperties innerProperties;

    /** Creates an instance of TableGetResultsInner class. */
    public TableGetResultsInner() {
    }

    /**
     * Get the innerProperties property: The properties of an Azure Cosmos DB Table.
     *
     * @return the innerProperties value.
     */
    private TableGetProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public TableGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TableGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public TableGetPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the TableGetResultsInner object itself.
     */
    public TableGetResultsInner withResource(TableGetPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TableGetProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public TableGetPropertiesOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the TableGetResultsInner object itself.
     */
    public TableGetResultsInner withOptions(TableGetPropertiesOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TableGetProperties();
        }
        this.innerProperties().withOptions(options);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
