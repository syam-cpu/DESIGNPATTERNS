package RouteHandlerChainOfResponsiblity.Factory;

import RouteHandlerChainOfResponsiblity.Handlers.AuthenticationHandler;
import RouteHandlerChainOfResponsiblity.Handlers.AuthorizationHandler;
import RouteHandlerChainOfResponsiblity.Handlers.FinishingHandler;
import RouteHandlerChainOfResponsiblity.Handlers.RequestHandler;
import RouteHandlerChainOfResponsiblity.Handlers.ValidateBodyHandler;
import RouteHandlerChainOfResponsiblity.Handlers.ValidateParamsHandler;

public class RequestHandlerFactory {
    public static RequestHandler getHandlesForCreateTodo()
    {
        RequestHandler requestHandler  = new ValidateParamsHandler(new ValidateBodyHandler
            (new AuthenticationHandler(new AuthorizationHandler(new FinishingHandler()))));

        return requestHandler;
    }
}
