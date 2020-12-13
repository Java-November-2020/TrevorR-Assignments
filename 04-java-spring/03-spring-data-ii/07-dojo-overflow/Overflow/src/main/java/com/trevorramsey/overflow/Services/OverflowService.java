package com.trevorramsey.overflow.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trevorramsey.overflow.Models.Answer;
import com.trevorramsey.overflow.Models.Association;
import com.trevorramsey.overflow.Models.NewQuestion;
import com.trevorramsey.overflow.Models.Question;
import com.trevorramsey.overflow.Models.Tag;
import com.trevorramsey.overflow.Repositories.AnswerRepository;
import com.trevorramsey.overflow.Repositories.AssociationRepository;
import com.trevorramsey.overflow.Repositories.QuestionRepository;
import com.trevorramsey.overflow.Repositories.TagRepository;

@Service
public class OverflowService {
	private QuestionRepository qRepo;
	private AnswerRepository aRepo;
	private AssociationRepository asRepo;
	private TagRepository tRepo;
	public OverflowService(QuestionRepository qRepo, AnswerRepository aRepo, AssociationRepository asRepo,
			TagRepository tRepo) {
		this.qRepo = qRepo;
		this.aRepo = aRepo;
		this.asRepo = asRepo;
		this.tRepo = tRepo;
	}
	public List<Question> findQuestions(){
		return this.qRepo.findAll();
	}
	public List<Answer> findAnswers(){
		return this.aRepo.findAll();
	}
	public List<Tag> findTag(){
		return this.tRepo.findAll();
	}
	public Question createQuestion(Question question) {
		return this.qRepo.save(question);
	}
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
	public Association createAssociation(Association association) {
		return this.asRepo.save(association);
	}
	public Tag createTag(Tag tag) {
		return this.tRepo.save(tag);
	}
	public Question findQuestion (Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	public void createNewQuestion(NewQuestion question) {
		List<Tag> questionsTags = new ArrayList<Tag>();
		for(String subject: question.splitTags()) {
			Tag tag = this.tRepo.findBySubject(subject).orElse(null);
			if(tag == null) {
				tag = new Tag(subject);
				this.tRepo.save(tag);
			}
			if(!questionsTags.contains(tag))
				questionsTags.add(tag);
		}
		Question newQuestion = new Question(question.getQuestion(),questionsTags);
		this.qRepo.save(newQuestion);
	}
}
