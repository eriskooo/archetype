package ${package}.infrastructure.rest.exception;

import ${package}.infrastructure.error.GatewayErrorDTO;

import javax.ws.rs.core.Response;

/**
 * Exception to be thrown when a {@link Response.Status#BAD_GATEWAY} error is received from the Gateway and the PSI states are not handled
 * by the Gateway client.
 */
public class UnknownPsiStateException extends AbstractGatewayException {

  public UnknownPsiStateException(final GatewayErrorDTO error) {
    super(Response.Status.BAD_GATEWAY.getStatusCode(), error);
  }
}
