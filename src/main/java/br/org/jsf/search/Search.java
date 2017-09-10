package br.org.jsf.search;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Define funcionalidades relativas a pesquisa.
 * </p>
 * 
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public abstract class Search<T> implements Serializable {
   
   private static final long serialVersionUID = 1L;
   private SearchParameters parameters;
   private SearchFieldOptions searchFieldOptions;
   private SearchCriteriaOptions searchCriteriaOptions;
   private Class<?> clazz;
   public static final List<?> emptyList = new ArrayList<>(0);
   
   public Search() {
      parameters = new SearchParameters();
      searchFieldOptions = new SearchFieldOptions();
      searchCriteriaOptions = new SearchCriteriaOptions();
      Type gsc = getClass().getGenericSuperclass();
      ParameterizedType param = (ParameterizedType) gsc;
      Type arg = param.getActualTypeArguments()[0];
      clazz = (Class<?>) arg;
   }
   
   public SearchParameters getParameters() {
      return parameters;
   }
   
   public SearchParameters parameters() {
      return parameters;
   }
   
   public SearchFieldOptions getSearchFieldOptions() {
      return searchFieldOptions;
   }
   
   public SearchFieldOptions searchFieldOptions() {
      return searchFieldOptions;
   }
   
   public SearchFieldOptions fieldOptions() {
      return searchFieldOptions;
   }
   
   public SearchCriteriaOptions getSearchCriteriaOptions() {
      return searchCriteriaOptions;
   }
   
   public SearchCriteriaOptions searchCriteriaOptions() {
      return searchCriteriaOptions;
   }
   
   public SearchCriteriaOptions criteriaOptions() {
      return searchCriteriaOptions;
   }
   
   public Class<?> getClazz() {
      return clazz;
   }
   
   public void setClazz(Class<?> clazz) {
      this.clazz = clazz;
   }
   
   public String selectSearchField() {
      return "-------------------- SELECIONE O CAMPO --------------------";
   }
   
   public String selectSearchCriteria() {
      return "-------------------- SELECIONE O CRITÉRIO -----------------";
   }
   
   public abstract List<?> search();
   
}
