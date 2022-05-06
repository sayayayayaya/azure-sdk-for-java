// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Certificate resource specific properties. */
@Fluent
public final class CertificateProperties {
    /*
     * Provisioning state of the certificate.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateProvisioningState provisioningState;

    /*
     * Certificate password.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * Subject name of the certificate.
     */
    @JsonProperty(value = "subjectName", access = JsonProperty.Access.WRITE_ONLY)
    private String subjectName;

    /*
     * PFX or PEM blob
     */
    @JsonProperty(value = "value")
    private byte[] value;

    /*
     * Certificate issuer.
     */
    @JsonProperty(value = "issuer", access = JsonProperty.Access.WRITE_ONLY)
    private String issuer;

    /*
     * Certificate issue Date.
     */
    @JsonProperty(value = "issueDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime issueDate;

    /*
     * Certificate expiration date.
     */
    @JsonProperty(value = "expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationDate;

    /*
     * Certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /*
     * Is the certificate valid?.
     */
    @JsonProperty(value = "valid", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean valid;

    /*
     * Public key hash.
     */
    @JsonProperty(value = "publicKeyHash", access = JsonProperty.Access.WRITE_ONLY)
    private String publicKeyHash;

    /**
     * Get the provisioningState property: Provisioning state of the certificate.
     *
     * @return the provisioningState value.
     */
    public CertificateProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the password property: Certificate password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Certificate password.
     *
     * @param password the password value to set.
     * @return the CertificateProperties object itself.
     */
    public CertificateProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the subjectName property: Subject name of the certificate.
     *
     * @return the subjectName value.
     */
    public String subjectName() {
        return this.subjectName;
    }

    /**
     * Get the value property: PFX or PEM blob.
     *
     * @return the value value.
     */
    public byte[] value() {
        return CoreUtils.clone(this.value);
    }

    /**
     * Set the value property: PFX or PEM blob.
     *
     * @param value the value value to set.
     * @return the CertificateProperties object itself.
     */
    public CertificateProperties withValue(byte[] value) {
        this.value = CoreUtils.clone(value);
        return this;
    }

    /**
     * Get the issuer property: Certificate issuer.
     *
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Get the issueDate property: Certificate issue Date.
     *
     * @return the issueDate value.
     */
    public OffsetDateTime issueDate() {
        return this.issueDate;
    }

    /**
     * Get the expirationDate property: Certificate expiration date.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the valid property: Is the certificate valid?.
     *
     * @return the valid value.
     */
    public Boolean valid() {
        return this.valid;
    }

    /**
     * Get the publicKeyHash property: Public key hash.
     *
     * @return the publicKeyHash value.
     */
    public String publicKeyHash() {
        return this.publicKeyHash;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}