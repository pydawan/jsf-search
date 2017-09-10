package br.org.jsf.search;

/**
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public enum SearchCriteria {
   NONE("com qual critério?", ""),
   EQUALS("igual a", "%s__exact='%s'", "igual a"),
   NOT_EQUALS("diferente de", "%s__!exact='%s'", "diferente de"),
   GREATER_THAN("maior que", "%s__gt='%s'", "maior que"),
   LESS_THAN("menor que", "%s__lt='%s'", "menor que"),
   GREATER_THAN_OR_EQUALS_TO("maior que ou igual a", "%s__gte='%s'", "maior que ou igual a"),
   LESS_THAN_OR_EQUALS_TO("menor que ou igual a", "%s__lte='%s'", "menor que ou igual a"),
   CONTAINS("contém", "%s__contains='%s'", "contendo"),
   NOT_CONTAINS("não contém", "%s__!contains='%s'", "não contendo"),
   STARTS_WITH("começa com", "%s__startswith='%s'", "começando com"),
   NOT_STARTS_WITH("não começa com", "%s__!startswith='%s'", "não começando com"),
   ENDS_WITH("termina com", "%s__endswith='%s'", "terminando com"),
   NOT_ENDS_WITH("não termina com", "%s__!endswith='%s'", "não terminando com"),
   IN_RANGE("no intervalo", "%s__range=['%s', '%s']", "no intervalo"),
   OUT_OF_RANGE("fora do intervalo", "%s__!range=['%s', '%s']", "fora do intervalo"),
   IN("está contido", "%s__in=[%s]", "está contido"),
   NOT_IN("não está contido", "%s__!in=[%s]", "não está contido"),
   AND("e", "AND", "e"),
   OR("ou", "OR", "ou");
 
   private final String label;
   private final String value;
   private final String description;
   
   private SearchCriteria(final String label, final String value, final String description) {
      this.label = label;
      this.value = value;
      this.description = description;
   }
   
   private SearchCriteria(final String label, final String value) {
      this.label = label;
      this.value = value;
      this.description = "";
   }
   
   public String getLabel() {
      return label;
   }
 
   public String getValue() {
      return value;
   }
   
   public String getDescription() {
      return description;
   }
}
