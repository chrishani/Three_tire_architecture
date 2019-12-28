package com.im.mycrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.mycrm.enitities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
