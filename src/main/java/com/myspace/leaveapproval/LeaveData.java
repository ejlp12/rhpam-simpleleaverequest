package com.myspace.leaveapproval;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class LeaveData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "LEAVEDATA_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "LEAVEDATA_ID_GENERATOR", sequenceName = "LEAVEDATA_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Duration")
	private java.lang.Double duration;

	@org.kie.api.definition.type.Label("Nama Pegawai")
	private java.lang.String employeName;

	@org.kie.api.definition.type.Label("Tanggal start cuti")
	private java.lang.String startDate;

	@org.kie.api.definition.type.Label(value = "Valid")
	private java.lang.Boolean valid;

	public LeaveData() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Double getDuration() {
		return this.duration;
	}

	public void setDuration(java.lang.Double duration) {
		this.duration = duration;
	}

	public java.lang.String getEmployeName() {
		return this.employeName;
	}

	public void setEmployeName(java.lang.String employeName) {
		this.employeName = employeName;
	}

	public java.lang.String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.lang.String startDate) {
		this.startDate = startDate;
	}

	public java.lang.Boolean getValid() {
		return this.valid;
	}

	public void setValid(java.lang.Boolean valid) {
		this.valid = valid;
	}

	public LeaveData(java.lang.Long id, java.lang.Double duration,
			java.lang.String employeName, java.lang.String startDate,
			java.lang.Boolean valid) {
		this.id = id;
		this.duration = duration;
		this.employeName = employeName;
		this.startDate = startDate;
		this.valid = valid;
	}

}