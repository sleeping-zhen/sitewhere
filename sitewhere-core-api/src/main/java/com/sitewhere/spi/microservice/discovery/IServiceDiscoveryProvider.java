/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.microservice.discovery;

import java.util.List;

import com.sitewhere.spi.SiteWhereException;
import com.sitewhere.spi.microservice.IFunctionIdentifier;
import com.sitewhere.spi.server.lifecycle.ILifecycleComponent;

/**
 * Supports discovering information about other microservices that provide a
 * given system function.
 * 
 * @author Derek
 */
public interface IServiceDiscoveryProvider extends ILifecycleComponent {

    /**
     * Register the given microservice.
     * 
     * @throws SiteWhereException
     */
    public void registerService() throws SiteWhereException;

    /**
     * Send a heartbeat to the service discovery provider.
     * 
     * @throws SiteWhereException
     */
    public void sendHeartbeat() throws SiteWhereException;

    /**
     * Get list of nodes that provide the given functionality.
     * 
     * @param identifier
     * @return
     * @throws SiteWhereException
     */
    public List<IServiceNode> getNodesForFunction(IFunctionIdentifier identifier) throws SiteWhereException;
}
