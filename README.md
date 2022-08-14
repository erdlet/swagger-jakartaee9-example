# Example for using Swagger with Jakarta EE 9

This repository shows my workaround for using Swagger Codegen 3.X with the `jakarta.*` namespace. It isn't beautiful
but functional. Please have a look into the [pom.xml's](./pom.xml) build section to see how the plugins are configured
to replace `javax` with `jakarta`.

To run the example, you can use `mvn package org.codehaus.cargo:cargo-maven3-plugin:run ` to use Maven Cargo Plugin
to download a GlassFish 6 server and deploy the application automatically. It'll be available under
`localhost:8080/swagger-jakartaee9-example/api/todos`. Otherwise you can just package the application and deploy
to another server if this is meets your requirements.

After the server started successfully, you can run a HTTP request like `GET http://localhost:8080/swagger-jakartaee9-example/api/todos`
to get entities via the generated and implemented Swagger API.