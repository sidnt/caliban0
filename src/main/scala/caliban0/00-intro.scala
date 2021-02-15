package caliban0

object intro {

  /**
    * graphql is a query language for apis
    * a language for clients and servers to talk to each other
    * .
    * since it is just a 'language'
    * it doesn't force us to use a specific technology stack on the back/front end
    * .
    * the application (client or server) can be implemented in any programming language / techstack
    * the application just has to conform to the graphql language, to be able to speak/understand it
    */

  /**
    * caliban is a scala library for creating graphql backends and frontends in scala
    * .
    * what is a graphql backend?
    * a running server simply, which can understand the graphql query language
    * it can be sent graphql requests and it will reply with graphql responses
    * .
    * what is a graphql frontend?
    * a running client, simply, which can talk to a graphql server
    * using the graphql query language, and consume its services, viz, ask for data etc.
    */

  /** 
    * one big idea here, is delegate the graph traversal, data traversal, filtering, computations
    * to the backend, by allowing the clients to say exactly what they want to be returned
    * as the fields from the tree of those that are exposed
    * .
    * in REST, there's a lot of wasted cycles on both client and server
    * when client hits an api endpoint, and is interested in only a part of the data 
    * from that particular endpoint, the server gathers all the fields, serialised to probly json
    * sends it over, the client deserialises it and discards a lot of data it doesn't need.
    */

  /**
    * the server exposes a typed schema, which is actually a graph
    * a schema lists operations that are available
    * .
    * queries / to ask for data
    * mutations / for modifying data
    * subscriptions / for getting notified of data
    * .
    */

  /**
    * one thing quite nice about graphql
    * because it exposes a typed schema
    * so we know all the types in advance
    * so we get some documentation for free
    * tools are able to introspect the api
    * and provide autocompletions/documentations
    */
    
}