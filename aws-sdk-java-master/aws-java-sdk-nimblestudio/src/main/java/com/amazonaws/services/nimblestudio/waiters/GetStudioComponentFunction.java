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

package com.amazonaws.services.nimblestudio.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.SdkFunction;
import com.amazonaws.services.nimblestudio.model.GetStudioComponentRequest;
import com.amazonaws.services.nimblestudio.model.GetStudioComponentResult;
import com.amazonaws.services.nimblestudio.AmazonNimbleStudio;

@SdkInternalApi
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStudioComponentFunction implements SdkFunction<GetStudioComponentRequest, GetStudioComponentResult> {

    /**
     * Represents the service client
     */
    private final AmazonNimbleStudio client;

    /**
     * Constructs a new GetStudioComponentFunction with the given client
     * 
     * @param client
     *        Service client
     */
    public GetStudioComponentFunction(AmazonNimbleStudio client) {
        this.client = client;
    }

    /**
     * Makes a call to the operation specified by the waiter by taking the corresponding request and returns the
     * corresponding result
     * 
     * @param getStudioComponentRequest
     *        Corresponding request for the operation
     * @return Corresponding result of the operation
     */
    @Override
    public GetStudioComponentResult apply(GetStudioComponentRequest getStudioComponentRequest) {
        return client.getStudioComponent(getStudioComponentRequest);
    }
}