package com.miniproject_springboot.mini_backend.repository;

import com.miniproject_springboot.mini_backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface TaskRepo extends JpaRepository<Task,Integer> {

  @Query(value = "select t.id as value , t.task_name as label from task t where t.task_name like ?1%" , nativeQuery = true  )
  List<Map<String , Object>> findByTaskName(String taskName);
}
