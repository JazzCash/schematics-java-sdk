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
 * The updateWorkspace options.
 */
public class UpdateWorkspaceOptions extends GenericModel {

  protected String wId;
  protected CatalogRef catalogRef;
  protected String description;
  protected String name;
  protected SharedTargetData sharedData;
  protected List<String> tags;
  protected List<TemplateSourceDataRequest> templateData;
  protected TemplateRepoUpdateRequest templateRepo;
  protected List<String> type;
  protected WorkspaceStatusUpdateRequest workspaceStatus;
  protected WorkspaceStatusMessage workspaceStatusMsg;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private CatalogRef catalogRef;
    private String description;
    private String name;
    private SharedTargetData sharedData;
    private List<String> tags;
    private List<TemplateSourceDataRequest> templateData;
    private TemplateRepoUpdateRequest templateRepo;
    private List<String> type;
    private WorkspaceStatusUpdateRequest workspaceStatus;
    private WorkspaceStatusMessage workspaceStatusMsg;

    private Builder(UpdateWorkspaceOptions updateWorkspaceOptions) {
      this.wId = updateWorkspaceOptions.wId;
      this.catalogRef = updateWorkspaceOptions.catalogRef;
      this.description = updateWorkspaceOptions.description;
      this.name = updateWorkspaceOptions.name;
      this.sharedData = updateWorkspaceOptions.sharedData;
      this.tags = updateWorkspaceOptions.tags;
      this.templateData = updateWorkspaceOptions.templateData;
      this.templateRepo = updateWorkspaceOptions.templateRepo;
      this.type = updateWorkspaceOptions.type;
      this.workspaceStatus = updateWorkspaceOptions.workspaceStatus;
      this.workspaceStatusMsg = updateWorkspaceOptions.workspaceStatusMsg;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     */
    public Builder(String wId) {
      this.wId = wId;
    }

    /**
     * Builds a UpdateWorkspaceOptions.
     *
     * @return the new UpdateWorkspaceOptions instance
     */
    public UpdateWorkspaceOptions build() {
      return new UpdateWorkspaceOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the UpdateWorkspaceOptions builder
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
     * Adds an templateData to templateData.
     *
     * @param templateData the new templateData
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder addTemplateData(TemplateSourceDataRequest templateData) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(templateData,
        "templateData cannot be null");
      if (this.templateData == null) {
        this.templateData = new ArrayList<TemplateSourceDataRequest>();
      }
      this.templateData.add(templateData);
      return this;
    }

    /**
     * Adds an type to type.
     *
     * @param type the new type
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder addType(String type) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(type,
        "type cannot be null");
      if (this.type == null) {
        this.type = new ArrayList<String>();
      }
      this.type.add(type);
      return this;
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the catalogRef.
     *
     * @param catalogRef the catalogRef
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder catalogRef(CatalogRef catalogRef) {
      this.catalogRef = catalogRef;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the sharedData.
     *
     * @param sharedData the sharedData
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder sharedData(SharedTargetData sharedData) {
      this.sharedData = sharedData;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the templateData.
     * Existing templateData will be replaced.
     *
     * @param templateData the templateData
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder templateData(List<TemplateSourceDataRequest> templateData) {
      this.templateData = templateData;
      return this;
    }

    /**
     * Set the templateRepo.
     *
     * @param templateRepo the templateRepo
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder templateRepo(TemplateRepoUpdateRequest templateRepo) {
      this.templateRepo = templateRepo;
      return this;
    }

    /**
     * Set the type.
     * Existing type will be replaced.
     *
     * @param type the type
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder type(List<String> type) {
      this.type = type;
      return this;
    }

    /**
     * Set the workspaceStatus.
     *
     * @param workspaceStatus the workspaceStatus
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder workspaceStatus(WorkspaceStatusUpdateRequest workspaceStatus) {
      this.workspaceStatus = workspaceStatus;
      return this;
    }

    /**
     * Set the workspaceStatusMsg.
     *
     * @param workspaceStatusMsg the workspaceStatusMsg
     * @return the UpdateWorkspaceOptions builder
     */
    public Builder workspaceStatusMsg(WorkspaceStatusMessage workspaceStatusMsg) {
      this.workspaceStatusMsg = workspaceStatusMsg;
      return this;
    }
  }

  protected UpdateWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    wId = builder.wId;
    catalogRef = builder.catalogRef;
    description = builder.description;
    name = builder.name;
    sharedData = builder.sharedData;
    tags = builder.tags;
    templateData = builder.templateData;
    templateRepo = builder.templateRepo;
    type = builder.type;
    workspaceStatus = builder.workspaceStatus;
    workspaceStatusMsg = builder.workspaceStatusMsg;
  }

  /**
   * New builder.
   *
   * @return a UpdateWorkspaceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The workspace ID for the workspace that you want to query.  You can run the GET /workspaces call if you need to
   * look up the  workspace IDs in your IBM Cloud account.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the catalogRef.
   *
   * CatalogRef -.
   *
   * @return the catalogRef
   */
  public CatalogRef catalogRef() {
    return catalogRef;
  }

  /**
   * Gets the description.
   *
   * Workspace description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the name.
   *
   * Workspace name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the sharedData.
   *
   * SharedTargetData -.
   *
   * @return the sharedData
   */
  public SharedTargetData sharedData() {
    return sharedData;
  }

  /**
   * Gets the tags.
   *
   * Tags -.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the templateData.
   *
   * TemplateData -.
   *
   * @return the templateData
   */
  public List<TemplateSourceDataRequest> templateData() {
    return templateData;
  }

  /**
   * Gets the templateRepo.
   *
   * TemplateRepoUpdateRequest -.
   *
   * @return the templateRepo
   */
  public TemplateRepoUpdateRequest templateRepo() {
    return templateRepo;
  }

  /**
   * Gets the type.
   *
   * List of Workspace type.
   *
   * @return the type
   */
  public List<String> type() {
    return type;
  }

  /**
   * Gets the workspaceStatus.
   *
   * WorkspaceStatusUpdateRequest -.
   *
   * @return the workspaceStatus
   */
  public WorkspaceStatusUpdateRequest workspaceStatus() {
    return workspaceStatus;
  }

  /**
   * Gets the workspaceStatusMsg.
   *
   * WorkspaceStatusMessage -.
   *
   * @return the workspaceStatusMsg
   */
  public WorkspaceStatusMessage workspaceStatusMsg() {
    return workspaceStatusMsg;
  }
}

