package com.example.registro.controladores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registro.entidades.Registro;
import com.example.registro.servicios.RegistroService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(path = "/")
public class RegistroController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	private ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,false);
	
	@Autowired
	@Qualifier("RegistroService")
	 private RegistroService registroService;
	
	@RequestMapping(path ="registro",method = RequestMethod.POST)
    public @ResponseBody boolean agregarRegistro(){
        try{
            //Registro registro = mapper.readValue(registroJSON, Registro.class);
            //log.info("Se recibio del formulario: \n"+registro.toString());

            if (registroService.agregarRegistro()){
                log.info("Se agrego el registro correctamente");
                return true;
            }
            return false;
        }catch (Exception ex){
            log.error("ERROR: "+ex.getMessage());
            return false;
        }
}
}
