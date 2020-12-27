package com.trevorramsey.belt.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="events")
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	@Future
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date date;
	@NotBlank
	private String location;
	private String state;
	@Column(updatable=false)
	private Date createAt;
	private Date updateAt;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User planner;


	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name ="eventuser",
			joinColumns  = @JoinColumn(name="event_id"),
			inverseJoinColumns = @JoinColumn(name="user_id")
			)
	private List<User> attendee;
	
	

	public Event() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public User getPlanner() {
		return planner;
	}

	public void setPlanner(User planner) {
		this.planner = planner;
	}

	public List<User> getAttendee() {
		return attendee;
	}

	public void setAttendee(List<User> attendee) {
		this.attendee = attendee;
	}
	@PrePersist
	public void onCreate() {
		this.createAt= new Date();
	}
	@PostPersist
	public void onUpdate() {
		this.updateAt = new Date();
	}
	public Event(User planner) {
		this.planner = planner;
	}
	
	
}
