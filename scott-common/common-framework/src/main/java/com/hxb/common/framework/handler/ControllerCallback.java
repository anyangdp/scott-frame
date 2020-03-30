package com.hxb.common.framework.handler;

import com.hxb.common.framework.handler.GenericResponse;

/**
 * @author anyangdp
 *
 */
@FunctionalInterface
public interface ControllerCallback<RS> {

	void execute(GenericResponse<RS> response) throws Exception;
}
