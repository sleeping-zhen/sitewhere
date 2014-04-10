/*
 * DeviceGroupElementCreateRequest.java 
 * --------------------------------------------------------------------------------------
 * Copyright (c) Reveal Technologies, LLC. All rights reserved. http://www.reveal-tech.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.model.device.request;

import java.util.ArrayList;
import java.util.List;

import com.sitewhere.spi.device.group.GroupElementType;
import com.sitewhere.spi.device.request.IDeviceGroupElementCreateRequest;

/**
 * Holds fields needed to create a new device group element.
 * 
 * @author Derek
 */
public class DeviceGroupElementCreateRequest implements IDeviceGroupElementCreateRequest {

	/** Element type */
	private GroupElementType type;

	/** Element id */
	private String elementId;

	/** List of roles for element */
	private List<String> roles = new ArrayList<String>();

	public GroupElementType getType() {
		return type;
	}

	public void setType(GroupElementType type) {
		this.type = type;
	}

	public String getElementId() {
		return elementId;
	}

	public void setElementId(String elementId) {
		this.elementId = elementId;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}