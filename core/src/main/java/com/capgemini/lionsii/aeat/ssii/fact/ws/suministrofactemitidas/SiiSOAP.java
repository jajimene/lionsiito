
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministrofactemitidas;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRConsultaEmitidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr.RespuestaConsultaLRFacturasEmitidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.respuestasuministro.RespuestaLRBajaFEmitidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.respuestasuministro.RespuestaLRFEmitidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.BajaLRFacturasEmitidas;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLRFacturasEmitidas;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035 Generated source version: 2.2
 *
 */
@WebService(name = "siiSOAP", targetNamespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroFactEmitidas.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
com.capgemini.lionsii.aeat.ssii.fact.ws.respuestasuministro.ObjectFactory.class,
com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr.ObjectFactory.class,
com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.ObjectFactory.class,
com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.ObjectFactory.class,
com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.ObjectFactory.class })
public interface SiiSOAP {

  /**
   * 
   * @param suministroLRFacturasEmitidas
   * @return returns
   *         https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.respuestasuministro.RespuestaLRFEmitidasType
   */
  @WebMethod(operationName = "SuministroLRFacturasEmitidas")
  @WebResult(name = "RespuestaLRFacturasEmitidas", targetNamespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", partName = "RespuestaSuministroLRFacturasEmitidas")
  public RespuestaLRFEmitidasType suministroLRFacturasEmitidas(
      @WebParam(name = "SuministroLRFacturasEmitidas", targetNamespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", partName = "SuministroLRFacturasEmitidas") SuministroLRFacturasEmitidas suministroLRFacturasEmitidas);

  /**
   * 
   * @param anulacionLRFacturasEmitidas
   * @return returns
   *         https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.respuestasuministro.RespuestaLRBajaFEmitidasType
   */
  @WebMethod(operationName = "AnulacionLRFacturasEmitidas")
  @WebResult(name = "RespuestaLRBajaFacturasEmitidas", targetNamespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", partName = "RespuestaLAnulacionRFacturasEmitidas")
  public RespuestaLRBajaFEmitidasType anulacionLRFacturasEmitidas(
      @WebParam(name = "BajaLRFacturasEmitidas", targetNamespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", partName = "AnulacionLRFacturasEmitidas") BajaLRFacturasEmitidas anulacionLRFacturasEmitidas);

  /**
   * 
   * @param consultaLRFacturasEmitidas
   * @return returns
   *         https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.respuestaconsultalr.RespuestaConsultaLRFacturasEmitidasType
   */
  @WebMethod(operationName = "ConsultaLRFacturasEmitidas")
  @WebResult(name = "RespuestaConsultaLRFacturasEmitidas", targetNamespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", partName = "RespuestaConsultaLRFacturasEmitidas")
  public RespuestaConsultaLRFacturasEmitidasType consultaLRFacturasEmitidas(
      @WebParam(name = "ConsultaLRFacturasEmitidas", targetNamespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", partName = "ConsultaLRFacturasEmitidas") LRConsultaEmitidasType consultaLRFacturasEmitidas);

}
