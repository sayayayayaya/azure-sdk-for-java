// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object representing a word. */
@Fluent
public final class TextWord {
    /*
     * The text content of the word.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * Bounding box of an extracted word.
     */
    @JsonProperty(value = "boundingBox", required = true)
    private List<Float> boundingBox;

    /*
     * Confidence value.
     */
    @JsonProperty(value = "confidence")
    private Float confidence;

    /** Creates an instance of TextWord class. */
    public TextWord() {}

    /**
     * Get the text property: The text content of the word.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text content of the word.
     *
     * @param text the text value to set.
     * @return the TextWord object itself.
     */
    public TextWord setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the boundingBox property: Bounding box of an extracted word.
     *
     * @return the boundingBox value.
     */
    public List<Float> getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Bounding box of an extracted word.
     *
     * @param boundingBox the boundingBox value to set.
     * @return the TextWord object itself.
     */
    public TextWord setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the confidence property: Confidence value.
     *
     * @return the confidence value.
     */
    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence value.
     *
     * @param confidence the confidence value to set.
     * @return the TextWord object itself.
     */
    public TextWord setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }
}
