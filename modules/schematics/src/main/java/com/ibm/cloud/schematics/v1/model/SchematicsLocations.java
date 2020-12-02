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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Schematics locations.
 */
public class SchematicsLocations extends GenericModel {

  protected String country;
  protected String geography;
  protected String id;
  protected String kind;
  protected String metro;
  @SerializedName("multizone_metro")
  protected String multizoneMetro;
  protected String name;

  /**
   * Gets the country.
   *
   * Country.
   *
   * @return the country
   */
  public String getCountry() {
    return country;
  }

  /**
   * Gets the geography.
   *
   * Geography.
   *
   * @return the geography
   */
  public String getGeography() {
    return geography;
  }

  /**
   * Gets the id.
   *
   * Location id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the kind.
   *
   * Kind.
   *
   * @return the kind
   */
  public String getKind() {
    return kind;
  }

  /**
   * Gets the metro.
   *
   * Metro.
   *
   * @return the metro
   */
  public String getMetro() {
    return metro;
  }

  /**
   * Gets the multizoneMetro.
   *
   * Multizone metro.
   *
   * @return the multizoneMetro
   */
  public String getMultizoneMetro() {
    return multizoneMetro;
  }

  /**
   * Gets the name.
   *
   * Location name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

