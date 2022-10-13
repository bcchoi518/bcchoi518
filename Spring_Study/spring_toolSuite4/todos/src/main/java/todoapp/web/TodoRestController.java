package todoapp.web;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import todoapp.core.todos.application.TodoEditor;
import todoapp.core.todos.application.TodoFinder;
import todoapp.core.todos.domain.Todo;

@RestController
@RequestMapping("/api/todos")
@RolesAllowed("ROLE_USER")
public class TodoRestController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	private final TodoFinder finder;
	private final TodoEditor editor;
	
	public TodoRestController(TodoFinder finder, TodoEditor editor) {
		this.finder = finder;
		this.editor = editor;
	}
	
	@GetMapping
	public List<Todo> list() {
		return finder.getAll();
	}//list
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)	// 핸들러가 정상적으로 수행되면 201 status로 응답 
	public void create(@RequestBody @Valid WriteTodoCommand command) {
		logger.debug("request payload: {}", command);
		
		editor.create(command.getTitle());
	}//create
	
	@PutMapping("/{id}")
	public void update(@PathVariable("id") Long id, @RequestBody @Valid WriteTodoCommand command) {
		logger.debug("request update id: {}, command: {}", id, command);
		
		editor.update(id, command.getTitle(), command.isCompleted());
	}//update
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		logger.debug("delete todo, id: {}", id);
		
		editor.delete(id);
	}//delete
	
	static class WriteTodoCommand {
		
		@NotBlank
		@Size(min = 4, max = 140)
		private String title;
		private boolean completed;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public boolean isCompleted() {
			return completed;
		}

		public void setCompleted(boolean completed) {
			this.completed = completed;
		}

		@Override
		public String toString() {
			return "[title="+ title +", completed="+ completed +"]";
		}//toString
	}//CreateTodoCommand
}//TodoRestController
