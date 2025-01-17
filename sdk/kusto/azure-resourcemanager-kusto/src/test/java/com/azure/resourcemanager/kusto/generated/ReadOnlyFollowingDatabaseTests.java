// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.ReadOnlyFollowingDatabase;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class ReadOnlyFollowingDatabaseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReadOnlyFollowingDatabase model =
            BinaryData
                .fromString(
                    "{\"kind\":\"ReadOnlyFollowing\",\"properties\":{\"provisioningState\":\"Creating\",\"softDeletePeriod\":\"PT198H7M47S\",\"hotCachePeriod\":\"PT87H56M58S\",\"statistics\":{\"size\":60.990345},\"leaderClusterResourceId\":\"zpjuohminyfl\",\"attachedDatabaseConfigurationName\":\"rwm\",\"principalsModificationKind\":\"None\",\"tableLevelSharingProperties\":{\"tablesToInclude\":[\"lvxwmyg\",\"xpgpq\"],\"tablesToExclude\":[\"sze\"],\"externalTablesToInclude\":[\"bjcrxgibbdaxco\"],\"externalTablesToExclude\":[\"zauorsuk\",\"kwbqplhlvnuu\",\"pzlrphw\",\"soldweyuqdunv\"],\"materializedViewsToInclude\":[\"rwrbi\",\"rk\",\"alywjhhgdn\"],\"materializedViewsToExclude\":[\"sivfomilo\"],\"functionsToInclude\":[\"dufiq\",\"dieuzaofj\"],\"functionsToExclude\":[\"cyyysfgdot\"]},\"originalDatabaseName\":\"biipuip\",\"databaseShareOrigin\":\"Other\",\"suspensionDetails\":{\"suspensionStartDate\":\"2021-04-29T06:53:37Z\"}},\"location\":\"cje\",\"id\":\"nizshqvcim\",\"name\":\"ev\",\"type\":\"gmblrri\"}")
                .toObject(ReadOnlyFollowingDatabase.class);
        Assertions.assertEquals("cje", model.location());
        Assertions.assertEquals(Duration.parse("PT87H56M58S"), model.hotCachePeriod());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReadOnlyFollowingDatabase model =
            new ReadOnlyFollowingDatabase().withLocation("cje").withHotCachePeriod(Duration.parse("PT87H56M58S"));
        model = BinaryData.fromObject(model).toObject(ReadOnlyFollowingDatabase.class);
        Assertions.assertEquals("cje", model.location());
        Assertions.assertEquals(Duration.parse("PT87H56M58S"), model.hotCachePeriod());
    }
}
