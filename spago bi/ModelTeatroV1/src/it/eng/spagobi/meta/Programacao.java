package it.eng.spagobi.meta;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * This class refers to the programacao table.
 * 
 */
@Entity
@Table(name="`programacao`"
, catalog="`dwteatro`"
)


public class Programacao implements Serializable {

private static final long serialVersionUID = 1L;

public Programacao() {
}
	
	@Id
	@Column(name="`IDPROGRAMACAO`")
private Integer IDPROGRAMACAO=null;
	@Column(name="`DIA`")
private Integer DIA=null;
	@Column(name="`MES`")
private Integer MES=null;
	@Column(name="`ANO`")
private Integer ANO=null;

public Integer getIDPROGRAMACAO () {
	return this.IDPROGRAMACAO;
}
public void setIDPROGRAMACAO (Integer IDPROGRAMACAO) {
	this.IDPROGRAMACAO = IDPROGRAMACAO;
}
public Integer getDIA () {
	return this.DIA;
}
public void setDIA (Integer DIA) {
	this.DIA = DIA;
}
public Integer getMES () {
	return this.MES;
}
public void setMES (Integer MES) {
	this.MES = MES;
}
public Integer getANO () {
	return this.ANO;
}
public void setANO (Integer ANO) {
	this.ANO = ANO;
}



			@OneToMany(mappedBy="rel_IDPROGRAMACAO_in_programacao", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Indicador> indicador_ibfk_1s;




			@OneToMany(mappedBy="rel_IDPROGRAMACAO_in_indicador", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Indicador> BR_Programacao_Indicadors;









public java.util.Set<Indicador> getIndicador_ibfk_1s () {
	return this.indicador_ibfk_1s;
}

public void setIndicador_ibfk_1s (java.util.Set<Indicador> indicador_ibfk_1s) {
	this.indicador_ibfk_1s = indicador_ibfk_1s;
}


 


public java.util.Set<Indicador> getBR_Programacao_Indicadors () {
	return this.BR_Programacao_Indicadors;
}

public void setBR_Programacao_Indicadors (java.util.Set<Indicador> BR_Programacao_Indicadors) {
	this.BR_Programacao_Indicadors = BR_Programacao_Indicadors;
}


 



}