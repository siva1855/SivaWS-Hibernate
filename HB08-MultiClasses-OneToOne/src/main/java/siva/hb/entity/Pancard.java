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
@Table(name = "pancardtable4")
public class Pancard {

	@Id
	@Column(name = "pancardid")
	private Integer pancardId;

	@Column(name = "pancardnumber")
	private String pancardNumber;

	@Column(name = "dataofbirth")
	private String dataOfBirth;

}
