package Model;

public class QprojectBean {
	
	String project;
	String release;
	String delivery;
	String subProject;
	String typeOfTesting;
	String effortVariance;
	String scheduleVariance;
	String defectDensity;
	String totalDefects;
	public String getTotalDefects() {
		return totalDefects;
	}

	public void setTotalDefects(String totalDefects) {
		this.totalDefects = totalDefects;
	}

	String idd;
	String edd;

	public String getSubProject() {
		return subProject;
	}

	public void setSubProject(String subProject) {
		this.subProject = subProject;
	}

	public String getTypeOfTesting() {
		return typeOfTesting;
	}

	public void setTypeOfTesting(String typeOfTesting) {
		this.typeOfTesting = typeOfTesting;
	}

	public String getEffortVariance() {
		return effortVariance;
	}

	public void setEffortVariance(String effortVariance) {
		this.effortVariance = effortVariance;
	}

	public String getScheduleVariance() {
		return scheduleVariance;
	}

	public void setScheduleVariance(String scheduleVariance) {
		this.scheduleVariance = scheduleVariance;
	}

	public String getDefectDensity() {
		return defectDensity;
	}

	public void setDefectDensity(String defectDensity) {
		this.defectDensity = defectDensity;
	}

	public String getIdd() {
		return idd;
	}

	public void setIdd(String idd) {
		this.idd = idd;
	}

	public String getEdd() {
		return edd;
	}

	public void setEdd(String edd) {
		this.edd = edd;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

}
