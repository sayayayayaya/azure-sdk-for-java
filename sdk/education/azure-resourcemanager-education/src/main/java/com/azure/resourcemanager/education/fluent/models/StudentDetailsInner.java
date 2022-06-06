// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.education.models.StudentLabStatus;
import com.azure.resourcemanager.education.models.StudentRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Student details. */
@Fluent
public final class StudentDetailsInner extends ProxyResource {
    /*
     * Get student response properties.
     */
    @JsonProperty(value = "properties")
    private StudentProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Get student response properties.
     *
     * @return the innerProperties value.
     */
    private StudentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the firstName property: First Name.
     *
     * @return the firstName value.
     */
    public String firstName() {
        return this.innerProperties() == null ? null : this.innerProperties().firstName();
    }

    /**
     * Set the firstName property: First Name.
     *
     * @param firstName the firstName value to set.
     * @return the StudentDetailsInner object itself.
     */
    public StudentDetailsInner withFirstName(String firstName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StudentProperties();
        }
        this.innerProperties().withFirstName(firstName);
        return this;
    }

    /**
     * Get the lastName property: Last Name.
     *
     * @return the lastName value.
     */
    public String lastName() {
        return this.innerProperties() == null ? null : this.innerProperties().lastName();
    }

    /**
     * Set the lastName property: Last Name.
     *
     * @param lastName the lastName value to set.
     * @return the StudentDetailsInner object itself.
     */
    public StudentDetailsInner withLastName(String lastName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StudentProperties();
        }
        this.innerProperties().withLastName(lastName);
        return this;
    }

    /**
     * Get the email property: Student Email.
     *
     * @return the email value.
     */
    public String email() {
        return this.innerProperties() == null ? null : this.innerProperties().email();
    }

    /**
     * Set the email property: Student Email.
     *
     * @param email the email value to set.
     * @return the StudentDetailsInner object itself.
     */
    public StudentDetailsInner withEmail(String email) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StudentProperties();
        }
        this.innerProperties().withEmail(email);
        return this;
    }

    /**
     * Get the role property: Student Role.
     *
     * @return the role value.
     */
    public StudentRole role() {
        return this.innerProperties() == null ? null : this.innerProperties().role();
    }

    /**
     * Set the role property: Student Role.
     *
     * @param role the role value to set.
     * @return the StudentDetailsInner object itself.
     */
    public StudentDetailsInner withRole(StudentRole role) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StudentProperties();
        }
        this.innerProperties().withRole(role);
        return this;
    }

    /**
     * Get the budget property: Student Budget.
     *
     * @return the budget value.
     */
    public Amount budget() {
        return this.innerProperties() == null ? null : this.innerProperties().budget();
    }

    /**
     * Set the budget property: Student Budget.
     *
     * @param budget the budget value to set.
     * @return the StudentDetailsInner object itself.
     */
    public StudentDetailsInner withBudget(Amount budget) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StudentProperties();
        }
        this.innerProperties().withBudget(budget);
        return this;
    }

    /**
     * Get the subscriptionId property: Subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionId();
    }

    /**
     * Get the expirationDate property: Date this student is set to expire from the lab.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationDate();
    }

    /**
     * Set the expirationDate property: Date this student is set to expire from the lab.
     *
     * @param expirationDate the expirationDate value to set.
     * @return the StudentDetailsInner object itself.
     */
    public StudentDetailsInner withExpirationDate(OffsetDateTime expirationDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StudentProperties();
        }
        this.innerProperties().withExpirationDate(expirationDate);
        return this;
    }

    /**
     * Get the status property: Student Lab Status.
     *
     * @return the status value.
     */
    public StudentLabStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the effectiveDate property: Date student was added to the lab.
     *
     * @return the effectiveDate value.
     */
    public OffsetDateTime effectiveDate() {
        return this.innerProperties() == null ? null : this.innerProperties().effectiveDate();
    }

    /**
     * Get the subscriptionAlias property: Subscription alias.
     *
     * @return the subscriptionAlias value.
     */
    public String subscriptionAlias() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionAlias();
    }

    /**
     * Set the subscriptionAlias property: Subscription alias.
     *
     * @param subscriptionAlias the subscriptionAlias value to set.
     * @return the StudentDetailsInner object itself.
     */
    public StudentDetailsInner withSubscriptionAlias(String subscriptionAlias) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StudentProperties();
        }
        this.innerProperties().withSubscriptionAlias(subscriptionAlias);
        return this;
    }

    /**
     * Get the subscriptionInviteLastSentDate property: subscription invite last sent date.
     *
     * @return the subscriptionInviteLastSentDate value.
     */
    public OffsetDateTime subscriptionInviteLastSentDate() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionInviteLastSentDate();
    }

    /**
     * Set the subscriptionInviteLastSentDate property: subscription invite last sent date.
     *
     * @param subscriptionInviteLastSentDate the subscriptionInviteLastSentDate value to set.
     * @return the StudentDetailsInner object itself.
     */
    public StudentDetailsInner withSubscriptionInviteLastSentDate(OffsetDateTime subscriptionInviteLastSentDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StudentProperties();
        }
        this.innerProperties().withSubscriptionInviteLastSentDate(subscriptionInviteLastSentDate);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}