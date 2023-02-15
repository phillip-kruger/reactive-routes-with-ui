package org.acme;

import static io.quarkus.vertx.web.Route.HttpMethod.DELETE;
import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RoutingExchange;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Resource {

    @Route(path = "/delete", methods = DELETE)
    void deleteHttpMethod(RoutingExchange exchange) {
        exchange.ok("deleted");
    }
    
    
}
