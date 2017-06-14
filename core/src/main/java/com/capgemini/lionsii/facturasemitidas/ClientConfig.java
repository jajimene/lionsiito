package com.capgemini.lionsii.facturasemitidas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrofactemitidas.SiiService;

/**
 * @author Jaume
 *
 */
@Configuration
public class ClientConfig {

  @Bean
  public SiiService siiService() {

    return new SiiService();
  }

}
