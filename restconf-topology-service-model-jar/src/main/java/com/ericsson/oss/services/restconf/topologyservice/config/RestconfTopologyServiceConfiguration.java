/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2022
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.oss.services.restconf.topologyservice.config;

import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinition;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinitions;
import com.ericsson.oss.itpf.modeling.annotation.configparam.Scope;
import com.ericsson.oss.itpf.modeling.annotation.constraints.Max;
import com.ericsson.oss.itpf.modeling.annotation.constraints.Min;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

/**
 * Restconf topology service configuration model.
 */
@EModel(namespace = "com.ericsson.oss.services.restconf.topologyservice.config.RestconfTopologyServiceConfiguration", description = "ignore")
@ConfParamDefinitions
public class RestconfTopologyServiceConfiguration {

    @NotNull
    @ConfParamDefinition(description = "RESTCONF NBI maximum parallel GET requests supported per user.", scope = Scope.GLOBAL, overridableInScopes = {
            Scope.SERVICE })
    @Min(1)
    @Max(3)
    @DefaultValue("3")
    public Integer restconfNbiMaximumParallelGetRequests;

    @NotNull
    @ConfParamDefinition(description = "RESTCONF NBI maximum parallel user requests supported.", scope = Scope.GLOBAL, overridableInScopes = {
            Scope.SERVICE })
    @Min(1)
    @Max(3)
    @DefaultValue("3")
    public Integer restconfNbiMaximumParallelUserRequests;

    @NotNull
    @ConfParamDefinition(description = "RESTCONF NBI maximum thread pool size.", scope = Scope.GLOBAL, overridableInScopes = {
            Scope.SERVICE })
    @Min(1)
    @DefaultValue("10")
    @Max(10)
    public Integer restconfNbiMaximumThreadPoolSize;

    @NotNull
    @ConfParamDefinition(description = "RESTCONF NBI maximum yang data nodes hierarchy level.", scope = Scope.GLOBAL, overridableInScopes = {
            Scope.SERVICE })
    @Min(-1)
    @Max(3)
    @DefaultValue("1")
    public Integer restconfNbiMaximumNodesHierarchyLevel;

    @NotNull
    @ConfParamDefinition(description = "RESTCONF NBI maximum MO process.", scope = Scope.GLOBAL, overridableInScopes = {
            Scope.SERVICE })
    @Min(1)
    @DefaultValue("1000")
    public Integer restconfNbiMaximumMoProcess;
}
