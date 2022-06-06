// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for Compute ListNodes. */
public final class ComputeListNodesSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Compute/listNodes.json
     */
    /**
     * Sample code: Get compute nodes information for a compute.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void getComputeNodesInformationForACompute(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.computes().listNodes("testrg123", "workspaces123", "compute123", Context.NONE);
    }
}