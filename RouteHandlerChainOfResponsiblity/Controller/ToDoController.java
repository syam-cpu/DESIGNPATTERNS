package RouteHandlerChainOfResponsiblity.Controller;

import RouteHandlerChainOfResponsiblity.DTO.Request;
import RouteHandlerChainOfResponsiblity.Factory.RequestHandlerFactory;
import RouteHandlerChainOfResponsiblity.Handlers.AuthenticationHandler;
import RouteHandlerChainOfResponsiblity.Handlers.AuthorizationHandler;
import RouteHandlerChainOfResponsiblity.Handlers.FinishingHandler;
import RouteHandlerChainOfResponsiblity.Handlers.RequestHandler;
import RouteHandlerChainOfResponsiblity.Handlers.ValidateBodyHandler;
import RouteHandlerChainOfResponsiblity.Handlers.ValidateParamsHandler;
import RouteHandlerChainOfResponsiblity.Schema.ToDo;

public class ToDoController {
    private ToDo createTodo(Request request)
    {
        //Execute initial handlers.
        // return a new todo.
        RequestHandlerFactory.getHandlesForCreateTodo().handle(request);

        return new ToDo();
    }
}
