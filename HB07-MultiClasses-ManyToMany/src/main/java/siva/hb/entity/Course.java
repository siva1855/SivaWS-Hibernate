package siva.hb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coursetable1")
public class Course {

	@Id
	@Column(name = "courseid")
	private Integer courseId;

	@Column(name = "coursecode")
	private String courseCode;

	@Column(name = "coursefee")
	private Double courseFee;
}
