// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.SendAadLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendActivityLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendMetricsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.TagRule;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class TagRulesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"logRules\":{\"sendAadLogs\":\"Disabled\",\"sendSubscriptionLogs\":\"Enabled\",\"sendActivityLogs\":\"Disabled\",\"filteringTags\":[]},\"metricRules\":{\"sendMetrics\":\"Enabled\",\"filteringTags\":[],\"userEmail\":\"ynl\"}},\"id\":\"huopxodlqiynto\",\"name\":\"zihleosjswsr\",\"type\":\"slyzrpzbchckqq\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        NewRelicObservabilityManager manager =
            NewRelicObservabilityManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        TagRule response =
            manager
                .tagRules()
                .define("jxywsuws")
                .withExistingMonitor("pkkpw", "reqnovvqfov")
                .withLogRules(
                    new LogRules()
                        .withSendAadLogs(SendAadLogsStatus.DISABLED)
                        .withSendSubscriptionLogs(SendSubscriptionLogsStatus.DISABLED)
                        .withSendActivityLogs(SendActivityLogsStatus.DISABLED)
                        .withFilteringTags(Arrays.asList()))
                .withMetricRules(
                    new MetricRulesInner()
                        .withSendMetrics(SendMetricsStatus.ENABLED)
                        .withFilteringTags(Arrays.asList())
                        .withUserEmail("aeneqnzarrwl"))
                .create();

        Assertions.assertEquals(SendAadLogsStatus.DISABLED, response.logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED, response.logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, response.logRules().sendActivityLogs());
        Assertions.assertEquals(SendMetricsStatus.ENABLED, response.metricRules().sendMetrics());
        Assertions.assertEquals("ynl", response.metricRules().userEmail());
    }
}
