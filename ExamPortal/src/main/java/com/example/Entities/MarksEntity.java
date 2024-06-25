package com.example.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MarksDetail")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarksEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MarksId",length = 10)
	private Integer marksId;
	
	@Column(name = "Score",length = 10)
	private Integer Score;
	
	@Column(name = "Grade",length = 5)
	private String Grade;
	
	
	private PaperEntity paperId;
	
	private StudentEntity studentId;
}
