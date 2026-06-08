package RouteHandlerChainOfResponsiblity.Controller;

import RouteHandlerChainOfResponsiblity.DTO.Request;
import RouteHandlerChainOfResponsiblity.Schema.ToDo;

public class ToDoController {
    private ToDo createTodo(Request request)
    {
        //Execute initial handlers.
        // return a new todo.
        return new ToDo();
    }
}
