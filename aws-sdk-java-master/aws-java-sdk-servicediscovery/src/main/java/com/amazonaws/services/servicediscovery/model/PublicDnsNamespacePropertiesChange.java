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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updated properties for the public DNS namespace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/PublicDnsNamespacePropertiesChange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicDnsNamespacePropertiesChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Updated DNS properties for the hosted zone for the public DNS namespace.
     * </p>
     */
    private PublicDnsPropertiesMutableChange dnsProperties;

    /**
     * <p>
     * Updated DNS properties for the hosted zone for the public DNS namespace.
     * </p>
     * 
     * @param dnsProperties
     *        Updated DNS properties for the hosted zone for the public DNS namespace.
     */

    public void setDnsProperties(PublicDnsPropertiesMutableChange dnsProperties) {
        this.dnsProperties = dnsProperties;
    }

    /**
     * <p>
     * Updated DNS properties for the hosted zone for the public DNS namespace.
     * </p>
     * 
     * @return Updated DNS properties for the hosted zone for the public DNS namespace.
     */

    public PublicDnsPropertiesMutableChange getDnsProperties() {
        return this.dnsProperties;
    }

    /**
     * <p>
     * Updated DNS properties for the hosted zone for the public DNS namespace.
     * </p>
     * 
     * @param dnsProperties
     *        Updated DNS properties for the hosted zone for the public DNS namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicDnsNamespacePropertiesChange withDnsProperties(PublicDnsPropertiesMutableChange dnsProperties) {
        setDnsProperties(dnsProperties);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDnsProperties() != null)
            sb.append("DnsProperties: ").append(getDnsProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicDnsNamespacePropertiesChange == false)
            return false;
        PublicDnsNamespacePropertiesChange other = (PublicDnsNamespacePropertiesChange) obj;
        if (other.getDnsProperties() == null ^ this.getDnsProperties() == null)
            return false;
        if (other.getDnsProperties() != null && other.getDnsProperties().equals(this.getDnsProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDnsProperties() == null) ? 0 : getDnsProperties().hashCode());
        return hashCode;
    }

    @Override
    public PublicDnsNamespacePropertiesChange clone() {
        try {
            return (PublicDnsNamespacePropertiesChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.PublicDnsNamespacePropertiesChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}