// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScaleType. */
public final class ScaleType extends ExpandableStringEnum<ScaleType> {
    /** Static value Default for ScaleType. */
    public static final ScaleType DEFAULT = fromString("Default");

    /** Static value TargetUtilization for ScaleType. */
    public static final ScaleType TARGET_UTILIZATION = fromString("TargetUtilization");

    /**
     * Creates or finds a ScaleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScaleType.
     */
    @JsonCreator
    public static ScaleType fromString(String name) {
        return fromString(name, ScaleType.class);
    }

    /**
     * Gets known ScaleType values.
     *
     * @return known ScaleType values.
     */
    public static Collection<ScaleType> values() {
        return values(ScaleType.class);
    }
}