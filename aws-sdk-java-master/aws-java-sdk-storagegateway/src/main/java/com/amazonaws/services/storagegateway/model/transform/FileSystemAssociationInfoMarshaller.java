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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FileSystemAssociationInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FileSystemAssociationInfoMarshaller {

    private static final MarshallingInfo<String> FILESYSTEMASSOCIATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemAssociationARN").build();
    private static final MarshallingInfo<String> LOCATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocationARN").build();
    private static final MarshallingInfo<String> FILESYSTEMASSOCIATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemAssociationStatus").build();
    private static final MarshallingInfo<String> AUDITDESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuditDestinationARN").build();
    private static final MarshallingInfo<String> GATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayARN").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> CACHEATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CacheAttributes").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTNETWORKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointNetworkConfiguration").build();
    private static final MarshallingInfo<List> FILESYSTEMASSOCIATIONSTATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemAssociationStatusDetails").build();

    private static final FileSystemAssociationInfoMarshaller instance = new FileSystemAssociationInfoMarshaller();

    public static FileSystemAssociationInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FileSystemAssociationInfo fileSystemAssociationInfo, ProtocolMarshaller protocolMarshaller) {

        if (fileSystemAssociationInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fileSystemAssociationInfo.getFileSystemAssociationARN(), FILESYSTEMASSOCIATIONARN_BINDING);
            protocolMarshaller.marshall(fileSystemAssociationInfo.getLocationARN(), LOCATIONARN_BINDING);
            protocolMarshaller.marshall(fileSystemAssociationInfo.getFileSystemAssociationStatus(), FILESYSTEMASSOCIATIONSTATUS_BINDING);
            protocolMarshaller.marshall(fileSystemAssociationInfo.getAuditDestinationARN(), AUDITDESTINATIONARN_BINDING);
            protocolMarshaller.marshall(fileSystemAssociationInfo.getGatewayARN(), GATEWAYARN_BINDING);
            protocolMarshaller.marshall(fileSystemAssociationInfo.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(fileSystemAssociationInfo.getCacheAttributes(), CACHEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(fileSystemAssociationInfo.getEndpointNetworkConfiguration(), ENDPOINTNETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(fileSystemAssociationInfo.getFileSystemAssociationStatusDetails(), FILESYSTEMASSOCIATIONSTATUSDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}