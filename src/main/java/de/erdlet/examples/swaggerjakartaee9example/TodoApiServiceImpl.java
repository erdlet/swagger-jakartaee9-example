package de.erdlet.examples.swaggerjakartaee9example;

import de.erdlet.examples.swaggerjakartaee9example.api.TodosApiService;
import de.erdlet.examples.swaggerjakartaee9example.api.model.TodoApiModel;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;

import java.util.stream.Collectors;

@RequestScoped
public class TodoApiServiceImpl implements TodosApiService {

	@Inject
	TodoDao dao;

	@Override
	public Response index(final SecurityContext securityContext) {
		final var todos = dao.getAll();
		final var entities = todos.stream().map(TodoMapper::toApiModel).collect(Collectors.toList());
		return Response.ok().entity(entities).build();
	}

	private static class TodoMapper {
		public static TodoApiModel toApiModel(final Todo todo) {
			return new TodoApiModel().id(todo.getId()).title(todo.getTitle()).description(todo.getDescription());
		}

		public static Todo fromApiModel(final TodoApiModel apiModel) {
			return new Todo(apiModel.getId(), apiModel.getTitle(), apiModel.getDescription());
		}
	}
}
