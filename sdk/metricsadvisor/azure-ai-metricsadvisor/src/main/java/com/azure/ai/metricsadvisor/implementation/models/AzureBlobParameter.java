// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureBlobParameter model. */
@Fluent
public final class AzureBlobParameter {
    /*
     * The connection string of this Azure Blob
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * The container name in this Azure Blob
     */
    @JsonProperty(value = "container", required = true)
    private String container;

    /*
     * The path template in this container
     */
    @JsonProperty(value = "blobTemplate", required = true)
    private String blobTemplate;

    /** Creates an instance of AzureBlobParameter class. */
    public AzureBlobParameter() {}

    /**
     * Get the connectionString property: The connection string of this Azure Blob.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of this Azure Blob.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureBlobParameter object itself.
     */
    public AzureBlobParameter setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the container property: The container name in this Azure Blob.
     *
     * @return the container value.
     */
    public String getContainer() {
        return this.container;
    }

    /**
     * Set the container property: The container name in this Azure Blob.
     *
     * @param container the container value to set.
     * @return the AzureBlobParameter object itself.
     */
    public AzureBlobParameter setContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * Get the blobTemplate property: The path template in this container.
     *
     * @return the blobTemplate value.
     */
    public String getBlobTemplate() {
        return this.blobTemplate;
    }

    /**
     * Set the blobTemplate property: The path template in this container.
     *
     * @param blobTemplate the blobTemplate value to set.
     * @return the AzureBlobParameter object itself.
     */
    public AzureBlobParameter setBlobTemplate(String blobTemplate) {
        this.blobTemplate = blobTemplate;
        return this;
    }
}
