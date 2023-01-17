package todoapp.data;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import todoapp.core.todos.domain.Todo;
import todoapp.core.todos.domain.TodoRepository;

@Component	// 스프링 컨테이너로 동작하기를 위함
@ConditionalOnProperty(name = "todos.data.initialize", havingValue = "true")
public class TodoDataInitializer implements InitializingBean, ApplicationRunner, CommandLineRunner { // 빈을 초기화 할때 사용

	private final TodoRepository todoRepository;
	
	public TodoDataInitializer(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		todoRepository.save(Todo.create("Task One"));
	}//afterPropertiesSet

	@Override
	public void run(ApplicationArguments args) throws Exception {
		todoRepository.save(Todo.create("Task Two"));
	}//run

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(Todo.create("Task Three"));
	}//run

}//TodoDataInitializer
