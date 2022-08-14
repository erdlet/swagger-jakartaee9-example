package de.erdlet.examples.swaggerjakartaee9example;

import java.util.Objects;

/**
 * Domain model of the example application.
 */
public class Todo {

	private final Long id;
	private final String title;
	private final String description;

	public Todo(final Long id, final String title, final String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		final Todo todo = (Todo) o;
		return Objects.equals(id, todo.id) && Objects.equals(title, todo.title) && Objects.equals(description, todo.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, description);
	}

	@Override
	public String toString() {
		return "Todo{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
