package com.bd.timing.task;

/**
* @Title: IEasyTask.java
* @Package com.bd.timing.task
* @Description: TODO(用一句话描述该文件做什么)
* @author xxftuu
* @date 2023年4月27日
* @version V1.0
*/
public interface IEasyTask extends Runnable {
	
	/**
	 * 检查任务是否已经完成过，用于当本任务为其它任务前置条件时检查运行状态使用
	 * @return
	 */
	boolean  isCompleted();
	
}
