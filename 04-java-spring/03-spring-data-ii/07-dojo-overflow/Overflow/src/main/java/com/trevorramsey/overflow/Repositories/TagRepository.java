package com.trevorramsey.overflow.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.trevorramsey.overflow.Models.Tag;

public interface TagRepository extends CrudRepository<Tag,Long> {
	List<Tag> findAll();

	Optional<Tag> findBySubject(String subject);
}
