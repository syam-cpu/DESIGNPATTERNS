package RouteHandlerChainOfResponsiblity.Services;

import RouteHandlerChainOfResponsiblity.DTO.Request;

public interface TokenService {
    boolean validateToken(Request request);
}
