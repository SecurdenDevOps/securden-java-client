
package org.securden.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.securden.client.JSON;

/**
 * GetPassword200Response
 */
@javax.annotation.Generated(value = "org.securden.codegen.languages.JavaClientCodegen", date = "2024-12-26T14:03:56.075699+05:30[Asia/Calcutta]", comments = "Generator version: 7.10.0")
public class GetPassword200Response {
  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  @javax.annotation.Nullable
  private String password;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public GetPassword200Response() {
  }

  public GetPassword200Response password(@javax.annotation.Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }

  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }

  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPassword200Response getPasswordGet200Response = (GetPassword200Response) o;
    return Objects.equals(this.password, getPasswordGet200Response.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPassword200Response {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> apiFields;
  public static HashSet<String> apiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    apiFields = new HashSet<String>();
    apiFields.add("password");
    apiFields.add("label");
    apiFields.add("message");

    // a set of required properties/fields (JSON key names)
    apiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPassword200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
        if (!GetPassword200Response.apiRequiredFields.isEmpty()) { 
            throw new IllegalArgumentException(
                String.format("The required field(s) %s in GetPassword200Response is not found in the empty JSON string", 
                              GetPassword200Response.apiRequiredFields.toString())
            );
        }
    }

    JsonObject jsonObj = jsonElement.getAsJsonObject();
    for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
        if (!GetPassword200Response.apiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(
                String.format("The field `%s` in the JSON string is not defined in the `GetPassword200Response` properties. JSON: %s", 
                              entry.getKey(), jsonElement.toString())
            );
        }
    }

    if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) 
         && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", 
                          jsonObj.get("password").toString())
        );
    }

    if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) 
         && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", 
                          jsonObj.get("label").toString())
        );
    }

    if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) 
         && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", 
                          jsonObj.get("message").toString())
        );
    }
  }

  // public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  //     if (jsonElement == null) {
  //       if (!GetPassword200Response.apiRequiredFields.isEmpty()) { // has required fields but JSON element is null
  //         throw new IllegalArgumentException(String.format("The required field(s) %s in GetPassword200Response is not found in the empty JSON string", GetPassword200Response.apiRequiredFields.toString()));
  //       }
  //     }

  //     Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
  //     // check to see if the JSON string contains additional fields
  //     for (Map.Entry<String, JsonElement> entry : entries) {
  //       if (!GetPassword200Response.apiFields.contains(entry.getKey())) {
  //         throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPassword200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
  //       }
  //     }
  //       JsonObject jsonObj = jsonElement.getAsJsonObject();
  //     if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
  //       throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
  //     }
  // }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPassword200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPassword200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPassword200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPassword200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPassword200Response>() {
           @Override
           public void write(JsonWriter out, GetPassword200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPassword200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPassword200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPassword200Response
   * @throws IOException if the JSON string is invalid with respect to GetPassword200Response
   */
  public static GetPassword200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPassword200Response.class);
  }

  /**
   * Convert an instance of GetPassword200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

