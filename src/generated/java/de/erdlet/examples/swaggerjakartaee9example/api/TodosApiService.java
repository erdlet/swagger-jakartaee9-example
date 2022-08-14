package de.erdlet.examples.swaggerjakartaee9example.api;

import de.erdlet.examples.swaggerjakartaee9example.api.*;
import de.erdlet.examples.swaggerjakartaee9example.api.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import de.erdlet.examples.swaggerjakartaee9example.api.model.ErrorApiModel;
import de.erdlet.examples.swaggerjakartaee9example.api.model.TodoApiModel;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;
import jakarta.validation.constraints.*;
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-08-14T13:29:04.673325517+02:00[Europe/Berlin]")public interface TodosApiService {
    public Response index(SecurityContext securityContext);
}
