package RouteHandlerChainOfResponsiblity.Factory;

import RouteHandlerChainOfResponsiblity.Handlers.AuthenticationHandler;
import RouteHandlerChainOfResponsiblity.Handlers.AuthorizationHandler;
import RouteHandlerChainOfResponsiblity.Handlers.FinishingHandler;
import RouteHandlerChainOfResponsiblity.Handlers.RequestHandler;
import RouteHandlerChainOfResponsiblity.Handlers.ValidateBodyHandler;
import RouteHandlerChainOfResponsiblity.Handlers.ValidateParamsHandler;
import RouteHandlerChainOfResponsiblity.Services.TokenServiceImpl;

public class RequestHandlerFactory {
    public static RequestHandler getHandlesForCreateTodo()
    {
        RequestHandler requestHandler  = new ValidateParamsHandler(new ValidateBodyHandler
            (new AuthenticationHandler(new AuthorizationHandler(new FinishingHandler()), new TokenServiceImpl())));

        return requestHandler;
    }

    public static RequestHandler getHandlerForUpdateTodo()
    {
        RequestHandler requestHandler  = new ValidateParamsHandler(new ValidateBodyHandler
            (new AuthenticationHandler(new AuthorizationHandler(new FinishingHandler()), new TokenServiceImpl())));

        return requestHandler;

    }
}
