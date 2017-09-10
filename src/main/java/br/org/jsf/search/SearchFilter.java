package br.org.jsf.search;

import static br.org.verify.Verify.isNotEmptyOrNull;

import java.util.ArrayList;

/**
 * <p>Define o filtro de pesquisa.</p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class SearchFilter extends ArrayList<Object> {
   
   private static final long serialVersionUID = 1L;
   
   public void addParameter(Object parameter) {
      if (isNotEmptyOrNull(parameter)) {
         if (this.indexOf(parameter) == -1) {
            this.add(parameter);
         }
      }
   }
   
   public void addParam(Object param) {
      addParameter(param);
   }
   
   public void addParameters(Object... parameters) {
      if (isNotEmptyOrNull(parameters)) {
         for (Object parametro : parameters) {
            addParameter(parametro);
         }
      }
   }
   
   public void addParams(Object... params) {
      addParameters(params);
   }
   
   public void parameters(Object... parameters) {
      addParameters(parameters);
   }
   
   public void params(Object... params) {
      parameters(params);
   }
   
   @Override
   public String toString() {
      StringBuffer sql = new StringBuffer();
      this.forEach(e -> sql.append(e + " "));
      return sql.toString().trim();
   }
   
}
