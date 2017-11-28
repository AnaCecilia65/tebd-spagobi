package it.eng.spagobi.meta;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * This class refers to the indicador table.
 * 
 */
@Entity
@Table(name="`indicador`"
, catalog="`dwteatro`"
)


public class Indicador implements Serializable {

private static final long serialVersionUID = 1L;

public Indicador() {
}
	
@EmbeddedId
private IndicadorCompositePK compId=null;
	@Column(name="`VENDASBILHETES`")
private Integer VENDASBILHETES=null;
	@Column(name="`FATURAMENTOBILHETES`")
private BigDecimal FATURAMENTOBILHETES=null;

public IndicadorCompositePK getCompId () {
	return this.compId;
}

public void setCompId (IndicadorCompositePK compId) {
	this.compId = compId;
}

public Integer getVENDASBILHETES () {
	return this.VENDASBILHETES;
}
public void setVENDASBILHETES (Integer VENDASBILHETES) {
	this.VENDASBILHETES = VENDASBILHETES;
}
public BigDecimal getFATURAMENTOBILHETES () {
	return this.FATURAMENTOBILHETES;
}
public void setFATURAMENTOBILHETES (BigDecimal FATURAMENTOBILHETES) {
	this.FATURAMENTOBILHETES = FATURAMENTOBILHETES;
}



	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`IDPROGRAMACAO`", insertable = false, updatable = false)
	private Programacao rel_IDPROGRAMACAO_in_programacao;




	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`IDBILHETE`", insertable = false, updatable = false)
	private Bilhete rel_IDBILHETE_in_bilhete;




	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`IDESPETACULO`", insertable = false, updatable = false)
	private Espetaculo rel_IDESPETACULO_in_espetaculo;




	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`IDBILHETE`", insertable = false, updatable = false)
	private Bilhete rel_IDBILHETE_in_indicador;




	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`IDESPETACULO`", insertable = false, updatable = false)
	private Espetaculo rel_IDESPETACULO_in_indicador;




	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`IDPROGRAMACAO`", insertable = false, updatable = false)
	private Programacao rel_IDPROGRAMACAO_in_indicador;









public Programacao getRel_IDPROGRAMACAO_in_programacao () {
	return this.rel_IDPROGRAMACAO_in_programacao;
}

public void setRel_IDPROGRAMACAO_in_programacao (Programacao rel_IDPROGRAMACAO_in_programacao) {
	this.rel_IDPROGRAMACAO_in_programacao = rel_IDPROGRAMACAO_in_programacao;
}


 


public Bilhete getRel_IDBILHETE_in_bilhete () {
	return this.rel_IDBILHETE_in_bilhete;
}

public void setRel_IDBILHETE_in_bilhete (Bilhete rel_IDBILHETE_in_bilhete) {
	this.rel_IDBILHETE_in_bilhete = rel_IDBILHETE_in_bilhete;
}


 


public Espetaculo getRel_IDESPETACULO_in_espetaculo () {
	return this.rel_IDESPETACULO_in_espetaculo;
}

public void setRel_IDESPETACULO_in_espetaculo (Espetaculo rel_IDESPETACULO_in_espetaculo) {
	this.rel_IDESPETACULO_in_espetaculo = rel_IDESPETACULO_in_espetaculo;
}


 


public Bilhete getRel_IDBILHETE_in_indicador () {
	return this.rel_IDBILHETE_in_indicador;
}

public void setRel_IDBILHETE_in_indicador (Bilhete rel_IDBILHETE_in_indicador) {
	this.rel_IDBILHETE_in_indicador = rel_IDBILHETE_in_indicador;
}


 


public Espetaculo getRel_IDESPETACULO_in_indicador () {
	return this.rel_IDESPETACULO_in_indicador;
}

public void setRel_IDESPETACULO_in_indicador (Espetaculo rel_IDESPETACULO_in_indicador) {
	this.rel_IDESPETACULO_in_indicador = rel_IDESPETACULO_in_indicador;
}


 


public Programacao getRel_IDPROGRAMACAO_in_indicador () {
	return this.rel_IDPROGRAMACAO_in_indicador;
}

public void setRel_IDPROGRAMACAO_in_indicador (Programacao rel_IDPROGRAMACAO_in_indicador) {
	this.rel_IDPROGRAMACAO_in_indicador = rel_IDPROGRAMACAO_in_indicador;
}


 



}