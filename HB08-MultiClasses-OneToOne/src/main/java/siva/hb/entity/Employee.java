package siva.hb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employeetable4")
public class Employee {

	@Id
	@Column(name = "employeeid")
	private Integer employeeId;

	@Column(name = "employeename")
	private String employeeName;

	@Column(name = "employeedesignation")
	private String employeeDesignation;

	@Column(name = "employeesalary")
	private Double employeeSalary;

	@Column(name = "employeeaddress")
	private String employeeAddress;
	@ManyToOne
	@JoinColumn(name = "pancardidfk", unique = true)
	private Pancard pancardObj;
}
