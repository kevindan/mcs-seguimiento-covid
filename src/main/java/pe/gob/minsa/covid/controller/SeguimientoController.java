package pe.gob.minsa.covid.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import pe.gob.minsa.covid.bean.ConsultaMPIReq;
import pe.gob.minsa.covid.bean.DatosReniecPersonaResp;
import pe.gob.minsa.covid.bean.PaisResponseBean;
import pe.gob.minsa.covid.bean.RequestRegistroBean;
import pe.gob.minsa.covid.bean.ResponseHospitalesDepartamento;
import pe.gob.minsa.covid.bean.ResponseListarPosicion;
import pe.gob.minsa.covid.bean.ResponseRegistroBean;
import pe.gob.minsa.covid.bean.ResponseUbigeoCasos;
import pe.gob.minsa.covid.bean.ResponseValidaMpiBean;
import pe.gob.minsa.covid.bean.ResponseValidaPaciente;
import pe.gob.minsa.covid.config.PropertiesBean;
import pe.gob.minsa.covid.model.HospitalesDepartamento;
import pe.gob.minsa.covid.model.Pais;
import pe.gob.minsa.covid.model.PosicionPersonaEpisodio;
import pe.gob.minsa.covid.model.UbigeoCasos;
import pe.gob.minsa.covid.repository.HospitalesDepartamentoRepository;
import pe.gob.minsa.covid.repository.UbigeoCasosRepository;
import pe.gob.minsa.covid.service.SeguimientoService;

@RestController
@RequestMapping("/seguimiento/v0.0.1")
@Api(tags = { "Seguimiento COVID-19" })
@SwaggerDefinition(tags = {
		@Tag(name = "Seguimiento COVID-19", description = "Operaciones par el seguimiento del COVID-19") })
public class SeguimientoController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private RestTemplate restTemplate = new RestTemplate();

	@Autowired
	private SeguimientoService _seguimientoService;
	
	@Autowired
	private HospitalesDepartamentoRepository hospitalDeptoRepository;
	
	@Autowired
	private UbigeoCasosRepository ubigeoCasosRepository;


	@Autowired
	private PropertiesBean propertiesBean;

	@GetMapping(value = "/listar-paises", produces = "application/json; charset=UTF-8")
	public PaisResponseBean consultaPaises() {
		PaisResponseBean response = new PaisResponseBean();
		List<Pais> paises = new ArrayList<Pais>();
		try {
			paises = _seguimientoService.listaPaises();
			if (paises.size() > 0) {
				response.setCodigo("0000");
				response.setPaises(paises);
			} else {
				response.setCodigo("9999");
				response.setPaises(null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			response.setCodigo("9000");
			response.setPaises(null);
		}
		return response;
	}

	@GetMapping(value = "/valida-persona/{tipo_documento}/{numero_documento}/{apellido_paterno}", produces = "application/json; charset=utf-8")
	public ResponseValidaPaciente validaPaciente(@PathVariable("tipo_documento") String tipo_documento,
			@PathVariable("numero_documento") String numero_documento,
			@PathVariable("apellido_paterno") String apellido_apterno) {

		DatosReniecPersonaResp datos = new DatosReniecPersonaResp();
		ResponseValidaMpiBean responseMpi = new ResponseValidaMpiBean();
		ResponseValidaPaciente responsePaciente = new ResponseValidaPaciente();
		datos = datosReniecPersona(tipo_documento, numero_documento);
		System.out.println("Datos MPI : " + datos.toString());
		System.out.println("Apellido paterno : " + apellido_apterno.toUpperCase());

		if (datos.getCodRespuesta().equals("0000")) {
			if (datos.getApePadre().equals(apellido_apterno.toUpperCase())) {
				responseMpi.setNombres(datos.getPrenombres());
				responseMpi.setApellido_paterno(datos.getApePadre());
				responseMpi.setApellido_materno(datos.getApeMadre());
				responseMpi.setFecha_nacimiento(datos.getFecNacimiento());
				responseMpi.setTipo_documento(tipo_documento);
				responseMpi.setNumero_documento(numero_documento);
				responseMpi.setSexo(datos.getGenero());

				responsePaciente.setCodigo("0000");
				responsePaciente.setDatos_paciente(responseMpi);

			} else {
				responsePaciente.setCodigo("0100");
				responsePaciente.setDatos_paciente(null);
			}
		} else {
			responsePaciente.setCodigo(datos.getCodRespuesta());
			responsePaciente.setDatos_paciente(null);
		}

		return responsePaciente;
	}

	@PostMapping(value = "/registra-caso", produces = "application/json; charset=utf-8")
	public ResponseRegistroBean registraCaso(@RequestBody RequestRegistroBean registroBean) {
		ResponseRegistroBean responseRegistroBean = new ResponseRegistroBean();
		responseRegistroBean = _seguimientoService.registraCaso(registroBean);
		return responseRegistroBean;
	}
	
	@GetMapping(value="listar-posicion" , produces="application/json; charset=UTF-8")
	public ResponseListarPosicion listarPosicion() {
		
		ResponseListarPosicion rsp = new ResponseListarPosicion();
		List<PosicionPersonaEpisodio> posiciones = new ArrayList<PosicionPersonaEpisodio>();
		try {
			posiciones = _seguimientoService.listarPosicion();
			if(posiciones.isEmpty()) {
				rsp.setCodigo("9999");
				rsp.setPosiciones(null);
			}else {
				rsp.setCodigo("0000");
				rsp.setPosiciones(posiciones);
			}
		} catch (Exception e) {
			rsp.setCodigo("9000");
			rsp.setPosiciones(null);
		}
		return rsp;
	}
	
	@GetMapping(value="buscar-hospitales/{departamentoId}", produces="application/json; charset=UTF-8")
	public  ResponseHospitalesDepartamento buscarHospitales(@PathVariable("departamentoId")  String departamentoId){
		
		ResponseHospitalesDepartamento rsp = new ResponseHospitalesDepartamento();
		List<HospitalesDepartamento> hospitales = new ArrayList<HospitalesDepartamento>();
			try {
				
				hospitales = hospitalDeptoRepository.findByDepartamentoId(departamentoId);
				
				if(hospitales.isEmpty()) {
					
					rsp.setCodigo("9999");
					rsp.setHospitales(null);
					
				}else {
					rsp.setCodigo("0000");
					rsp.setHospitales(hospitales);
				}
				
			} catch (Exception e) {
				rsp.setCodigo("9000");
				rsp.setHospitales(null);			
			
		}
			return rsp;
	}
	

	@GetMapping(value="listar-ubigeo-casos", produces="application/json; charset=UTF-8")
	public ResponseUbigeoCasos listarUbigeoCasos() {
		
		ResponseUbigeoCasos rsp = new ResponseUbigeoCasos();

		List<UbigeoCasos> lista = new ArrayList<UbigeoCasos>();
		lista = ubigeoCasosRepository.findByEstadoOrderByUbigeo("1");
		try {
			if(lista.isEmpty())
			{	rsp.setCodigo("9999");
				rsp.setUbigeoCasos(null);
			}else {
				rsp.setCodigo("0000");
				rsp.setUbigeoCasos(lista);
			}
			
		} catch (Exception e) {
			logger.error(e.getMessage());
			rsp.setCodigo("9000");
			rsp.setUbigeoCasos(null);
		}
		
		return rsp;
	}

	private DatosReniecPersonaResp datosReniecPersona(String tipo_doc, String nro_doc) {

		DatosReniecPersonaResp dato = null;
		ConsultaMPIReq consultaMpi = null;
		try {
			consultaMpi = new ConsultaMPIReq(tipo_doc, nro_doc);
			ResponseEntity<DatosReniecPersonaResp> resp = restTemplate.postForEntity(propertiesBean.getUrl_mpi(),
					consultaMpi, DatosReniecPersonaResp.class);
			dato = resp.getBody();
		} catch (Exception ex) {
			logger.error(" *** Error datosReniecPersona: " + ex.getMessage());
		}
		return dato;
	}

}
