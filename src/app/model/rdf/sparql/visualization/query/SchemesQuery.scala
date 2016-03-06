package model.rdf.sparql.visualization.query

import model.rdf.sparql.query.SparqlQuery

class SchemesQuery extends SparqlQuery {

  def get: String =
    """
      | PREFIX skos: <http://www.w3.org/2004/02/skos/core#>
      | PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
      |
      | CONSTRUCT {
      |   ?s a skos:ConceptScheme ;
      |      skos:prefLabel ?prefLabel ;
      |      rdfs:label ?l .
      | }
      | WHERE {
      |   ?ca a skos:Concept;
      |        skos:inScheme ?s .
      |
      |   ?s a skos:ConceptScheme .
      |
      |   OPTIONAL {
      |     ?s skos:prefLabel ?prefLabel .
      |   }
      |
      |   OPTIONAL {
      |     ?s rdfs:label ?l .
      |   }
      | }
    """.stripMargin
}
