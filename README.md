# Securden Software Development Kit - Java
 
This guide will take you through the process of installing and integrating Securden Java SDK for secure programmatic access to credentials.

## Summary of Steps

1. Installation
2. Importing the SDK into your codebase
3. Configuring access to Securden server

## 1. Installation

### For Maven Projects

```hcl
<dependency>
	<groupId>com.securden</groupId>
	<artifactId>securden-java-client</artifactId>
	<version>1.0.0</version>
</dependency>
```

### For Gradle Projects

```hcl
implementation group: 'com.securden', name: 'securden-java-client', version: '1.0.0'
```

## 2. Importing the SDK into your codebase

```hcl
package com.example;
import com.securden.client.ApiClient;
import com.securden.client.ApiException;
import com.securden.client.Configuration;
import com.securden.client.api.DefaultApi;
import com.securden.client.model.GetPassword200Response;
```

## 3. Configuring access to Securden server

### Required

- `server_url` (String) Securden Server URL. Example: https://company.securden.com:5454.
- `authtoken` (String) Securden API Authentication Token.


```hcl
ApiClient apiClient = Configuration.getDefaultApiClient()
    .setBasePath("<server-url>")
    .setSslCaCert("<cert-path>")
    .authtoken("<authtoken>");

DefaultApi api = new DefaultApi();
api.setApiClient(apiClient);
```

---
-> If you have general questions or issues in using Securden SDK, you may raise a support request to devops-support@securden.com. Our support team will get back to you at the earliest and provide a timeline if there are issue fixes involved.