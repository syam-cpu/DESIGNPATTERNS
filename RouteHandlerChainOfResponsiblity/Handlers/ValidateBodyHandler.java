package RouteHandlerChainOfResponsiblity.Handlers;

import RouteHandlerChainOfResponsiblity.DTO.Request;

public class ValidateBodyHandler implements RequestHandler{

    private final RequestHandler nextHandler;

    public ValidateBodyHandler(RequestHandler requestHandler)
    {
        this.nextHandler = requestHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("ValidateBodyHandler: validating the request");
        this.nextHandler.handle(request);
    }
}
