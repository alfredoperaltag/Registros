package com.example.registro.implementaciones;

import java.sql.Date;

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
	
	private String digitos(int variable, String primero,String segundo,String tercero) {
		String resultado="";
		if(variable<10) {
			return resultado=primero+Integer.toString(variable);
		} else if(variable<100) {
			return resultado=segundo+Integer.toString(variable);
		} else if(variable<1000) {
			return resultado=tercero+Integer.toString(variable);
		} else if(variable<10000) {
			return resultado=Integer.toString(variable);
		}
		return resultado;
	}
	
	@Override
	public boolean agregarRegistro() {
		String ka="";
		String jo="";
		String ii="";
		String cuenta="";
		try{
			for(int i=0001; i<10000; i++) {
				ii=digitos(i,"000","00","0");
				for(int j=00; j<100; j++) {
					jo=digitos(j,"0","","");
					if(j!=0) {
						for(int k=000; k<1000; k++) {
							ka=digitos(k,"00","0","");
							log.info(ii+"-"+jo+"-"+ka);
							cuenta=ii+"-"+jo+"-"+ka;
							Registro registro = new Registro(1,1,1,Date.valueOf("2019-07-10"),1,cuenta,"nombre",1,(char) 1,"mxn",1,1);
							registroRepository.save(registro);
			                log.info("se agrego el Tarea: "+registro.toString());
							//log.info(ii+"-"+jo+"-"+ka);
						}
					}else {
						cuenta=ii+"-"+jo+"-"+"000";
						Registro registro = new Registro(1,1,1,Date.valueOf("2019-07-10"),1,cuenta,"nombre",1,(char) 1,"mxn",1,1);
						registroRepository.save(registro);
		                log.info("se agrego el Tarea: "+registro.toString());
						//log.info(ii+"-"+jo+"-"+"000");
					}
				}
			}
			return true;
        }catch (Exception ex){
            log.error("ERROR: "+ex.getMessage());
            return false;
        }
	}
}