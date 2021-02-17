package caliban0

import scala.collection.mutable

object schemaRenderings extends App {

  type ProductId = Int
  
  case class Product(
    productId: ProductId,
    name: String
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
  productId: Int!
  name: String!
}

type Queries {
  product(value: Int!): Product
}

    */
  
}
