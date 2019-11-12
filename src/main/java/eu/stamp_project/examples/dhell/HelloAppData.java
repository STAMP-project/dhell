package eu.stamp_project.examples.dhell;

public class HelloAppData {
    private int myPrintCount;
    private String myTracesName;
    private MyStorage myTraces;
    private boolean shouldPrintOnStdout;
	public int getMyPrintCount() {
		return myPrintCount;
	}
	public void setMyPrintCount(int myPrintCount) {
		this.myPrintCount = myPrintCount;
	}
	public String getMyTracesName() {
		return this.myTracesName;
	}
	public void setMyTracesName(String myTracesName) {
		this.myTracesName = myTracesName;
	}
	public MyStorage getMyTraces() {
		return this.myTraces;
	}
	public void setMyTraces(MyStorage myTraces) {
		this.myTraces = myTraces;
	}
	public boolean isShouldPrintOnStdout() {
		return this.shouldPrintOnStdout;
	}
	public void setShouldPrintOnStdout(boolean shouldPrintOnStdout) {
		this.shouldPrintOnStdout = shouldPrintOnStdout;
	}
}
