// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.communication.fluent.models.EmailServiceResourceInner;
import com.azure.resourcemanager.communication.models.EmailServiceResource;
import com.azure.resourcemanager.communication.models.EmailServiceResourceUpdate;
import com.azure.resourcemanager.communication.models.EmailServicesProvisioningState;
import java.util.Collections;
import java.util.Map;

public final class EmailServiceResourceImpl
    implements EmailServiceResource, EmailServiceResource.Definition, EmailServiceResource.Update {
    private EmailServiceResourceInner innerObject;

    private final com.azure.resourcemanager.communication.CommunicationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public EmailServicesProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String dataLocation() {
        return this.innerModel().dataLocation();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public EmailServiceResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.communication.CommunicationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String emailServiceName;

    private EmailServiceResourceUpdate updateParameters;

    public EmailServiceResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public EmailServiceResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEmailServices()
                .createOrUpdate(resourceGroupName, emailServiceName, this.innerModel(), Context.NONE);
        return this;
    }

    public EmailServiceResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEmailServices()
                .createOrUpdate(resourceGroupName, emailServiceName, this.innerModel(), context);
        return this;
    }

    EmailServiceResourceImpl(String name, com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerObject = new EmailServiceResourceInner();
        this.serviceManager = serviceManager;
        this.emailServiceName = name;
    }

    public EmailServiceResourceImpl update() {
        this.updateParameters = new EmailServiceResourceUpdate();
        return this;
    }

    public EmailServiceResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEmailServices()
                .update(resourceGroupName, emailServiceName, updateParameters, Context.NONE);
        return this;
    }

    public EmailServiceResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEmailServices()
                .update(resourceGroupName, emailServiceName, updateParameters, context);
        return this;
    }

    EmailServiceResourceImpl(
        EmailServiceResourceInner innerObject,
        com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.emailServiceName = Utils.getValueFromIdByName(innerObject.id(), "emailServices");
    }

    public EmailServiceResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEmailServices()
                .getByResourceGroupWithResponse(resourceGroupName, emailServiceName, Context.NONE)
                .getValue();
        return this;
    }

    public EmailServiceResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEmailServices()
                .getByResourceGroupWithResponse(resourceGroupName, emailServiceName, context)
                .getValue();
        return this;
    }

    public EmailServiceResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public EmailServiceResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public EmailServiceResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public EmailServiceResourceImpl withDataLocation(String dataLocation) {
        this.innerModel().withDataLocation(dataLocation);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}