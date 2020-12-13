package com.trevorramsey.overflow.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trevorramsey.overflow.Models.Question;

public interface QuestionRepository extends CrudRepository<Question,Long> {
	List<Question> findAll();
}
