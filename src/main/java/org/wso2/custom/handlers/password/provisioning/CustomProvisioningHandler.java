package org.wso2.custom.handlers.password.provisioning;

import org.apache.commons.lang.RandomStringUtils;
import org.wso2.carbon.identity.application.authentication.framework.handler.provisioning.impl.DefaultProvisioningHandler;

public class CustomProvisioningHandler extends DefaultProvisioningHandler {
    /**
     * Generates (random) password for user to be provisioned
     *
     * @return
     */
    @Override
    protected String generatePassword() {
        String randomPassword = RandomStringUtils.random(10, true, true);
        return randomPassword = randomPassword + "A@1z";
    }

}