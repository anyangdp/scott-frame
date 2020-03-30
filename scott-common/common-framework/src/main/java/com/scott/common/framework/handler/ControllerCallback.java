package com.scott.common.framework.handler;

/**
 * @author anyangdp
 *
 */
@FunctionalInterface
public interface ControllerCallback<RS> {

	void execute(GenericResponse<RS> response) throws Exception;
}
