package pe.gob.minsa.covid.config;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value= {"file:/opt/data/mcs-minsa/properties/mcs-seguimiento-covid.properties"})
//@PropertySource(value= {"classpath:mcs-seguimiento-covid.properties"})
public class PropertiesBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Value("${mcs.url-mpi}")
	private String url_mpi;
	
	public PropertiesBean() {
		
	}

	public PropertiesBean(String url_mpi) {
		this.url_mpi = url_mpi;
	}

	public String getUrl_mpi() {
		return url_mpi;
	}

	public void setUrl_mpi(String url_mpi) {
		this.url_mpi = url_mpi;
	}

	@Override
	public String toString() {
		return "PropertiesBean [url_mpi=" + url_mpi + "]";
	}
	
}
