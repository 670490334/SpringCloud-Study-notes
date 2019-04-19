package com.rabbit.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
@NoArgsConstructor
@SuppressWarnings("serial")
@Accessors(chain=true)
@Data//getset方法
public class Dept implements Serializable {// 必须序列化
	private Long deptno;// 主键
	private String dname;// 部门名
	private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
}
