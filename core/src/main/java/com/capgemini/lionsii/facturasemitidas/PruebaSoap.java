package com.capgemini.lionsii.facturasemitidas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

import javax.inject.Inject;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrofactemitidas.SiiSOAP;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrofactemitidas.SiiService;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.CabeceraSii;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.ClaveTipoComunicacionType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.ClaveTipoFacturaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.FacturaExpedidaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.IDFacturaExpedidaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.PersonaFisicaJuridicaESType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.RegistroSii;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRfacturasEmitidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLRFacturasEmitidas;

/**
 * @author Jaume
 *
 */
@Controller
public class PruebaSoap {

  @Inject
  private SiiService siiService;

  @Value("${sii.facturasemitidas.endpoint}")
  private String facturasEmitidasEndpoint;

  private com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.ObjectFactory suministrolr =
      new com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.ObjectFactory();

  private com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.ObjectFactory suministroinformacion =
      new com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.ObjectFactory();

  @RequestMapping(path = "/prueba")
  public void main() throws IOException, GeneralSecurityException {

    // System.out.println("Hello world");

    // String keyStoreLocation = "G:\\Devon-dist_2.1.0\\software\\java\\jre\\lib\\security\\cacerts";
    // String trustStoreLocation = "G:\\Devon-dist_2.1.0\\software\\java\\jre\\lib\\security\\cacerts";
    String keyStoreLocation = "G:\\Devon-dist_2.1.0\\software\\lionsii-ks.keystore";
    String trustStoreLocation = "G:\\Devon-dist_2.1.0\\software\\lionsii-ks.keystore";
    String alias = "jaime-fnmt-rcm";
    String password = "Pass123";
    InputStream ksfile = new FileInputStream(keyStoreLocation);

    SiiSOAP siiSOAP = this.siiService.getSuministroFactEmitidasPruebas();

    // Create our custom SSLSocketFactory
    // SSLSocketFactory socketFactory =
    // new SSLSocketFactoryGenerator(alias, keyStoreLocation, trustStoreLocation).getSSLSocketFactory();

    SSLContext sc = SSLContext.getInstance("TLS");
    KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
    KeyStore ks = KeyStore.getInstance("JKS");
    ks.load(ksfile, password.toCharArray());

    kmf.init(ks, password.toCharArray());

    sc.init(kmf.getKeyManagers(), null, null);

    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

    BindingProvider bindingProvider = (BindingProvider) siiSOAP;
    bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.facturasEmitidasEndpoint);

    SuministroLRFacturasEmitidas suministroLRFacturasEmitidas = this.suministrolr.createSuministroLRFacturasEmitidas();

    // Cabecera
    CabeceraSii cabecera = this.suministroinformacion.createCabeceraSii();

    cabecera.setIDVersionSii("07");
    cabecera.setTipoComunicacion(ClaveTipoComunicacionType.A_0);

    // Titular
    PersonaFisicaJuridicaESType titular = this.suministroinformacion.createPersonaFisicaJuridicaESType();
    titular.setNIF("33562708G");
    titular.setNombreRazon("Jaime Jimenez Cuesta");
    cabecera.setTitular(titular);

    suministroLRFacturasEmitidas.setCabecera(cabecera);

    // Factura
    LRfacturasEmitidasType factura = this.suministrolr.createLRfacturasEmitidasType();

    IDFacturaExpedidaType idFacturaExpedida = new IDFacturaExpedidaType();
    idFacturaExpedida.setFechaExpedicionFacturaEmisor("20-05-2017");

    FacturaExpedidaType facturaExpedida = new FacturaExpedidaType();
    facturaExpedida.setTipoFactura(ClaveTipoFacturaType.F_1);

    RegistroSii.PeriodoImpositivo periodoImpositivo = new RegistroSii.PeriodoImpositivo();

    periodoImpositivo.setEjercicio("2017");
    periodoImpositivo.setPeriodo("06");

    factura.setIDFactura(idFacturaExpedida);
    factura.setFacturaExpedida(facturaExpedida);
    factura.setPeriodoImpositivo(periodoImpositivo);

    suministroLRFacturasEmitidas.getRegistroLRFacturasEmitidas().add(factura);

    // Llamar al WS
    siiSOAP.suministroLRFacturasEmitidas(suministroLRFacturasEmitidas);
  }

}
