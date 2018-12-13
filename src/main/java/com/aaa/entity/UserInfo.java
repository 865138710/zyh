package com.aaa.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author TeacherChen
 * @description 用户实体类
 * @company AAA软件
 * @classname Qy78
 * 2018-11-21上午9:56:16
 */
@Data
public class UserInfo {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}
