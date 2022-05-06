// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines List. */
public final class VirtualMachinesListSamples {
    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/preview/2020-06-05-preview/examples/ListVirtualMachinesBySubscription.json
     */
    /**
     * Sample code: ListVirtualMachinesBySubscription.
     *
     * @param manager Entry point to ScvmmManager.
     */
    public static void listVirtualMachinesBySubscription(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.virtualMachines().list(Context.NONE);
    }
}