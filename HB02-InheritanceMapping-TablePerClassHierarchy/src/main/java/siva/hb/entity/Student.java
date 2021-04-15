package siva.hb.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("student")
public class Student extends Person {

	@Column(name = "student_fee")
	private Double studentFee;
	@Column(name = "student_grade")
	private String studentGrade;

	public Student() {
		super();
	}

	public Double getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(Double studentFee) {
		this.studentFee = studentFee;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	@Override
	public String toString() {
		return "Student [studentFee=" + studentFee + ", studentGrade=" + studentGrade + "]";
	}

}
