package br.org.jsf.search;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Define funcionalidades relativas a pesquisa.</p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public abstract class Pesquisa<T> implements Serializable {
   
   private static final long serialVersionUID = 1L;
   private ParametrosPesquisa parametros;
   private OpcoesCampoPesquisa opcoesCampoPesquisa;
   private OpcoesCriterioPesquisa opcoesCriterioPesquisa;
   private Class<?> classe;
   public static final List<?> listaVazia = new ArrayList<>(0);
   
   public Pesquisa() {
      parametros = new ParametrosPesquisa();
      opcoesCampoPesquisa = new OpcoesCampoPesquisa();
      opcoesCriterioPesquisa = new OpcoesCriterioPesquisa();
      Type gsc = getClass().getGenericSuperclass();
      ParameterizedType param = (ParameterizedType) gsc;
      Type arg = param.getActualTypeArguments()[0];
      classe = (Class<?>) arg;
   }
   
   public ParametrosPesquisa getParametros() {
      return parametros;
   }
   
   public ParametrosPesquisa parametros() {
      return parametros;
   }
   
   public OpcoesCampoPesquisa getOpcoesCampoPesquisa() {
      return opcoesCampoPesquisa;
   }
   
   public OpcoesCampoPesquisa opcoesCampoPesquisa() {
      return opcoesCampoPesquisa;
   }
   
   public OpcoesCampoPesquisa opcoesCampo() {
      return opcoesCampoPesquisa;
   }
   
   public OpcoesCriterioPesquisa getOpcoesCriterioPesquisa() {
      return opcoesCriterioPesquisa;
   }
   
   public OpcoesCriterioPesquisa opcoesCriterioPesquisa() {
      return opcoesCriterioPesquisa;
   }
   
   public OpcoesCriterioPesquisa opcoesCriterio() {
      return opcoesCriterioPesquisa;
   }
   
   public Class<?> getClasse() {
      return classe;
   }
   
   public void setClasse(Class<?> classe) {
      this.classe = classe;
   }
   
   public String selecioneOCampo() {
      return "-------------------- SELECIONE O CAMPO --------------------";
   }
   
   public String selecioneOCriterio() {
      return "-------------------- SELECIONE O CRITÉRIO -----------------";
   }
   
   public abstract List<?> pesquisar();
   
}
