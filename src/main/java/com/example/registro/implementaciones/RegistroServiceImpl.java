package com.example.registro.implementaciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.registro.entidades.Registro;
import com.example.registro.repositorios.RegistroRepository;
import com.example.registro.servicios.RegistroService;

@Service("RegistroService")
public class RegistroServiceImpl implements RegistroService {
private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier ("RegistroRepository")
	private RegistroRepository registroRepository;
	
	@Override
	public boolean agregarRegistro() {
		try{
			
			return true;
        }catch (Exception ex){
            log.error("ERROR: "+ex.getMessage());
            return false;
        }
	}
}
