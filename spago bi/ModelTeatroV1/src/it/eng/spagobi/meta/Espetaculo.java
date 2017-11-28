package it.eng.spagobi.meta;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * This class refers to the espetaculo table.
 * 
 */
@Entity
@Table(name="`espetaculo`"
, catalog="`dwteatro`"
)


public class Espetaculo implements Serializable {

private static final long serialVersionUID = 1L;

public Espetaculo() {
}
	
	@Id
	@Column(name="`IDESPETACULO`")
private Integer IDESPETACULO=null;
	@Column(name="`NOME`")
private String NOME=null;

public Integer getIDESPETACULO () {
	return this.IDESPETACULO;
}
public void setIDESPETACULO (Integer IDESPETACULO) {
	this.IDESPETACULO = IDESPETACULO;
}
public String getNOME () {
	return this.NOME;
}
public void setNOME (String NOME) {
	this.NOME = NOME;
}



			@OneToMany(mappedBy="rel_IDESPETACULO_in_espetaculo", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Indicador> indicador_ibfk_3s;




			@OneToMany(mappedBy="rel_IDESPETACULO_in_indicador", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Indicador> BR_Espetaculo_Indicadors;









public java.util.Set<Indicador> getIndicador_ibfk_3s () {
	return this.indicador_ibfk_3s;
}

public void setIndicador_ibfk_3s (java.util.Set<Indicador> indicador_ibfk_3s) {
	this.indicador_ibfk_3s = indicador_ibfk_3s;
}


 


public java.util.Set<Indicador> getBR_Espetaculo_Indicadors () {
	return this.BR_Espetaculo_Indicadors;
}

public void setBR_Espetaculo_Indicadors (java.util.Set<Indicador> BR_Espetaculo_Indicadors) {
	this.BR_Espetaculo_Indicadors = BR_Espetaculo_Indicadors;
}


 



}