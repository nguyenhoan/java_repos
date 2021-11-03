/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BackfillErrorCode {

    ENCRYPTED_PARTITION_ERROR("ENCRYPTED_PARTITION_ERROR"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    INVALID_PARTITION_TYPE_DATA_ERROR("INVALID_PARTITION_TYPE_DATA_ERROR"),
    MISSING_PARTITION_VALUE_ERROR("MISSING_PARTITION_VALUE_ERROR"),
    UNSUPPORTED_PARTITION_CHARACTER_ERROR("UNSUPPORTED_PARTITION_CHARACTER_ERROR");

    private String value;

    private BackfillErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return BackfillErrorCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BackfillErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BackfillErrorCode enumEntry : BackfillErrorCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}