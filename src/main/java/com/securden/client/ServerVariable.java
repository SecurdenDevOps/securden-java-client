
package com.securden.client;

import java.util.HashSet;

/**
 * Representing a Server Variable for server URL template substitution.
 */
@javax.annotation.Generated(value = "com.securden.codegen.languages.JavaClientCodegen", date = "2024-12-26T14:03:56.075699+05:30[Asia/Calcutta]", comments = "Generator version: 7.10.0")
public class ServerVariable {
    public String description;
    public String defaultValue;
    public HashSet<String> enumValues = null;

    /**
     * @param description A description for the server variable.
     * @param defaultValue The default value to use for substitution.
     * @param enumValues An enumeration of string values to be used if the substitution options are from a limited set.
     */
    public ServerVariable(String description, String defaultValue, HashSet<String> enumValues) {
        this.description = description;
        this.defaultValue = defaultValue;
        this.enumValues = enumValues;
    }
}
