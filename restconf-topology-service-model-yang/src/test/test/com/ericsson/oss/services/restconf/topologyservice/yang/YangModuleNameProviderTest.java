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

import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Yang module name provider test.
 */
public class YangModuleNameProviderTest {

    @Test
    public void verify_yangFileNames_present_in_provider_list() {
        final List<String> yangImplementFileNames = YangModuleNameProvider.getRestconfYangModuleImplementFileNames();
        final List<String> yangImportFileNames = YangModuleNameProvider.getRestconfYangModuleImportFileNames();
        final File path = new File("src/main/resources/restconf");
        for (final File file : path.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".yang") && !(yangImplementFileNames.contains(file.getName())
                || yangImportFileNames.contains(file.getName()))) {
                Assert.fail("Missing [" + file.getName() + "] in YangModuleNameProvider class!");
            }
        }
    }
}
