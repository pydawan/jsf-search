package br.org.jsf.search;

import java.io.Serializable;

import javax.faces.model.SelectItem;

/**
 * <p>
 * Define uma opção de critério de pesquisa a ser 
 * apresentada em tela para o usuário.
 * </p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class SearchCriteriaOption implements Serializable {
   
   private static final long serialVersionUID = 1L;
   private String label;
   private SearchCriteria criteria;
   
   public SearchCriteriaOption() {
      
   }
   
   public SearchCriteriaOption(String label) {
      this.label = label;
      this.criteria = null;
   }
   
   public SearchCriteriaOption(String label, SearchCriteria criteria) {
      this.label = label;
      this.criteria = criteria;
   }
   
   public SearchCriteriaOption(SearchCriteria criteria) {
      this.criteria = criteria;
      if (criteria != null) {
         this.label = criteria.getLabel();
      }
   }
   
   public String getLabel() {
      return label;
   }
   
   public void setLabel(String label) {
      this.label = label;
   }
   
   public SearchCriteria getCriteria() {
      return criteria;
   }
   
   public String label() {
      return label;
   }
   
   public SearchCriteriaOption label(String label) {
      this.label = label;
      return this;
   }
   
   public SearchCriteria criteria() {
      return criteria;
   }
   
   public SearchCriteriaOption criteria(SearchCriteria criteria) {
      this.criteria = criteria;
      return this;
   }
   
   @Override
   public String toString() {
      return String.format("SearchCriteriaOption(label = %s, criteria = %s)", label, criteria);
   }
   
   public SelectItem toSelectItem() {
      SelectItem selectItem = new SelectItem();
      selectItem.setLabel(this.label);
      selectItem.setValue(this.criteria.getValue());
      return selectItem;
   }
   
}
