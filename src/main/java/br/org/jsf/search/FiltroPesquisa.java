package br.org.jsf.search;

import static br.org.verify.Verify.isNotEmptyOrNull;

import java.util.ArrayList;

/**
 * <p>Define o filtro de pesquisa.</p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class FiltroPesquisa extends ArrayList<Object> {
   
   private static final long serialVersionUID = 1L;
   
   public void adicionarParametro(Object parametro) {
      if (isNotEmptyOrNull(parametro)) {
         if (this.indexOf(parametro) == -1) {
            this.add(parametro);
         }
      }
   }
   
   public void adicionarParam(Object parametro) {
      adicionarParametro(parametro);
   }
   
   public void adicionarParametros(Object... parametros) {
      if (isNotEmptyOrNull(parametros)) {
         for (Object parametro : parametros) {
            adicionarParametro(parametro);
         }
      }
   }
   
   public void adicionarParams(Object... parametros) {
      adicionarParametros(parametros);
   }
   
   public void parametros(Object... parametros) {
      adicionarParametros(parametros);
   }
   
   public void params(Object... params) {
      adicionarParametros(params);
   }
   
   @Override
   public String toString() {
      StringBuffer sql = new StringBuffer();
      this.forEach(e -> sql.append(e + " "));
      return sql.toString().trim();
   }
   
}
