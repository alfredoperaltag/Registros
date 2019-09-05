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
	
	@Override
	public boolean agregarRegistro() {
		String ka="";
		String jo="";
		String ii="";
		String cuenta="";
		try{
			for(int i=0001; i<10000; i++) {
				if(i<10) {
					ii="000"+Integer.toString(i);
				} else if(i<100) {
					ii="00"+Integer.toString(i);
				} else if(i<1000) {
					ii="0"+Integer.toString(i);
				} else if(i<10000) {
					ii=Integer.toString(i);
				}
				for(int j=00; j<100; j++) {
					if(j<10) {
						jo="0"+Integer.toString(j);
					}else if(j<100) {
						jo=Integer.toString(j);
					}
					if(j!=0) {
						for(int k=000; k<1000; k++) {
							if(k<10) {
								ka="00"+Integer.toString(k);
							}else if(k<100) {
								ka="0"+Integer.toString(k);
							}else if(k<1000) {
								ka=Integer.toString(k);
							}
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
