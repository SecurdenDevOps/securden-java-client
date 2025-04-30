
package com.securden.client;

@javax.annotation.Generated(value = "com.securden.codegen.languages.JavaClientCodegen", date = "2024-12-26T14:03:56.075699+05:30[Asia/Calcutta]", comments = "Generator version: 7.10.0")
public class Configuration {
    public static final String VERSION = "1.0.0";

    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
