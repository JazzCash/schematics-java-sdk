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

import com.ibm.cloud.schematics.v1.model.CreateWorkspaceDeletionJobOptions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateWorkspaceDeletionJobOptions model.
 */
public class CreateWorkspaceDeletionJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateWorkspaceDeletionJobOptions() throws Throwable {
    CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptionsModel = new CreateWorkspaceDeletionJobOptions.Builder()
      .refreshToken("testString")
      .newDeleteWorkspaces(true)
      .newDestroyResources(true)
      .newJob("testString")
      .newVersion("testString")
      .newWorkspaces(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .destroyResources("testString")
      .build();
    assertEquals(createWorkspaceDeletionJobOptionsModel.refreshToken(), "testString");
    assertEquals(createWorkspaceDeletionJobOptionsModel.newDeleteWorkspaces(), Boolean.valueOf(true));
    assertEquals(createWorkspaceDeletionJobOptionsModel.newDestroyResources(), Boolean.valueOf(true));
    assertEquals(createWorkspaceDeletionJobOptionsModel.newJob(), "testString");
    assertEquals(createWorkspaceDeletionJobOptionsModel.newVersion(), "testString");
    assertEquals(createWorkspaceDeletionJobOptionsModel.newWorkspaces(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(createWorkspaceDeletionJobOptionsModel.destroyResources(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateWorkspaceDeletionJobOptionsError() throws Throwable {
    new CreateWorkspaceDeletionJobOptions.Builder().build();
  }

}