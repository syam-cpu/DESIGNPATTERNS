package RouteHandlerChainOfResponsiblity.Handlers;

import RouteHandlerChainOfResponsiblity.DTO.Request;

public class FinishingHandler implements RequestHandler {

    @Override
    public void handle(Request request) {
        System.out.println("Do nothing: finishes the flow");
    }
}
