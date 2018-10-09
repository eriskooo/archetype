package ${package}.infrastructure.rest.filter.request;

import ${package}.infrastructure.domain.value.AbstractSimpleValueObject;

/**
 * A value object that contains a request id.
 */
public class RequestId extends AbstractSimpleValueObject<String> {

  /**
   * CDI only
   */
  public RequestId() {
    super();
  }

  public RequestId(final String requestId) {
    super(requestId);
  }
}
