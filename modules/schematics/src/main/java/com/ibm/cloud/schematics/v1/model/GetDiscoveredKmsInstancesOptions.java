/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.schematics.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getDiscoveredKmsInstances options.
 */
public class GetDiscoveredKmsInstancesOptions extends GenericModel {

  protected String encryptionScheme;
  protected String location;
  protected String resourceGroup;
  protected Long limit;
  protected String sort;

  /**
   * Builder.
   */
  public static class Builder {
    private String encryptionScheme;
    private String location;
    private String resourceGroup;
    private Long limit;
    private String sort;

    private Builder(GetDiscoveredKmsInstancesOptions getDiscoveredKmsInstancesOptions) {
      this.encryptionScheme = getDiscoveredKmsInstancesOptions.encryptionScheme;
      this.location = getDiscoveredKmsInstancesOptions.location;
      this.resourceGroup = getDiscoveredKmsInstancesOptions.resourceGroup;
      this.limit = getDiscoveredKmsInstancesOptions.limit;
      this.sort = getDiscoveredKmsInstancesOptions.sort;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param encryptionScheme the encryptionScheme
     * @param location the location
     */
    public Builder(String encryptionScheme, String location) {
      this.encryptionScheme = encryptionScheme;
      this.location = location;
    }

    /**
     * Builds a GetDiscoveredKmsInstancesOptions.
     *
     * @return the new GetDiscoveredKmsInstancesOptions instance
     */
    public GetDiscoveredKmsInstancesOptions build() {
      return new GetDiscoveredKmsInstancesOptions(this);
    }

    /**
     * Set the encryptionScheme.
     *
     * @param encryptionScheme the encryptionScheme
     * @return the GetDiscoveredKmsInstancesOptions builder
     */
    public Builder encryptionScheme(String encryptionScheme) {
      this.encryptionScheme = encryptionScheme;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the GetDiscoveredKmsInstancesOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the GetDiscoveredKmsInstancesOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetDiscoveredKmsInstancesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the GetDiscoveredKmsInstancesOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  protected GetDiscoveredKmsInstancesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.encryptionScheme,
      "encryptionScheme cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.location,
      "location cannot be null");
    encryptionScheme = builder.encryptionScheme;
    location = builder.location;
    resourceGroup = builder.resourceGroup;
    limit = builder.limit;
    sort = builder.sort;
  }

  /**
   * New builder.
   *
   * @return a GetDiscoveredKmsInstancesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the encryptionScheme.
   *
   * The encryption scheme to be used.
   *
   * @return the encryptionScheme
   */
  public String encryptionScheme() {
    return encryptionScheme;
  }

  /**
   * Gets the location.
   *
   * The location of the Resource.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group (by default, fetch from all resource groups).
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the limit.
   *
   * The numbers of items to return.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the sort.
   *
   * Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
   * owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is ascending)
   *  Ignore unrecognized or unsupported sort field.
   *
   * @return the sort
   */
  public String sort() {
    return sort;
  }
}

