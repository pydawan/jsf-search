package br.org.jsf.search;

import static br.org.verify.Verify.isNotEmptyOrNull;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>
 * Define as opções de criterios de pesquisa a serem 
 * apresentadas em tela para o usuário.
 * </p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class SearchCriteriaOptions extends ArrayList<SearchCriteriaOption> {
   
   private static final long serialVersionUID = 1L;
   
   public void addOption(SearchCriteriaOption filtro) {
      this.add(filtro);
   }
   
   public void addOptions(SearchCriteriaOption... filters) {
      if (isNotEmptyOrNull((Object[]) filters)) {
         this.addAll(Arrays.asList(filters));
      }
   }
   
   public static SearchCriteriaOption searchCriteriaOption(String label, SearchCriteria value) {
      return new SearchCriteriaOption(label, value);
   }
   
   public static SearchCriteriaOption searchCriteria(String label, SearchCriteria value) {
      return searchCriteriaOption(label, value);
   }
   
   public static SearchCriteriaOption searchCriteriaOption(SearchCriteria criteria) {
      return new SearchCriteriaOption(criteria);
   }
   
   public static SearchCriteriaOption searchCriteriaOption(String label) {
      return new SearchCriteriaOption(label);
   }
   
   public static SearchCriteriaOption searchCriteria(SearchCriteria criteria) {
      return new SearchCriteriaOption(criteria);
   }
   
   public static SearchCriteriaOption searchCriteria(String label) {
      return new SearchCriteriaOption(label);
   }
   
}
