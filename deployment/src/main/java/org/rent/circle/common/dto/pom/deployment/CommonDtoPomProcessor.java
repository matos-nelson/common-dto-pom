package org.rent.circle.common.dto.pom.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class CommonDtoPomProcessor {

    private static final String FEATURE = "common-dto-pom";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
