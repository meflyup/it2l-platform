package com.hibernate.dto;

// Generated 08-Mar-2013 17:55:24 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Exercises generated by hbm2java
 */
@Entity
@Table(name = "exercises", catalog = "italk2learn")
public class Exercises implements java.io.Serializable {

	private int idExercise;
	private String exercise;
	private Set<Sequence> sequences = new HashSet<Sequence>(0);

	public Exercises() {
	}

	public Exercises(int idExercise) {
		this.idExercise = idExercise;
	}

	public Exercises(int idExercise, String exercise, Set<Sequence> sequences) {
		this.idExercise = idExercise;
		this.exercise = exercise;
		this.sequences = sequences;
	}

	@Id
	@Column(name = "id_exercise", unique = true, nullable = false)
	public int getIdExercise() {
		return this.idExercise;
	}

	public void setIdExercise(int idExercise) {
		this.idExercise = idExercise;
	}

	@Column(name = "exercise", length = 50)
	public String getExercise() {
		return this.exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "exercises")
	public Set<Sequence> getSequences() {
		return this.sequences;
	}

	public void setSequences(Set<Sequence> sequences) {
		this.sequences = sequences;
	}

}