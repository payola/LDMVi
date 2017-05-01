package model.rdf.sparql.rgml.query

import model.rdf.sparql.query.{SparqlCountQuery}

class ThingsWithIntervalQuery(maybeThingsUrls: Option[Seq[String]], maybeConnectionUrls: Option[Seq[String]], maybeLimit: Option[Int])  extends SparqlCountQuery {
  def get: String = {
    val select = "SELECT ?thing ?connection ?interval"
    val group  = "GROUP BY ?thing ?connection ?interval"
    val limit = QueryHelpers.limit(maybeLimit)
    return query(select,group,limit)
  }

  def getCount: String = {
    val select = "COUNT(?thing) AS ?count"
    val group = ""
    val limit = ""
    return query(select,group,limit)
  }

  private def query(select: String, group: String, limit: String) : String =
    s"""
       |PREFIX time: <http://www.w3.org/2006/time#>
       |
       |${select}
       |WHERE {
       |  ?thing ?connection ?interval.
       |
       |  ?interval time:hasBeginning ?beginning .
       |  ?interval time:hasEnd ?end .
       |
       |  ${QueryHelpers.limitValues("thing", maybeThingsUrls)}
       |  ${QueryHelpers.limitValues("connection", maybeConnectionUrls)}
       |}
       |
       |${group}
       |${limit}
    """
      .stripMargin
}
