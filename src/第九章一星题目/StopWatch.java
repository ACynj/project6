package 第九章一星题目;

import java.util.Date;

public class StopWatch {
private Date startTime,endTime;
public StopWatch() {
	startTime=new Date();
}
public void start() {
	startTime=new Date();
}
public void stop() {
	startTime=new Date();
}
public Long getElapsedTime() {
	Long  time=endTime.getTime()-startTime.getTime();
	return time;
}
}
