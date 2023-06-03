package fsm.miaad.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
        System.out.println("=======================================");

    }

//    @Bean
    RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route((r)->r.path("/owners/**").uri("lb://IMMATRICULATION-SERVICE"))
                .route((r)->r.path("/vehicles/**").uri("lb://IMMATRICULATION-SERVICE"))
                .route((r)->r.path("/infractions/**").uri("lb://INFRACTION-SERVICE"))
                .build();
    }


    @Bean
    DiscoveryClientRouteDefinitionLocator definitionLocator(ReactiveDiscoveryClient client, DiscoveryLocatorProperties properties){
        return  new DiscoveryClientRouteDefinitionLocator(client,properties);
    }

}
