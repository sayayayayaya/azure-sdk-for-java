// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PhpWorkloadProvisioningState. */
public final class PhpWorkloadProvisioningState extends ExpandableStringEnum<PhpWorkloadProvisioningState> {
    /** Static value NotSpecified for PhpWorkloadProvisioningState. */
    public static final PhpWorkloadProvisioningState NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Accepted for PhpWorkloadProvisioningState. */
    public static final PhpWorkloadProvisioningState ACCEPTED = fromString("Accepted");

    /** Static value Created for PhpWorkloadProvisioningState. */
    public static final PhpWorkloadProvisioningState CREATED = fromString("Created");

    /** Static value Succeeded for PhpWorkloadProvisioningState. */
    public static final PhpWorkloadProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for PhpWorkloadProvisioningState. */
    public static final PhpWorkloadProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for PhpWorkloadProvisioningState. */
    public static final PhpWorkloadProvisioningState CANCELED = fromString("Canceled");

    /** Static value Provisioning for PhpWorkloadProvisioningState. */
    public static final PhpWorkloadProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value Deleting for PhpWorkloadProvisioningState. */
    public static final PhpWorkloadProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a PhpWorkloadProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PhpWorkloadProvisioningState.
     */
    @JsonCreator
    public static PhpWorkloadProvisioningState fromString(String name) {
        return fromString(name, PhpWorkloadProvisioningState.class);
    }

    /**
     * Gets known PhpWorkloadProvisioningState values.
     *
     * @return known PhpWorkloadProvisioningState values.
     */
    public static Collection<PhpWorkloadProvisioningState> values() {
        return values(PhpWorkloadProvisioningState.class);
    }
}