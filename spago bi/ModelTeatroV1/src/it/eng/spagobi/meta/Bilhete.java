package it.eng.spagobi.meta;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * This class refers to the bilhete table.
 * 
 */
@Entity
@Table(name="`bilhete`"
, catalog="`dwteatro`"
)


public class Bilhete implements Serializable {

private static final long serialVersionUID = 1L;

public Bilhete() {
}
	
	@Id
	@Column(name="`IDBILHETE`")
private Integer IDBILHETE=null;
	@Column(name="`VALOR`")
private BigDecimal VALOR=null;

public Integer getIDBILHETE () {
	return this.IDBILHETE;
}
public void setIDBILHETE (Integer IDBILHETE) {
	this.IDBILHETE = IDBILHETE;
}
public BigDecimal getVALOR () {
	return this.VALOR;
}
public void setVALOR (BigDecimal VALOR) {
	this.VALOR = VALOR;
}



			@OneToMany(mappedBy="rel_IDBILHETE_in_bilhete", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Indicador> indicador_ibfk_2s;




			@OneToMany(mappedBy="rel_IDBILHETE_in_indicador", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Indicador> BR_Bilhete_Indicadors;









public java.util.Set<Indicador> getIndicador_ibfk_2s () {
	return this.indicador_ibfk_2s;
}

public void setIndicador_ibfk_2s (java.util.Set<Indicador> indicador_ibfk_2s) {
	this.indicador_ibfk_2s = indicador_ibfk_2s;
}


 


public java.util.Set<Indicador> getBR_Bilhete_Indicadors () {
	return this.BR_Bilhete_Indicadors;
}

public void setBR_Bilhete_Indicadors (java.util.Set<Indicador> BR_Bilhete_Indicadors) {
	this.BR_Bilhete_Indicadors = BR_Bilhete_Indicadors;
}


 



}