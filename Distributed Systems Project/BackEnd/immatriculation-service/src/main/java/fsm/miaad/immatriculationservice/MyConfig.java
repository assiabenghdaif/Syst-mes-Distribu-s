package fsm.miaad.immatriculationservice;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
@Configuration
public class MyConfig {

    @Bean
    public SimpleJaxWsServiceExporter getJWS() {
        SimpleJaxWsServiceExporter exporter=new SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://localhost:1234/immatriculation-service/soap");
        return exporter;
    }
}
