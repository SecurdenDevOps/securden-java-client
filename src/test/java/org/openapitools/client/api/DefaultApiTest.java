
package com.securden.client.api;

import com.securden.client.ApiException;
import com.securden.client.model.GetPassword200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Retrieves password information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPasswordGetTest() throws ApiException {
        Long accountId = null;
        String accountName = null;
        String accountTitle = null;
        String accountType = null;
        int accountCategory = 1;
        String ticketId = null;
        String reason = "";
        GetPassword200Response response = api.getPassword(accountId, accountName, accountTitle, accountType, accountCategory, ticketId, reason);
        // TODO: test validations
    }

}
