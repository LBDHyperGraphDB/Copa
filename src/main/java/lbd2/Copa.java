package lbd2;

import java.time.Year;
import java.util.Date;

public class Copa {
	private String ano;
	private String dataInicio;
	private String dataFim;
	
	public Copa() {
		
	}
	
	public Copa (String ano, String dataInicio, String dataFim) {
		this.ano = ano;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public String getAno() {
	    return ano;
	}

	public void setAno(String ano) {
	    this.ano = ano;
	}
	
	public String getDataInicio() {
	    return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
	    this.dataInicio = dataInicio;
	}
	
	public String dataFim() {
	    return dataFim;
	}

	public void setDataFim(String dataFim) {
	    this.dataFim = dataFim;
	}
}
