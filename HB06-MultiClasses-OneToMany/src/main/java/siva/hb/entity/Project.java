package siva.hb.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_table")
public class Project {

	@Id
	@Column(name = "pid")
	private Integer projectId;

	@Column(name = "pname")
	private String projectName;

	@Column(name = "pvendor")
	private String projectVendor;

	@OneToMany

	@JoinColumn(name = "midfk")
	private List<Modules> modules;

	public Project() {
		super();
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectVendor() {
		return projectVendor;
	}

	public void setProjectVendor(String projectVendor) {
		this.projectVendor = projectVendor;
	}

	public List<Modules> getModules() {
		return modules;
	}

	public void setModules(List<Modules> modules) {
		this.modules = modules;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectVendor=" + projectVendor
				+ ", modules=" + modules + "]";
	}

}
