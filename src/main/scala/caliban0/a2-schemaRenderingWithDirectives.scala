package caliban0

import scala.collection.mutable

import caliban.schema.Annotations._
import caliban.parsing.adt.Directive
import caliban.InputValue.ListValue
import caliban.Value._
import java.util.UUID

object schemaRenderingsWithDirectives extends App {

  case class ProductId(productId: UUID)
  case class Product(
    productId: ProductId,
    
    @GQLDirective(Directive("search", Map("by" -> ListValue(List(StringValue("term"))))))
    productName: String
  )

  case class Queries(
    product: ProductId => Option[Product]
  )

  val inMemDb: mutable.Map[ProductId, Product] = mutable.Map.empty
  val getProduct: ProductId => Option[Product] = productId => inMemDb.get(productId)


  val queries = Queries(
    getProduct
  )

  import caliban.GraphQL.graphQL
  import caliban.RootResolver
  val api = graphQL(RootResolver(queries))

  println(api.render)

/*

schema {
  query: Queries
}

type Product {
  productId: ProductId!
  productName: String! @search(by: ["term"])
}

type ProductId {
  productId: ID!
}

type Queries {
  product(productId: ID!): Product
}

*/
  
}
