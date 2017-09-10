package br.org.jsf.search;

import static br.org.verify.Verify.isNotEmptyOrNull;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class SearchParameters extends ArrayList<SearchParameter> {
   
   private static final long serialVersionUID = 1L;
   
   public void addParameter(SearchParameter parameter) {
      this.add(parameter);
   }
   
   public void addParameters(SearchParameter... parameters) {
      if (isNotEmptyOrNull((Object[]) parameters)) {
         this.addAll(Arrays.asList(parameters));
      }
   }
   
   public void parameter(SearchParameter parameter) {
      this.addParameter(parameter);
   }
   
   public void parameters(SearchParameter... parameters) {
      addParameters(parameters);
   }
   
   @Override
   public String toString() {
      StringBuffer sql = new StringBuffer();
      this.forEach(e -> sql.append(e + " "));
      return sql.toString().trim();
   }
   
}
