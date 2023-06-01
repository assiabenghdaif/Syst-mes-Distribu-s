package fsm.miaad.immatriculationservice;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
@Configuration
public class MyConfig {
//    @Autowired
//    private Bus bus; // Autowired Bus object for CXF
//
//    @Autowired
//    private OwnerSoapController ownerSoapController; // Autowired OwnerSoapService object
//    @Autowired
//    private VehicleSoapController vehicleSoapController;
//    @Bean
//    public EndpointImpl endpoint() {
//        // Create a new EndpointImpl object with the provided Bus and OwnerSoapService
//
//        EndpointImpl endpoint = new EndpointImpl( bus, ownerSoapController);
//
//        endpoint.publish("/immatriculation-service/owners/soap"); // Publish the SOAP Web Service on the specified URL
//
//        return endpoint; // Return the configured EndpointImpl object
//    }

    @Bean
    public SimpleJaxWsServiceExporter getJWS() {
        SimpleJaxWsServiceExporter exporter=new SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://localhost:1234/immatriculation-service");
        return exporter;
    }
}
