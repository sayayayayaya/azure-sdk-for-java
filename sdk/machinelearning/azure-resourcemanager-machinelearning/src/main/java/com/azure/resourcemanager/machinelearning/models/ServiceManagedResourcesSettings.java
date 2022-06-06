// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ServiceManagedResourcesSettings model. */
@Fluent
public final class ServiceManagedResourcesSettings {
    /*
     * The settings for the service managed cosmosdb account.
     */
    @JsonProperty(value = "cosmosDb")
    private CosmosDbSettings cosmosDb;

    /**
     * Get the cosmosDb property: The settings for the service managed cosmosdb account.
     *
     * @return the cosmosDb value.
     */
    public CosmosDbSettings cosmosDb() {
        return this.cosmosDb;
    }

    /**
     * Set the cosmosDb property: The settings for the service managed cosmosdb account.
     *
     * @param cosmosDb the cosmosDb value to set.
     * @return the ServiceManagedResourcesSettings object itself.
     */
    public ServiceManagedResourcesSettings withCosmosDb(CosmosDbSettings cosmosDb) {
        this.cosmosDb = cosmosDb;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cosmosDb() != null) {
            cosmosDb().validate();
        }
    }
}