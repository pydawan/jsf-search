package br.org.jsf.search;

import static br.org.verify.Verify.isNotEmptyOrNull;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>Define as opções de campo disponíveis na pesquisa.</p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class SearchFieldOptions extends ArrayList<SearchFieldOption> {
   
   private static final long serialVersionUID = 1L;
   
   public void addOption(SearchFieldOption field) {
      this.add(field);
   }
   
   public void addOptions(SearchFieldOption... fields) {
      if (isNotEmptyOrNull((Object[]) fields)) {
         this.addAll(Arrays.asList(fields));
      }
   }
   
   public static SearchFieldOption searchFieldOption(String label, String field) {
      return new SearchFieldOption(label, field);
   }
   
   public static SearchFieldOption searchField(String label, String campo) {
      return new SearchFieldOption(label, campo);
   }
   
}
