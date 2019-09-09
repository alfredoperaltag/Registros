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
	
	void ciclos(int veces, int maximo){
		log.info("VECES: "+veces);
		//for(int i=0;i<veces;i++) {
			for(int k=0;k<maximo+1;k++) {
				String imprimir=Integer.toString(veces)+Integer.toString(k);
				log.info(imprimir);
			}
			
		//}
		veces--;
	}
	
	@Override
	public boolean agregarRegistro(Registro registro) {
		String k0="";
		String k1="0";
		String resultado = "";
		try{
			String cuenta = registro.getCuenta();
			String[] arrayPartes = cuenta.split("-");
			int partes=arrayPartes.length;
			String[]maximo = new String[arrayPartes.length];
			int[]maximoInt = new int[arrayPartes.length];
			
			
			/*for (int i = 0; i < partes; i++) {
				int digitos=arrayPartes[i].length();
				maximo[i]="";
				for(int j = 0;j<digitos;j++) {
					maximo[i] += "9";	
				}
				//log.info("digitos: "+digitos+" maximo: "+maximo[i]);
			}*/
			
			
			
			
			//for (int i = partes; i > 0; i--) {
				for (int j = 0; j < partes; j++) {
				int digitos=arrayPartes[j].length();
				maximo[j]="";
				for(int k = 0;k<digitos;k++) {
					maximo[j] += "9";	
				}
				maximoInt[j]= Integer.parseInt(maximo[j]);
				for(int l=0;l<maximoInt[j]+1;l++) {
					log.info(Integer.toString(l));
					
				}
				
			
				
				
			
				
				
				//maximo[i]="";
				//for(int j = 0;j<arrayPartes[i].length();j++) {
					//maximo[i] += "9";	
				//}
				//maximoInt[i]= Integer.parseInt(maximo[i]);

				//ciclos(partes,maximoInt[i]);
				
					/*for(int k=0;k<maximoInt[i]+1;k++) {
							//log.info(Integer.toString(k));
					}*/
				
			}
			
			
			return true;
        }catch (Exception ex){
            log.error("ERROR: "+ex.getMessage());
            return false;
        }
	}
}