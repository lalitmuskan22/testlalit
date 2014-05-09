package Model;

import java.util.ArrayList;
import java.util.List;

public class TaskBean extends TransferBean {
	
	String activityId;
	String projectName;
	String userName;
	String testCasePlanned;
	String testCasePassed;
	String testCaseFailed;
	String defect;
	String dqcRaised;
	String comments;
	String slot;
	List <TaskBean> taskList = new ArrayList<TaskBean>();
	
	
	
	public String getTestCasePlanned() {
		return testCasePlanned;
	}
	public void setTestCasePlanned(String testCasePlanned) {
		this.testCasePlanned = testCasePlanned;
	}
	public String getTestCasePassed() {
		return testCasePassed;
	}
	public void setTestCasePassed(String testCasePassed) {
		this.testCasePassed = testCasePassed;
	}
	public String getTestCaseFailed() {
		return testCaseFailed;
	}
	public void setTestCaseFailed(String testCaseFailed) {
		this.testCaseFailed = testCaseFailed;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public List<TaskBean> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<TaskBean> taskList) {
		this.taskList = taskList;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getDefect() {
		return defect;
	}
	public void setDefect(String defect) {
		this.defect = defect;
	}
	
	public String getDqcRaised() {
		return dqcRaised;
	}
	public void setDqcRaised(String dqcRaised) {
		this.dqcRaised = dqcRaised;
	}

	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	
	public TaskBean(){	
	}
	public TaskBean(String slot,String activityId, String projectName, String userName,
			String testCasePlanned, String testCasePassed,
			String testCaseFailed, String defect, String dqcRaised,
			String comments) {
		super();
		this.activityId = activityId;
		this.projectName = projectName;
		this.userName = userName;
		this.testCasePlanned = testCasePlanned;
		this.testCasePassed = testCasePassed;
		this.testCaseFailed = testCaseFailed;
		this.defect = defect;
		this.dqcRaised = dqcRaised;
		this.comments = comments;
		this.slot = slot;
	}
	
	
	
}
