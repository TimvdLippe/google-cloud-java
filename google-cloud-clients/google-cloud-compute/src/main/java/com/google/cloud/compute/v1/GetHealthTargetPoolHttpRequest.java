/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class GetHealthTargetPoolHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final InstanceReference instanceReferenceResource;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final String targetPool;
  private final String userIp;

  private GetHealthTargetPoolHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.instanceReferenceResource = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.targetPool = null;
    this.userIp = null;
  }

  private GetHealthTargetPoolHttpRequest(
      String access_token,
      String callback,
      String fields,
      InstanceReference instanceReferenceResource,
      String key,
      String prettyPrint,
      String quotaUser,
      String targetPool,
      String userIp) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.instanceReferenceResource = instanceReferenceResource;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.targetPool = targetPool;
    this.userIp = userIp;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("access_token".equals(fieldName)) {
      return access_token;
    }
    if ("callback".equals(fieldName)) {
      return callback;
    }
    if ("fields".equals(fieldName)) {
      return fields;
    }
    if ("instanceReferenceResource".equals(fieldName)) {
      return instanceReferenceResource;
    }
    if ("key".equals(fieldName)) {
      return key;
    }
    if ("prettyPrint".equals(fieldName)) {
      return prettyPrint;
    }
    if ("quotaUser".equals(fieldName)) {
      return quotaUser;
    }
    if ("targetPool".equals(fieldName)) {
      return targetPool;
    }
    if ("userIp".equals(fieldName)) {
      return userIp;
    }
    return null;
  }

  @Nullable
  @Override
  public InstanceReference getApiMessageRequestBody() {
    return instanceReferenceResource;
  }

  @Nullable
  @Override
  public List<String> getFieldMask() {
    return null;
  }

  public String getAccessToken() {
    return access_token;
  }

  public String getCallback() {
    return callback;
  }

  public String getFields() {
    return fields;
  }

  public InstanceReference getInstanceReferenceResource() {
    return instanceReferenceResource;
  }

  public String getKey() {
    return key;
  }

  public String getPrettyPrint() {
    return prettyPrint;
  }

  public String getQuotaUser() {
    return quotaUser;
  }

  public String getTargetPool() {
    return targetPool;
  }

  public String getUserIp() {
    return userIp;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(GetHealthTargetPoolHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static GetHealthTargetPoolHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final GetHealthTargetPoolHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new GetHealthTargetPoolHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private InstanceReference instanceReferenceResource;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private String targetPool;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(GetHealthTargetPoolHttpRequest other) {
      if (other == GetHealthTargetPoolHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getInstanceReferenceResource() != null) {
        this.instanceReferenceResource = other.instanceReferenceResource;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getTargetPool() != null) {
        this.targetPool = other.targetPool;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(GetHealthTargetPoolHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.instanceReferenceResource = source.instanceReferenceResource;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.targetPool = source.targetPool;
      this.userIp = source.userIp;
    }

    public String getAccessToken() {
      return access_token;
    }

    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    public String getCallback() {
      return callback;
    }

    public Builder setCallback(String callback) {
      this.callback = callback;
      return this;
    }

    public String getFields() {
      return fields;
    }

    public Builder setFields(String fields) {
      this.fields = fields;
      return this;
    }

    public InstanceReference getInstanceReferenceResource() {
      return instanceReferenceResource;
    }

    public Builder setInstanceReferenceResource(InstanceReference instanceReferenceResource) {
      this.instanceReferenceResource = instanceReferenceResource;
      return this;
    }

    public String getKey() {
      return key;
    }

    public Builder setKey(String key) {
      this.key = key;
      return this;
    }

    public String getPrettyPrint() {
      return prettyPrint;
    }

    public Builder setPrettyPrint(String prettyPrint) {
      this.prettyPrint = prettyPrint;
      return this;
    }

    public String getQuotaUser() {
      return quotaUser;
    }

    public Builder setQuotaUser(String quotaUser) {
      this.quotaUser = quotaUser;
      return this;
    }

    public String getTargetPool() {
      return targetPool;
    }

    public Builder setTargetPool(String targetPool) {
      this.targetPool = targetPool;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    public GetHealthTargetPoolHttpRequest build() {
      String missing = "";

      if (targetPool == null) {
        missing += " targetPool";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new GetHealthTargetPoolHttpRequest(
          access_token,
          callback,
          fields,
          instanceReferenceResource,
          key,
          prettyPrint,
          quotaUser,
          targetPool,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setInstanceReferenceResource(this.instanceReferenceResource);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setTargetPool(this.targetPool);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "GetHealthTargetPoolHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "callback="
        + callback
        + ", "
        + "fields="
        + fields
        + ", "
        + "instanceReferenceResource="
        + instanceReferenceResource
        + ", "
        + "key="
        + key
        + ", "
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "quotaUser="
        + quotaUser
        + ", "
        + "targetPool="
        + targetPool
        + ", "
        + "userIp="
        + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetHealthTargetPoolHttpRequest) {
      GetHealthTargetPoolHttpRequest that = (GetHealthTargetPoolHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.instanceReferenceResource, that.getInstanceReferenceResource())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(this.targetPool, that.getTargetPool())
          && Objects.equals(this.userIp, that.getUserIp());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        access_token,
        callback,
        fields,
        instanceReferenceResource,
        key,
        prettyPrint,
        quotaUser,
        targetPool,
        userIp);
  }
}