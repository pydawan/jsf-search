package br.org.jsf.search;

import static br.org.verify.Verify.isNotEmptyOrNull;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author thiago
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class SearchFilters extends HashMap<String, SearchFilter> {
   
   private static final long serialVersionUID = 1L;
   
   public void addFilter(String name, Object... parameters) {
      if (isNotEmptyOrNull(name, parameters)) {
         if (!this.containsKey(name)) {
            this.put(name, new SearchFilter());
         }
         this.get(name).addAll(Arrays.asList(parameters));
      }
   }
   
   public void filter(String name, Object... parameters) {
      addFilter(name, parameters);
   }
   
   @Override
   public String toString() {
      StringBuffer sql = new StringBuffer();
      this.forEach((k, v) -> {
         sql.append(v + "\n");
      });
      return sql.toString().trim();
   }
   
}
