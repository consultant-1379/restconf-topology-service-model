/*
 * ------------------------------------------------------------------------------
 * ******************************************************************************
 *  COPYRIGHT Ericsson 2022
 *
 *  The copyright to the computer program(s) herein is the property of
 *  Ericsson Inc. The programs may be used and/or copied only with written
 *  permission from Ericsson Inc. or in accordance with the terms and
 *  conditions stipulated in the agreement/contract under which the
 *  program(s) have been supplied.
 * ******************************************************************************
 * ------------------------------------------------------------------------------
 */

package com.ericsson.oss.services.restconf.topologyservice.yang;

import java.util.ArrayList;
import java.util.List;

/**
 * Yang module name provider.
 */
public final class YangModuleNameProvider {

    private YangModuleNameProvider() {}

    /**
     * Get all yang modules filenames of 'implement' conformance-type.
     * @return list of filenames.
     */
    public static List<String> getRestconfYangModuleImplementFileNames() {
        final List<String> restconfYangFiles = new ArrayList<>();
        restconfYangFiles.add("ietf-bandwidth-availability-topology@2021-10-22.yang");
        restconfYangFiles.add("ietf-eth-te-topology@2019-11-18.yang");
        restconfYangFiles.add("ietf-eth-tran-service@2021-01-11.yang");
        restconfYangFiles.add("ietf-interfaces@2018-02-20.yang");
        restconfYangFiles.add("ietf-l2-topology@2020-11-15.yang");
        restconfYangFiles.add("ietf-l2-topology-state@2020-11-15.yang");
        restconfYangFiles.add("ietf-l2vpn-svc@2018-10-09.yang");
        restconfYangFiles.add("ietf-l3-unicast-topology@2018-02-26.yang");
        restconfYangFiles.add("ietf-l3-unicast-topology-state@2018-02-26.yang");
        restconfYangFiles.add("ietf-l3vpn-svc@2018-01-19.yang");
        restconfYangFiles.add("ietf-microwave-radio-link@2019-06-19.yang");
        restconfYangFiles.add("ietf-microwave-topology@2021-10-22.yang");
        restconfYangFiles.add("ietf-network@2018-02-26.yang");
        restconfYangFiles.add("ietf-network-state@2018-02-26.yang");
        restconfYangFiles.add("ietf-network-topology@2018-02-26.yang");
        restconfYangFiles.add("ietf-network-topology-state@2018-02-26.yang");
        restconfYangFiles.add("ietf-restconf-monitoring@2017-01-26.yang");
        restconfYangFiles.add("ietf-restconf-subscribed-notifications@2019-11-17.yang");
        restconfYangFiles.add("ietf-subscribed-notifications@2019-09-09.yang");
        restconfYangFiles.add("ietf-te@2021-10-22.yang");
        restconfYangFiles.add("ietf-te-topology@2020-08-06.yang");
        restconfYangFiles.add("ietf-te-topology-state@2020-08-06.yang");
        restconfYangFiles.add("ietf-tp-interface-reference-topology@2021-10-22.yang");
        restconfYangFiles.add("ietf-trans-client-service@2021-01-11.yang");
        restconfYangFiles.add("ietf-yang-library@2016-06-21.yang");
        return restconfYangFiles;
    }

    /**
     * Get all yang modules filenames of 'import' conformance-type.
     * @return list of filenames.
     */
    public static List<String> getRestconfYangModuleImportFileNames() {
        final List<String> restconfYangFiles = new ArrayList<>();
        restconfYangFiles.add("iana-if-type.yang");
        restconfYangFiles.add("ieee802-dot1q-types.yang");
        restconfYangFiles.add("ietf-eth-tran-types@2021-07-07.yang");
        restconfYangFiles.add("ietf-inet-types@2013-07-15.yang");
        restconfYangFiles.add("ietf-interface-protection@2019-06-19.yang");
        restconfYangFiles.add("ietf-layer1-types@2021-02-19.yang");
        restconfYangFiles.add("ietf-microwave-types@2019-06-19.yang");
        restconfYangFiles.add("ietf-restconf@2017-01-26.yang");
        restconfYangFiles.add("ietf-te-types@2020-06-10.yang");
        restconfYangFiles.add("ietf-trans-client-svc-types@2019-11-03.yang");
        restconfYangFiles.add("ietf-yang-types@2013-07-15.yang");
        return restconfYangFiles;
    }
}
