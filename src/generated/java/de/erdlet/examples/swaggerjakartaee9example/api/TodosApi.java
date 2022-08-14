package de.erdlet.examples.swaggerjakartaee9example.api;

import de.erdlet.examples.swaggerjakartaee9example.api.model.*;
import de.erdlet.examples.swaggerjakartaee9example.api.TodosApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import de.erdlet.examples.swaggerjakartaee9example.api.model.ErrorApiModel;
import de.erdlet.examples.swaggerjakartaee9example.api.model.TodoApiModel;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;
import jakarta.ws.rs.*;
import jakarta.validation.constraints.*;

@Path("/todos")


@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-08-14T13:29:04.673325517+02:00[Europe/Berlin]")public class TodosApi  {

   private TodosApiService delegate;

   protected TodosApi() {
   }

   @jakarta.inject.Inject
   public TodosApi(TodosApiService delegate) {
      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all ToDos", description = "Returns all todos", tags={ "todos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request processed successfully", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = TodoApiModel.class)))),
        
        @ApiResponse(responseCode = "200", description = "Any other response, e. g. errors", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorApiModel.class))) })
    public Response index(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.index(securityContext);
    }
}
