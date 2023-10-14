package br.com.rodrigosalsa.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
   List findByIdUser(UUID idUser);
   TaskModel save(TaskModel taskModel);
}
