// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Command job definition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobType")
@JsonTypeName("Command")
@Fluent
public final class CommandJob extends JobBaseDetails {
    /*
     * ARM resource ID of the code asset.
     */
    @JsonProperty(value = "codeId")
    private String codeId;

    /*
     * [Required] The command to execute on startup of the job. eg. "python
     * train.py"
     */
    @JsonProperty(value = "command", required = true)
    private String command;

    /*
     * Distribution configuration of the job. If set, this should be one of
     * Mpi, Tensorflow, PyTorch, or null.
     */
    @JsonProperty(value = "distribution")
    private DistributionConfiguration distribution;

    /*
     * [Required] The ARM resource ID of the Environment specification for the
     * job.
     */
    @JsonProperty(value = "environmentId", required = true)
    private String environmentId;

    /*
     * Environment variables included in the job.
     */
    @JsonProperty(value = "environmentVariables")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> environmentVariables;

    /*
     * Mapping of input data bindings used in the job.
     */
    @JsonProperty(value = "inputs")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, JobInput> inputs;

    /*
     * Command Job limit.
     */
    @JsonProperty(value = "limits")
    private CommandJobLimits limits;

    /*
     * Mapping of output data bindings used in the job.
     */
    @JsonProperty(value = "outputs")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, JobOutput> outputs;

    /*
     * Input parameters.
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    private Object parameters;

    /*
     * Compute Resource configuration for the job.
     */
    @JsonProperty(value = "resources")
    private ResourceConfiguration resources;

    /**
     * Get the codeId property: ARM resource ID of the code asset.
     *
     * @return the codeId value.
     */
    public String codeId() {
        return this.codeId;
    }

    /**
     * Set the codeId property: ARM resource ID of the code asset.
     *
     * @param codeId the codeId value to set.
     * @return the CommandJob object itself.
     */
    public CommandJob withCodeId(String codeId) {
        this.codeId = codeId;
        return this;
    }

    /**
     * Get the command property: [Required] The command to execute on startup of the job. eg. "python train.py".
     *
     * @return the command value.
     */
    public String command() {
        return this.command;
    }

    /**
     * Set the command property: [Required] The command to execute on startup of the job. eg. "python train.py".
     *
     * @param command the command value to set.
     * @return the CommandJob object itself.
     */
    public CommandJob withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * Get the distribution property: Distribution configuration of the job. If set, this should be one of Mpi,
     * Tensorflow, PyTorch, or null.
     *
     * @return the distribution value.
     */
    public DistributionConfiguration distribution() {
        return this.distribution;
    }

    /**
     * Set the distribution property: Distribution configuration of the job. If set, this should be one of Mpi,
     * Tensorflow, PyTorch, or null.
     *
     * @param distribution the distribution value to set.
     * @return the CommandJob object itself.
     */
    public CommandJob withDistribution(DistributionConfiguration distribution) {
        this.distribution = distribution;
        return this;
    }

    /**
     * Get the environmentId property: [Required] The ARM resource ID of the Environment specification for the job.
     *
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the environmentId property: [Required] The ARM resource ID of the Environment specification for the job.
     *
     * @param environmentId the environmentId value to set.
     * @return the CommandJob object itself.
     */
    public CommandJob withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Get the environmentVariables property: Environment variables included in the job.
     *
     * @return the environmentVariables value.
     */
    public Map<String, String> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: Environment variables included in the job.
     *
     * @param environmentVariables the environmentVariables value to set.
     * @return the CommandJob object itself.
     */
    public CommandJob withEnvironmentVariables(Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the inputs property: Mapping of input data bindings used in the job.
     *
     * @return the inputs value.
     */
    public Map<String, JobInput> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: Mapping of input data bindings used in the job.
     *
     * @param inputs the inputs value to set.
     * @return the CommandJob object itself.
     */
    public CommandJob withInputs(Map<String, JobInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get the limits property: Command Job limit.
     *
     * @return the limits value.
     */
    public CommandJobLimits limits() {
        return this.limits;
    }

    /**
     * Set the limits property: Command Job limit.
     *
     * @param limits the limits value to set.
     * @return the CommandJob object itself.
     */
    public CommandJob withLimits(CommandJobLimits limits) {
        this.limits = limits;
        return this;
    }

    /**
     * Get the outputs property: Mapping of output data bindings used in the job.
     *
     * @return the outputs value.
     */
    public Map<String, JobOutput> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: Mapping of output data bindings used in the job.
     *
     * @param outputs the outputs value to set.
     * @return the CommandJob object itself.
     */
    public CommandJob withOutputs(Map<String, JobOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the parameters property: Input parameters.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Get the resources property: Compute Resource configuration for the job.
     *
     * @return the resources value.
     */
    public ResourceConfiguration resources() {
        return this.resources;
    }

    /**
     * Set the resources property: Compute Resource configuration for the job.
     *
     * @param resources the resources value to set.
     * @return the CommandJob object itself.
     */
    public CommandJob withResources(ResourceConfiguration resources) {
        this.resources = resources;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommandJob withComputeId(String computeId) {
        super.withComputeId(computeId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommandJob withDisplayName(String displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommandJob withExperimentName(String experimentName) {
        super.withExperimentName(experimentName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommandJob withIdentity(IdentityConfiguration identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommandJob withIsArchived(Boolean isArchived) {
        super.withIsArchived(isArchived);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommandJob withSchedule(ScheduleBase schedule) {
        super.withSchedule(schedule);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommandJob withServices(Map<String, JobService> services) {
        super.withServices(services);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommandJob withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommandJob withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommandJob withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (command() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property command in model CommandJob"));
        }
        if (distribution() != null) {
            distribution().validate();
        }
        if (environmentId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property environmentId in model CommandJob"));
        }
        if (inputs() != null) {
            inputs()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (limits() != null) {
            limits().validate();
        }
        if (outputs() != null) {
            outputs()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (resources() != null) {
            resources().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommandJob.class);
}