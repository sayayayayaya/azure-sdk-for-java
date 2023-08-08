package com.azure.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.CLASS;
import java.lang.annotation.Target;

/**
 * Annotation to annotate an Android api 26+ compatible method to be ignored by animal-sniffer.
**/

@Retention(CLASS)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.FIELD})
public @interface Android
{
}