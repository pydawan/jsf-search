package br.org.jsf.search;

import java.io.Serializable;

/**
 * <p>
 * Define um parâmetro de pesquisa.
 * Na verdade o parâmetro é um elemento que compõe um filtro da pesquisa.
 * Um filtro de pesquisa pode conter nenhum ou vários parâmetros de pesquisa.
 * </p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class ParametroPesquisa implements Serializable {
   
   private static final long serialVersionUID = 1L;
   
   private Object operandoEsquerda;
   private CriterioPesquisa criterio;
   private Object operandoDireita;
   
   public ParametroPesquisa(Object operandoEsquerda, CriterioPesquisa criterio, Object operandoDireita) {
      this.operandoEsquerda = operandoEsquerda;
      this.criterio = criterio;
      this.operandoDireita = operandoDireita;
   }
   
   public ParametroPesquisa(CriterioPesquisa criterio) {
      this.operandoEsquerda = "";
      this.criterio = criterio;
      this.operandoDireita = "";
   }
   
   public ParametroPesquisa() {
      
   }
   
   public Object getOperandoDaEsquerda() {
      return operandoEsquerda;
   }
   
   public void setOperandoDaEsquerda(Object operandoEsquerda) {
      this.operandoEsquerda = operandoEsquerda;
   }
   
   public Object getOperandoDaDireita() {
      return operandoDireita;
   }
   
   public void setOperandoDaDireita(Object operandoDireita) {
      this.operandoDireita = operandoDireita;
   }
   
   public CriterioPesquisa getCriterio() {
      return criterio;
   }
   
   public void setCriterio(CriterioPesquisa criterio) {
      this.criterio = criterio;
   }
   
   public static ParametroPesquisa parametroPesquisa(Object operandoEsquerda, CriterioPesquisa criterio, Object operandoDireita) {
      return new ParametroPesquisa(operandoEsquerda, criterio, operandoDireita);
   }
   
   public static ParametroPesquisa parametroPesquisa(CriterioPesquisa criterio) {
      return new ParametroPesquisa(criterio);
   }
   
   public static ParametroPesquisa paramPesquisa(Object operandoEsquerda, CriterioPesquisa criterio, Object operandoDireita) {
      return parametroPesquisa(operandoEsquerda, criterio, operandoDireita);
   }
   
   public static ParametroPesquisa paramPesquisa(CriterioPesquisa criterio) {
      return new ParametroPesquisa(criterio);
   }
   
   @Override
   public String toString() {
      return String.format(criterio.getValor(), operandoEsquerda, operandoDireita);
   }
   
}
