package de.erdlet.examples.swaggerjakartaee9example;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Primitive DAO containing an in-memory map as storage.
 */
@ApplicationScoped
public class TodoDao {

	private static final Map<Integer, Todo> TODOS = new HashMap<>();

	@PostConstruct
	void initDummyValues() {
		TODOS.put(1, new Todo(1L, "Buy milk", "We need 3 bottles of milk!"));
		TODOS.put(2, new Todo(2L, "Clean appartment", "Nothing more to say..."));
	}

	public List<Todo> getAll() {
		return List.copyOf(TODOS.values());
	}
}
