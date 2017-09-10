package br.org.jsf.search;

import java.io.Serializable;

import javax.faces.model.SelectItem;

/**
 * <p>
 * Define uma opção de campo de pesquisa a ser 
 * apresentada em tela para o usuário.
 * </p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class SearchFieldOption implements Serializable {
   
   private static final long serialVersionUID = 1L;
   private String label;
   private String field;
   
   public SearchFieldOption() {
      
   }
   
   public SearchFieldOption(String label, String field) {
      this.label = label;
      this.field = field;
   }
   
   public String getLabel() {
      return label;
   }
   
   public void setLabel(String label) {
      this.label = label;
   }
   
   public String getField() {
      return field;
   }
   
   public void setField(String field) {
      this.field = field;
   }
   
   public String label() {
      return label;
   }
   
   public SearchFieldOption label(String label) {
      this.label = label;
      return this;
   }
   
   public String field() {
      return field;
   }
   
   public SearchFieldOption field(String field) {
      this.field = field;
      return this;
   }
   
   @Override
   public String toString() {
      return String.format("%s/%s", label, field);
   }
   
   public SelectItem toSelectItem() {
      SelectItem selectItem = new SelectItem();
      selectItem.setLabel(this.label);
      selectItem.setValue(this.field);
      return selectItem;
   }
   
}
