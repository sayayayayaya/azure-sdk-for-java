// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Abstract class for AutoML tasks that use table dataset as input - such as Classification/Regression/Forecasting. */
@Fluent
public class TableVertical {
    /*
     * Data inputs for AutoMLJob.
     */
    @JsonProperty(value = "dataSettings")
    private TableVerticalDataSettings dataSettings;

    /*
     * Featurization inputs needed for AutoML job.
     */
    @JsonProperty(value = "featurizationSettings")
    private TableVerticalFeaturizationSettings featurizationSettings;

    /*
     * Execution constraints for AutoMLJob.
     */
    @JsonProperty(value = "limitSettings")
    private TableVerticalLimitSettings limitSettings;

    /*
     * Inputs for training phase for an AutoML Job.
     */
    @JsonProperty(value = "trainingSettings")
    private TrainingSettings trainingSettings;

    /**
     * Get the dataSettings property: Data inputs for AutoMLJob.
     *
     * @return the dataSettings value.
     */
    public TableVerticalDataSettings dataSettings() {
        return this.dataSettings;
    }

    /**
     * Set the dataSettings property: Data inputs for AutoMLJob.
     *
     * @param dataSettings the dataSettings value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withDataSettings(TableVerticalDataSettings dataSettings) {
        this.dataSettings = dataSettings;
        return this;
    }

    /**
     * Get the featurizationSettings property: Featurization inputs needed for AutoML job.
     *
     * @return the featurizationSettings value.
     */
    public TableVerticalFeaturizationSettings featurizationSettings() {
        return this.featurizationSettings;
    }

    /**
     * Set the featurizationSettings property: Featurization inputs needed for AutoML job.
     *
     * @param featurizationSettings the featurizationSettings value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withFeaturizationSettings(TableVerticalFeaturizationSettings featurizationSettings) {
        this.featurizationSettings = featurizationSettings;
        return this;
    }

    /**
     * Get the limitSettings property: Execution constraints for AutoMLJob.
     *
     * @return the limitSettings value.
     */
    public TableVerticalLimitSettings limitSettings() {
        return this.limitSettings;
    }

    /**
     * Set the limitSettings property: Execution constraints for AutoMLJob.
     *
     * @param limitSettings the limitSettings value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withLimitSettings(TableVerticalLimitSettings limitSettings) {
        this.limitSettings = limitSettings;
        return this;
    }

    /**
     * Get the trainingSettings property: Inputs for training phase for an AutoML Job.
     *
     * @return the trainingSettings value.
     */
    public TrainingSettings trainingSettings() {
        return this.trainingSettings;
    }

    /**
     * Set the trainingSettings property: Inputs for training phase for an AutoML Job.
     *
     * @param trainingSettings the trainingSettings value to set.
     * @return the TableVertical object itself.
     */
    public TableVertical withTrainingSettings(TrainingSettings trainingSettings) {
        this.trainingSettings = trainingSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataSettings() != null) {
            dataSettings().validate();
        }
        if (featurizationSettings() != null) {
            featurizationSettings().validate();
        }
        if (limitSettings() != null) {
            limitSettings().validate();
        }
        if (trainingSettings() != null) {
            trainingSettings().validate();
        }
    }
}