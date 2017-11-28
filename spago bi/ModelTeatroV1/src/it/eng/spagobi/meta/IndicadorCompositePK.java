package it.eng.spagobi.meta;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * This is the primary key class for the indicador table.
 * 
 */
@Embeddable
public class IndicadorCompositePK implements Serializable {

	private static final long serialVersionUID = 1L;
		@Column(name="`IDPROGRAMACAO`")
		private Integer IDPROGRAMACAO;
		@Column(name="`IDBILHETE`")
		private Integer IDBILHETE;
		@Column(name="`IDESPETACULO`")
		private Integer IDESPETACULO;

    public IndicadorCompositePK() {
    }

public Integer getIDPROGRAMACAO () {
	return this.IDPROGRAMACAO;
}
public void setIDPROGRAMACAO (Integer IDPROGRAMACAO) {
	this.IDPROGRAMACAO = IDPROGRAMACAO;
}


public Integer getIDBILHETE () {
	return this.IDBILHETE;
}
public void setIDBILHETE (Integer IDBILHETE) {
	this.IDBILHETE = IDBILHETE;
}


public Integer getIDESPETACULO () {
	return this.IDESPETACULO;
}
public void setIDESPETACULO (Integer IDESPETACULO) {
	this.IDESPETACULO = IDESPETACULO;
}


	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IndicadorCompositePK)) {
			return false;
		}
		IndicadorCompositePK castOther = (IndicadorCompositePK)other;
		return 
			( this.IDPROGRAMACAO.equals(castOther.IDPROGRAMACAO) ) 
 && ( this.IDBILHETE.equals(castOther.IDBILHETE) ) 
 && ( this.IDESPETACULO.equals(castOther.IDESPETACULO) );

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		 hash = hash * prime + this.IDPROGRAMACAO.hashCode() ;
 hash = hash * prime + this.IDBILHETE.hashCode() ;
 hash = hash * prime + this.IDESPETACULO.hashCode() ;

		return hash;
    }
}