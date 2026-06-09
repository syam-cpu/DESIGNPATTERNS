package RouteHandlerChainOfResponsiblity.Handlers;

import RouteHandlerChainOfResponsiblity.DTO.Request;

public class ValidateParamsHandler implements RequestHandler {

    private final RequestHandler nextHandler;

    public ValidateParamsHandler(RequestHandler requestHandler)
    {   
        this.nextHandler = requestHandler;
    }

    @Override
    public void handle(Request request) {

        // Above the next handler call, whatever is written is executed here.
        System.out.println("ValidateParamsHandler: validating the params handler");
        this.nextHandler.handle(request);
        // below the handler , whatever is written is executed after the next handler.
    }    
}
