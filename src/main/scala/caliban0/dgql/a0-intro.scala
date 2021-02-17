// package caliban0.dgql

/**
  * For GraphQL in Dgraph, 
  * you just concentrate on defining the schema of your graph and 
  * how you’d like to search that graph; 
  * Dgraph does the rest. 
  * You work only with GraphQL and, 
  * think in terms of the graph that matters for your app.
  */

/**
  * With Dgraph, you can turn a GQL schema into a running GraphQL API
  * .
  * Dgraph will serve your GraphQL API at /graphql and an admin interface at /admin.
  * Bring up Dgraph. With that, GraphQL has started at localhost:8080/graphql, but it doesn’t have a schema to serve yet.
  * The /admin interface lets you add and update the GraphQL schema served at /graphql.
  * .
  * The schema.graphql file is the IDL between caliban and dgraph
  * so we will need the api.render function from caliban
  * to generate a schema from our scala ADTs and hand it over to dgraph
  */

/**
  * what if, we could model our entire graphql api
  * via scala ADTs, generate a schema.graphql file out of it, via caliban's api.render
  * feed it to dgraph, so that dgraph now can serve the same api from dgraph itself,
  * as opposed to us creating a server for serving that api
  */
