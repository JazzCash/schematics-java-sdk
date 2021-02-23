/*
 * (C) Copyright IBM Corp. 2021.
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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceSharedDataset options.
 */
public class ReplaceSharedDatasetOptions extends GenericModel {

  protected String sdId;
  protected Boolean autoPropagateChange;
  protected String description;
  protected List<String> effectedWorkspaceIds;
  protected String resourceGroup;
  protected List<SharedDatasetData> sharedDatasetData;
  protected String sharedDatasetName;
  protected String sharedDatasetSourceName;
  protected List<String> sharedDatasetType;
  protected List<String> tags;
  protected String version;

  /**
   * Builder.
   */
  public static class Builder {
    private String sdId;
    private Boolean autoPropagateChange;
    private String description;
    private List<String> effectedWorkspaceIds;
    private String resourceGroup;
    private List<SharedDatasetData> sharedDatasetData;
    private String sharedDatasetName;
    private String sharedDatasetSourceName;
    private List<String> sharedDatasetType;
    private List<String> tags;
    private String version;

    private Builder(ReplaceSharedDatasetOptions replaceSharedDatasetOptions) {
      this.sdId = replaceSharedDatasetOptions.sdId;
      this.autoPropagateChange = replaceSharedDatasetOptions.autoPropagateChange;
      this.description = replaceSharedDatasetOptions.description;
      this.effectedWorkspaceIds = replaceSharedDatasetOptions.effectedWorkspaceIds;
      this.resourceGroup = replaceSharedDatasetOptions.resourceGroup;
      this.sharedDatasetData = replaceSharedDatasetOptions.sharedDatasetData;
      this.sharedDatasetName = replaceSharedDatasetOptions.sharedDatasetName;
      this.sharedDatasetSourceName = replaceSharedDatasetOptions.sharedDatasetSourceName;
      this.sharedDatasetType = replaceSharedDatasetOptions.sharedDatasetType;
      this.tags = replaceSharedDatasetOptions.tags;
      this.version = replaceSharedDatasetOptions.version;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sdId the sdId
     */
    public Builder(String sdId) {
      this.sdId = sdId;
    }

    /**
     * Builds a ReplaceSharedDatasetOptions.
     *
     * @return the new ReplaceSharedDatasetOptions instance
     */
    public ReplaceSharedDatasetOptions build() {
      return new ReplaceSharedDatasetOptions(this);
    }

    /**
     * Adds an effectedWorkspaceIds to effectedWorkspaceIds.
     *
     * @param effectedWorkspaceIds the new effectedWorkspaceIds
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder addEffectedWorkspaceIds(String effectedWorkspaceIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(effectedWorkspaceIds,
        "effectedWorkspaceIds cannot be null");
      if (this.effectedWorkspaceIds == null) {
        this.effectedWorkspaceIds = new ArrayList<String>();
      }
      this.effectedWorkspaceIds.add(effectedWorkspaceIds);
      return this;
    }

    /**
     * Adds an sharedDatasetData to sharedDatasetData.
     *
     * @param sharedDatasetData the new sharedDatasetData
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder addSharedDatasetData(SharedDatasetData sharedDatasetData) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sharedDatasetData,
        "sharedDatasetData cannot be null");
      if (this.sharedDatasetData == null) {
        this.sharedDatasetData = new ArrayList<SharedDatasetData>();
      }
      this.sharedDatasetData.add(sharedDatasetData);
      return this;
    }

    /**
     * Adds an sharedDatasetType to sharedDatasetType.
     *
     * @param sharedDatasetType the new sharedDatasetType
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder addSharedDatasetType(String sharedDatasetType) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sharedDatasetType,
        "sharedDatasetType cannot be null");
      if (this.sharedDatasetType == null) {
        this.sharedDatasetType = new ArrayList<String>();
      }
      this.sharedDatasetType.add(sharedDatasetType);
      return this;
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the sdId.
     *
     * @param sdId the sdId
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder sdId(String sdId) {
      this.sdId = sdId;
      return this;
    }

    /**
     * Set the autoPropagateChange.
     *
     * @param autoPropagateChange the autoPropagateChange
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder autoPropagateChange(Boolean autoPropagateChange) {
      this.autoPropagateChange = autoPropagateChange;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the effectedWorkspaceIds.
     * Existing effectedWorkspaceIds will be replaced.
     *
     * @param effectedWorkspaceIds the effectedWorkspaceIds
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder effectedWorkspaceIds(List<String> effectedWorkspaceIds) {
      this.effectedWorkspaceIds = effectedWorkspaceIds;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the sharedDatasetData.
     * Existing sharedDatasetData will be replaced.
     *
     * @param sharedDatasetData the sharedDatasetData
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder sharedDatasetData(List<SharedDatasetData> sharedDatasetData) {
      this.sharedDatasetData = sharedDatasetData;
      return this;
    }

    /**
     * Set the sharedDatasetName.
     *
     * @param sharedDatasetName the sharedDatasetName
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder sharedDatasetName(String sharedDatasetName) {
      this.sharedDatasetName = sharedDatasetName;
      return this;
    }

    /**
     * Set the sharedDatasetSourceName.
     *
     * @param sharedDatasetSourceName the sharedDatasetSourceName
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder sharedDatasetSourceName(String sharedDatasetSourceName) {
      this.sharedDatasetSourceName = sharedDatasetSourceName;
      return this;
    }

    /**
     * Set the sharedDatasetType.
     * Existing sharedDatasetType will be replaced.
     *
     * @param sharedDatasetType the sharedDatasetType
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder sharedDatasetType(List<String> sharedDatasetType) {
      this.sharedDatasetType = sharedDatasetType;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the ReplaceSharedDatasetOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }

  protected ReplaceSharedDatasetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.sdId,
      "sdId cannot be empty");
    sdId = builder.sdId;
    autoPropagateChange = builder.autoPropagateChange;
    description = builder.description;
    effectedWorkspaceIds = builder.effectedWorkspaceIds;
    resourceGroup = builder.resourceGroup;
    sharedDatasetData = builder.sharedDatasetData;
    sharedDatasetName = builder.sharedDatasetName;
    sharedDatasetSourceName = builder.sharedDatasetSourceName;
    sharedDatasetType = builder.sharedDatasetType;
    tags = builder.tags;
    version = builder.version;
  }

  /**
   * New builder.
   *
   * @return a ReplaceSharedDatasetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sdId.
   *
   * The shared dataset ID Use the GET /shared_datasets to look up the shared dataset IDs  in your IBM Cloud account.
   *
   * @return the sdId
   */
  public String sdId() {
    return sdId;
  }

  /**
   * Gets the autoPropagateChange.
   *
   * Automatically propagate changes to consumers.
   *
   * @return the autoPropagateChange
   */
  public Boolean autoPropagateChange() {
    return autoPropagateChange;
  }

  /**
   * Gets the description.
   *
   * Dataset description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the effectedWorkspaceIds.
   *
   * Affected workspaces.
   *
   * @return the effectedWorkspaceIds
   */
  public List<String> effectedWorkspaceIds() {
    return effectedWorkspaceIds;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource group name.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the sharedDatasetData.
   *
   * Shared dataset data.
   *
   * @return the sharedDatasetData
   */
  public List<SharedDatasetData> sharedDatasetData() {
    return sharedDatasetData;
  }

  /**
   * Gets the sharedDatasetName.
   *
   * Shared dataset name.
   *
   * @return the sharedDatasetName
   */
  public String sharedDatasetName() {
    return sharedDatasetName;
  }

  /**
   * Gets the sharedDatasetSourceName.
   *
   * Shared dataset source name.
   *
   * @return the sharedDatasetSourceName
   */
  public String sharedDatasetSourceName() {
    return sharedDatasetSourceName;
  }

  /**
   * Gets the sharedDatasetType.
   *
   * Shared dataset type.
   *
   * @return the sharedDatasetType
   */
  public List<String> sharedDatasetType() {
    return sharedDatasetType;
  }

  /**
   * Gets the tags.
   *
   * Shared dataset tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the version.
   *
   * Shared dataset version.
   *
   * @return the version
   */
  public String version() {
    return version;
  }
}

