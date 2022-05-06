// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration settings of the Azure Active Directory default authorization policy. */
@Fluent
public final class DefaultAuthorizationPolicy {
    /*
     * The configuration settings of the Azure Active Directory allowed
     * principals.
     */
    @JsonProperty(value = "allowedPrincipals")
    private AllowedPrincipals allowedPrincipals;

    /*
     * The configuration settings of the Azure Active Directory allowed
     * applications.
     */
    @JsonProperty(value = "allowedApplications")
    private List<String> allowedApplications;

    /**
     * Get the allowedPrincipals property: The configuration settings of the Azure Active Directory allowed principals.
     *
     * @return the allowedPrincipals value.
     */
    public AllowedPrincipals allowedPrincipals() {
        return this.allowedPrincipals;
    }

    /**
     * Set the allowedPrincipals property: The configuration settings of the Azure Active Directory allowed principals.
     *
     * @param allowedPrincipals the allowedPrincipals value to set.
     * @return the DefaultAuthorizationPolicy object itself.
     */
    public DefaultAuthorizationPolicy withAllowedPrincipals(AllowedPrincipals allowedPrincipals) {
        this.allowedPrincipals = allowedPrincipals;
        return this;
    }

    /**
     * Get the allowedApplications property: The configuration settings of the Azure Active Directory allowed
     * applications.
     *
     * @return the allowedApplications value.
     */
    public List<String> allowedApplications() {
        return this.allowedApplications;
    }

    /**
     * Set the allowedApplications property: The configuration settings of the Azure Active Directory allowed
     * applications.
     *
     * @param allowedApplications the allowedApplications value to set.
     * @return the DefaultAuthorizationPolicy object itself.
     */
    public DefaultAuthorizationPolicy withAllowedApplications(List<String> allowedApplications) {
        this.allowedApplications = allowedApplications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (allowedPrincipals() != null) {
            allowedPrincipals().validate();
        }
    }
}