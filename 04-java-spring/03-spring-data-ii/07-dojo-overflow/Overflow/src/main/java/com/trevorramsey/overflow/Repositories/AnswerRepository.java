package com.trevorramsey.overflow.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trevorramsey.overflow.Models.Answer;

public interface AnswerRepository extends CrudRepository<Answer,Long> {
	List<Answer> findAll();
}
