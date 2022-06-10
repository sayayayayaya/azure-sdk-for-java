// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.workloads.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.workloads.fluent.models.SapAvailabilityZoneDetailsResultInner;
import com.azure.resourcemanager.workloads.fluent.models.SapDiskConfigurationsResultInner;
import com.azure.resourcemanager.workloads.fluent.models.SapSizingRecommendationResultInner;
import com.azure.resourcemanager.workloads.fluent.models.SapSupportedResourceSkusResultInner;
import com.azure.resourcemanager.workloads.models.SapAvailabilityZoneDetailsRequest;
import com.azure.resourcemanager.workloads.models.SapDiskConfigurationsRequest;
import com.azure.resourcemanager.workloads.models.SapSizingRecommendationRequest;
import com.azure.resourcemanager.workloads.models.SapSupportedSkusRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    /** The proxy service used to perform REST calls. */
    private final ResourceProvidersService service;

    /** The service client containing this operation class. */
    private final WorkloadsClientImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(WorkloadsClientImpl client) {
        this.service =
            RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for WorkloadsClientResourceProviders to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WorkloadsClientResou")
    private interface ResourceProvidersService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Workloads/locations/{location}"
                + "/sapVirtualInstanceMetadata/default/getSizingRecommendations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SapSizingRecommendationResultInner>> sapSizingRecommendations(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SapSizingRecommendationRequest sapSizingRecommendation,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Workloads/locations/{location}"
                + "/sapVirtualInstanceMetadata/default/getSapSupportedSku")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SapSupportedResourceSkusResultInner>> sapSupportedSku(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SapSupportedSkusRequest sapSupportedSku,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Workloads/locations/{location}"
                + "/sapVirtualInstanceMetadata/default/getDiskConfigurations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SapDiskConfigurationsResultInner>> sapDiskConfigurations(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SapDiskConfigurationsRequest sapDiskConfigurations,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Workloads/locations/{location}"
                + "/sapVirtualInstanceMetadata/default/getAvailabilityZoneDetails")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SapAvailabilityZoneDetailsResultInner>> sapAvailabilityZoneDetails(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SapAvailabilityZoneDetailsRequest sapAvailabilityZoneDetails,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get SAP sizing recommendations.
     *
     * @param location The name of Azure region.
     * @param sapSizingRecommendation SAP Sizing Recommendation Request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP sizing recommendations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SapSizingRecommendationResultInner>> sapSizingRecommendationsWithResponseAsync(
        String location, SapSizingRecommendationRequest sapSizingRecommendation) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (sapSizingRecommendation != null) {
            sapSizingRecommendation.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .sapSizingRecommendations(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            sapSizingRecommendation,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get SAP sizing recommendations.
     *
     * @param location The name of Azure region.
     * @param sapSizingRecommendation SAP Sizing Recommendation Request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP sizing recommendations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SapSizingRecommendationResultInner>> sapSizingRecommendationsWithResponseAsync(
        String location, SapSizingRecommendationRequest sapSizingRecommendation, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (sapSizingRecommendation != null) {
            sapSizingRecommendation.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .sapSizingRecommendations(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                sapSizingRecommendation,
                accept,
                context);
    }

    /**
     * Get SAP sizing recommendations.
     *
     * @param location The name of Azure region.
     * @param sapSizingRecommendation SAP Sizing Recommendation Request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP sizing recommendations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SapSizingRecommendationResultInner> sapSizingRecommendationsAsync(
        String location, SapSizingRecommendationRequest sapSizingRecommendation) {
        return sapSizingRecommendationsWithResponseAsync(location, sapSizingRecommendation)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get SAP sizing recommendations.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP sizing recommendations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SapSizingRecommendationResultInner> sapSizingRecommendationsAsync(String location) {
        final SapSizingRecommendationRequest sapSizingRecommendation = null;
        return sapSizingRecommendationsWithResponseAsync(location, sapSizingRecommendation)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get SAP sizing recommendations.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP sizing recommendations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SapSizingRecommendationResultInner sapSizingRecommendations(String location) {
        final SapSizingRecommendationRequest sapSizingRecommendation = null;
        return sapSizingRecommendationsAsync(location, sapSizingRecommendation).block();
    }

    /**
     * Get SAP sizing recommendations.
     *
     * @param location The name of Azure region.
     * @param sapSizingRecommendation SAP Sizing Recommendation Request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP sizing recommendations along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SapSizingRecommendationResultInner> sapSizingRecommendationsWithResponse(
        String location, SapSizingRecommendationRequest sapSizingRecommendation, Context context) {
        return sapSizingRecommendationsWithResponseAsync(location, sapSizingRecommendation, context).block();
    }

    /**
     * Get SAP supported SKUs.
     *
     * @param location The name of Azure region.
     * @param sapSupportedSku SAP Supported SKU Request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP supported SKUs along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SapSupportedResourceSkusResultInner>> sapSupportedSkuWithResponseAsync(
        String location, SapSupportedSkusRequest sapSupportedSku) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (sapSupportedSku != null) {
            sapSupportedSku.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .sapSupportedSku(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            sapSupportedSku,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get SAP supported SKUs.
     *
     * @param location The name of Azure region.
     * @param sapSupportedSku SAP Supported SKU Request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP supported SKUs along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SapSupportedResourceSkusResultInner>> sapSupportedSkuWithResponseAsync(
        String location, SapSupportedSkusRequest sapSupportedSku, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (sapSupportedSku != null) {
            sapSupportedSku.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .sapSupportedSku(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                sapSupportedSku,
                accept,
                context);
    }

    /**
     * Get SAP supported SKUs.
     *
     * @param location The name of Azure region.
     * @param sapSupportedSku SAP Supported SKU Request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP supported SKUs on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SapSupportedResourceSkusResultInner> sapSupportedSkuAsync(
        String location, SapSupportedSkusRequest sapSupportedSku) {
        return sapSupportedSkuWithResponseAsync(location, sapSupportedSku)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get SAP supported SKUs.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP supported SKUs on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SapSupportedResourceSkusResultInner> sapSupportedSkuAsync(String location) {
        final SapSupportedSkusRequest sapSupportedSku = null;
        return sapSupportedSkuWithResponseAsync(location, sapSupportedSku)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get SAP supported SKUs.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP supported SKUs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SapSupportedResourceSkusResultInner sapSupportedSku(String location) {
        final SapSupportedSkusRequest sapSupportedSku = null;
        return sapSupportedSkuAsync(location, sapSupportedSku).block();
    }

    /**
     * Get SAP supported SKUs.
     *
     * @param location The name of Azure region.
     * @param sapSupportedSku SAP Supported SKU Request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP supported SKUs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SapSupportedResourceSkusResultInner> sapSupportedSkuWithResponse(
        String location, SapSupportedSkusRequest sapSupportedSku, Context context) {
        return sapSupportedSkuWithResponseAsync(location, sapSupportedSku, context).block();
    }

    /**
     * Get SAP Disk Configurations.
     *
     * @param location The name of Azure region.
     * @param sapDiskConfigurations SAP Disk Configurations Request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Disk Configurations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SapDiskConfigurationsResultInner>> sapDiskConfigurationsWithResponseAsync(
        String location, SapDiskConfigurationsRequest sapDiskConfigurations) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (sapDiskConfigurations != null) {
            sapDiskConfigurations.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .sapDiskConfigurations(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            sapDiskConfigurations,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get SAP Disk Configurations.
     *
     * @param location The name of Azure region.
     * @param sapDiskConfigurations SAP Disk Configurations Request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Disk Configurations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SapDiskConfigurationsResultInner>> sapDiskConfigurationsWithResponseAsync(
        String location, SapDiskConfigurationsRequest sapDiskConfigurations, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (sapDiskConfigurations != null) {
            sapDiskConfigurations.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .sapDiskConfigurations(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                sapDiskConfigurations,
                accept,
                context);
    }

    /**
     * Get SAP Disk Configurations.
     *
     * @param location The name of Azure region.
     * @param sapDiskConfigurations SAP Disk Configurations Request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Disk Configurations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SapDiskConfigurationsResultInner> sapDiskConfigurationsAsync(
        String location, SapDiskConfigurationsRequest sapDiskConfigurations) {
        return sapDiskConfigurationsWithResponseAsync(location, sapDiskConfigurations)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get SAP Disk Configurations.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Disk Configurations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SapDiskConfigurationsResultInner> sapDiskConfigurationsAsync(String location) {
        final SapDiskConfigurationsRequest sapDiskConfigurations = null;
        return sapDiskConfigurationsWithResponseAsync(location, sapDiskConfigurations)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get SAP Disk Configurations.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Disk Configurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SapDiskConfigurationsResultInner sapDiskConfigurations(String location) {
        final SapDiskConfigurationsRequest sapDiskConfigurations = null;
        return sapDiskConfigurationsAsync(location, sapDiskConfigurations).block();
    }

    /**
     * Get SAP Disk Configurations.
     *
     * @param location The name of Azure region.
     * @param sapDiskConfigurations SAP Disk Configurations Request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Disk Configurations along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SapDiskConfigurationsResultInner> sapDiskConfigurationsWithResponse(
        String location, SapDiskConfigurationsRequest sapDiskConfigurations, Context context) {
        return sapDiskConfigurationsWithResponseAsync(location, sapDiskConfigurations, context).block();
    }

    /**
     * Get SAP Availability Zone Details.
     *
     * @param location The name of Azure region.
     * @param sapAvailabilityZoneDetails SAP Availability Zone Details Request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Availability Zone Details along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SapAvailabilityZoneDetailsResultInner>> sapAvailabilityZoneDetailsWithResponseAsync(
        String location, SapAvailabilityZoneDetailsRequest sapAvailabilityZoneDetails) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (sapAvailabilityZoneDetails != null) {
            sapAvailabilityZoneDetails.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .sapAvailabilityZoneDetails(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            sapAvailabilityZoneDetails,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get SAP Availability Zone Details.
     *
     * @param location The name of Azure region.
     * @param sapAvailabilityZoneDetails SAP Availability Zone Details Request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Availability Zone Details along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SapAvailabilityZoneDetailsResultInner>> sapAvailabilityZoneDetailsWithResponseAsync(
        String location, SapAvailabilityZoneDetailsRequest sapAvailabilityZoneDetails, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (sapAvailabilityZoneDetails != null) {
            sapAvailabilityZoneDetails.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .sapAvailabilityZoneDetails(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                sapAvailabilityZoneDetails,
                accept,
                context);
    }

    /**
     * Get SAP Availability Zone Details.
     *
     * @param location The name of Azure region.
     * @param sapAvailabilityZoneDetails SAP Availability Zone Details Request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Availability Zone Details on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SapAvailabilityZoneDetailsResultInner> sapAvailabilityZoneDetailsAsync(
        String location, SapAvailabilityZoneDetailsRequest sapAvailabilityZoneDetails) {
        return sapAvailabilityZoneDetailsWithResponseAsync(location, sapAvailabilityZoneDetails)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get SAP Availability Zone Details.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Availability Zone Details on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SapAvailabilityZoneDetailsResultInner> sapAvailabilityZoneDetailsAsync(String location) {
        final SapAvailabilityZoneDetailsRequest sapAvailabilityZoneDetails = null;
        return sapAvailabilityZoneDetailsWithResponseAsync(location, sapAvailabilityZoneDetails)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get SAP Availability Zone Details.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Availability Zone Details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SapAvailabilityZoneDetailsResultInner sapAvailabilityZoneDetails(String location) {
        final SapAvailabilityZoneDetailsRequest sapAvailabilityZoneDetails = null;
        return sapAvailabilityZoneDetailsAsync(location, sapAvailabilityZoneDetails).block();
    }

    /**
     * Get SAP Availability Zone Details.
     *
     * @param location The name of Azure region.
     * @param sapAvailabilityZoneDetails SAP Availability Zone Details Request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sAP Availability Zone Details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SapAvailabilityZoneDetailsResultInner> sapAvailabilityZoneDetailsWithResponse(
        String location, SapAvailabilityZoneDetailsRequest sapAvailabilityZoneDetails, Context context) {
        return sapAvailabilityZoneDetailsWithResponseAsync(location, sapAvailabilityZoneDetails, context).block();
    }
}