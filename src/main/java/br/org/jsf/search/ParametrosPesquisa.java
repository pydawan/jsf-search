package br.org.jsf.search;

import static br.org.verify.Verify.isNotEmptyOrNull;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class ParametrosPesquisa extends ArrayList<ParametroPesquisa> {
   
   private static final long serialVersionUID = 1L;
   
   public void adicionarParametro(ParametroPesquisa parametro) {
      this.add(parametro);
   }
   
   public void adicionarParametros(ParametroPesquisa... parametros) {
      if (isNotEmptyOrNull((Object[]) parametros)) {
         this.addAll(Arrays.asList(parametros));
      }
   }
   
   public void parametro(ParametroPesquisa parametro) {
      this.adicionarParametro(parametro);
   }
   
   public void parametros(ParametroPesquisa... parametros) {
      adicionarParametros(parametros);
   }
   
   @Override
   public String toString() {
      StringBuffer sql = new StringBuffer();
      this.forEach(e -> sql.append(e + " "));
      return sql.toString().trim();
   }
   
}
