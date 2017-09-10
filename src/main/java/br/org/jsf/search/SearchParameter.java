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
public class SearchParameter implements Serializable {
   
   private static final long serialVersionUID = 1L;
   
   private Object leftOperand;
   private SearchCriteria criteria;
   private Object rightOperand;
   
   public SearchParameter(Object leftOperand, SearchCriteria criteria, Object rightOperand) {
      this.leftOperand = leftOperand;
      this.criteria = criteria;
      this.rightOperand = rightOperand;
   }
   
   public SearchParameter(SearchCriteria criteria) {
      this.leftOperand = "";
      this.criteria = criteria;
      this.rightOperand = "";
   }
   
   public SearchParameter() {
      
   }
   
   public Object getLeftOperand() {
      return leftOperand;
   }
   
   public void setLeftOperand(Object leftOperand) {
      this.leftOperand = leftOperand;
   }
   
   public Object getRightOperand() {
      return rightOperand;
   }
   
   public void setRightOperand(Object rightOperand) {
      this.rightOperand = rightOperand;
   }
   
   public SearchCriteria getCriteria() {
      return criteria;
   }
   
   public void setCriteria(SearchCriteria criteria) {
      this.criteria = criteria;
   }
   
   public static SearchParameter searchParameter(Object leftOperand, SearchCriteria criteria, Object rightOperand) {
      return new SearchParameter(leftOperand, criteria, rightOperand);
   }
   
   public static SearchParameter searchParameter(SearchCriteria criteria) {
      return new SearchParameter(criteria);
   }
   
   public static SearchParameter searchParam(Object leftOperand, SearchCriteria criteria, Object rightOperand) {
      return searchParameter(leftOperand, criteria, rightOperand);
   }
   
   public static SearchParameter searchParam(SearchCriteria criteria) {
      return new SearchParameter(criteria);
   }
   
   @Override
   public String toString() {
      return String.format(criteria.getValue(), leftOperand, rightOperand);
   }
   
}
