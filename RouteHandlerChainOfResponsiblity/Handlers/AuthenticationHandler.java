package RouteHandlerChainOfResponsiblity.Handlers;

import RouteHandlerChainOfResponsiblity.DTO.Request;
import RouteHandlerChainOfResponsiblity.Services.TokenService;

public class AuthenticationHandler  implements RequestHandler {


    private final RequestHandler nextHandler;
    private final TokenService tokenService;

    public AuthenticationHandler(RequestHandler nextHandler, TokenService tokenService)
    {
        this.nextHandler = nextHandler;
        this.tokenService = tokenService;
    }

    @Override
    public void handle(Request request) {
        this.tokenService.validateToken(request);
        System.out.println("AuthenticationHandlers: Authenticating the request");
        this.nextHandler.handle(request); 
    }    
}
