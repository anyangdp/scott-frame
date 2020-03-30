package com.scott.common.framework.handler;

/**
 * @author anyangdp
 *
 */
@FunctionalInterface
public interface ServiceCallback<RS> {

	void execute(GenericResponse<RS> response) throws Exception;
}
