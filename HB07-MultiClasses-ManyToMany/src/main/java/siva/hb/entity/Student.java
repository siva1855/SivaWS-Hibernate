package siva.hb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studenttable1")
public class Student {
	
	
	@Id
	@Column(name = "studentid")
	private Integer studentId;
	@Column(name = "studentname")
	private String studentName;
	@Column(name = "studentmail")
	private String studentMail;
	@ManyToMany
	@JoinTable(name = "studentcoursetable1",
	           joinColumns = @JoinColumn(name = "studentidfk"),
	           inverseJoinColumns = @JoinColumn(name = "courseidfk"))
	private List<Course> courseList;
}
