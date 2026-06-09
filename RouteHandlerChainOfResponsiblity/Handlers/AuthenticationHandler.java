package RouteHandlerChainOfResponsiblity.Handlers;

import RouteHandlerChainOfResponsiblity.DTO.Request;
import RouteHandlerChainOfResponsiblity.Services.TokenService;

public class AuthenticationHandler  implements RequestHandler {


    private final RequestHandler nextHandler;
    private final TokenService tokenService;

    public AuthenticationHandler(RequestHandler nextHandler)
    {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("AuthenticationHandlers: Authenticating the request");
        this.nextHandler.handle(request); 
    }    
}
