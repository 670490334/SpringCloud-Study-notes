## SpringCloud：微服务架构

### 1.面试中常见问题

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412095208.png)

#### dubbo和SpringCloud区别

dubbo是基于Rpc通信，SpringCloud是基于RESTful API通信

#### eureka和zookeeper的区别

zookeeper是CP，C主要是服务一致性，保证数据一致性，但是注册中心挂了就容易出问题

eureka是AP，跟zookeeper相比，它支持高可用(A)，服务挂了，可以使用另外一个

#### SpringCloud和SpringBoot的关系

SpringBoot关注与快速方便的开发单个个体微服务

SpringCloud是关注全局的微服务治理框架，他将SpringBoot开发的一个个单体微服务整合并管理起来，为各个微服务之间提供，配置管理，服务发现，断路由，路由，微处理，时间总线，全局锁，决策竞选，分布式会话等等继承服务

SpringBoot可以离开SpringCloud独立使用开发项目，==但是SpringCloud离不开SpringBoot==，属于依赖关系。

==SpringBoot专注于快速，方便的开发单个微服务个体，SpringCloud关注去的微服务治理框架==

#### 微服务技术栈

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412105849.png)

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412105907.png)

### 2.微服务概述

#### 微服务是什么：

官网中的话:

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412095534.png)

微服务:

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412100026.png)

#### 微服务架构:

一个新的架构形式，微服务架构将以前一个大的服务架构分为一个一个小的服务，对应的服务做对应的事。![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412103140.png)

#### 微服务的好处和缺点：

优点：

1. 每个服务足够内聚，足够小，代码容易理解，找那个聚焦一个指定的业务功能或业务需求
2. 开发简单，效率高，一个服务就是专一干一件事
3. 微服务能够被小团队单独开发
4. 微服务是松散耦合的，是有功能意义的服务，无论是在开发阶段还是部署阶段都是独立的
5. 微服务能用不同的语言开发
6. 易于和第三方集成，微服务允许容易且灵活的方式集成自动部署，通过持续集成工具，如Jekins，Husdon，bamboo。
7. 微服务易于被开发人员理解，修改和维护。
8. 微服务允许李荣融合最新技术
9. ==微服务只是业务逻辑的代码，不会和html，css或其他界面组件混合==
10. ==每个微服务都有自己的存储能力，可以有自己的数据库，也可以有统一数据库==

缺点：

1. 开发人员要处理分布式的复杂性
2. 多服务运维难度，对着服务增加，运维难度也增加
3. 系统部署以来
4. 服务间通信成本增加
5. 数据一致性
6. 系统集成测试
7. 性能监控

#### 微服务技术栈

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412105849.png)

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412105907.png)

#### 为什么选取SpringCloud作为微服务架构

SpringCloud是一个成熟完整的微服务架构体系，它几乎支持所有的微服务架构所需的组件，其他或多或少都不是一个完整的微服务架构体系，需要去依赖其他中间件。



### 3.SpringCloud入门概述

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412111827.png)

#### SpringCloud和SpringBoot的关系

SpringBoot关注与快速方便的开发单个个体微服务

SpringCloud是关注全局的微服务治理框架，他讲SpringBoot开发的一个个单体微服务整合并管理起来，为各个微服务之间提供，配置管理，服务发先，断路由，路由，微处理，时间总线，全局锁，决策竞选，分布式会话等等继承服务

SpringBoot可以离开SpringCloud独立使用开发项目，==但是SpringCloud离不开SpringBoot==，属于依赖关系。

==SpringBoot专注于快速，方便的开发单个微服务个体，SpringCloud关注去的微服务治理框架==



#### Dubbo是怎么到SpringCloud的，哪些优缺点让你去技术选型

对比：

|              | Dubbo         | SpringCloud                 |
| :----------- | ------------- | --------------------------- |
| 服务注册中心 | Zookeeper     | SpringCloud Netfilx Eureka  |
| 服务调用方式 | RPC           | Restful Api                 |
| 服务监控     | Dubbo-monitor | SpringBoot Admin            |
| 路由器       | 不完善        | SpringCloud Netflix Hystrix |
| 服务网关     | 无            | SpringCloud Netflix Zuul    |
| 分布式配置   | 无            | SpringCloud Config          |
| 服务跟踪     | 无            | SpringCloud Sleuth          |
| 消息总线     | 无            | SpringCloud Bus             |
| `数据流`     | 无            | SpringCloud Stream          |
| 批量任务     | 无            | SpringCloud Task            |

最大区别：==SpringCloud抛弃了Dubbo的RPC通信，采用的是基于Http的REST方式==

严格来说：两种三十各有优势，虽然一定程度来说，后者牺牲了服务调用的性能，但也避免了上面提到的原生Rpc带来的问题，而Rest相比RPC更为灵活，服务提供方和调用方的以来只靠一张契约，不存在代码级别的强依赖，这在强调快速演化的微服务环境下，显得更加合适

#### 总结Cloud和Dubbo





### Rest微服务构建

#### Lomback的使用

**Eclipse使用Lomback：**

下载对应版本的lomback.jar放在eclipse的根目录

在eclipse.ini文件中添加如下代码:

```shell
-Xbootclasspath/a:lombok.jar
-javaagent:lombok.jar
```

在maven中导入lomback就能使用

**IDEA集成**

File -> Setting -> Plugins -> Browse repositories 

在弹出的输入框内搜索lombak点击install，然后pom导入jar即可



- lomback的使用：

  ```java
  @NoArgsConstructor
  @SuppressWarnings("serial")
  @Accessors(chain=true)
  @Data//getset方法
  public class Dept implements Serializable {// 必须序列化
  	private Long deptno;// 主键
  	private String dname;// 部门名
  	private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
  }
  ```

  @Data:该注解可以给类加上getset方法以及空参构造



#### RestTemplate

官网地址：https://docs.spring.io/spring-framework/docs/4.3.7.RELEASE/javadoc-api/org/springframework/web/client/RestTemplate.html

在配置类中配置RestTemplate:

```java
@Configuration
public class ConfigBean {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}

```

使用RestTemplate:

postForObject（）：使用restTemplate访问restful接口非常的简单粗暴无脑(url,requestMap,ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。

getForObject（）：url 跟返回值类型

```java
@RestController
public class DeptController_Consumer {

	private String REST_URL_PREFIX = "http://localhost:8001";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		/*
		 * 使用restTemplate访问restful接口非常的简单粗暴无脑。
		(url, requestMap, ResponseBean.class)这三个参数分别代表 
		REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
		 */
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}
	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		/*
		 * 使用restTemplate访问restful接口非常的简单粗暴无脑。
		(url, requestMap, ResponseBean.class)这三个参数分别代表 
		REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
		 */
		return restTemplate.getForObject(REST_URL_PREFIX+ "/dept/get/"+id, Dept.class);
	}
```





### Eureka服务注册与发现

#### 是什么？

Eureka是Netflix的一个子模块，也是核心模块之一。Eureka是一个基于REST的服务，用于定位服务，以实现云端中间层服务发现和故障转移。服务注册与发现对于微服务架构来说是非常重要的，有了服务发现与注册，==只需要使用服务的标识符==，就可以访问到服务，而不需要修改服务调用的配置文件了。==功能类似于dubbo的注册中心，比如Zookeeper==。

#### Netflix在设计Eureka时遵守的就是AP原则

CAP原则又称CAP定理，指的是在一个分布式系统中，Consistency（一致性）、 Availability（可用性）、Partition tolerance（分区容错性），三者不可兼得

#### Eureka的基本架构

Spring Cloud 封装了 Netflix 公司开发的 Eureka 模块来实现服务注册和发现(请对比Zookeeper)。

Eureka 采用了 C-S 的设计架构。Eureka Server 作为服务注册功能的服务器，它是服务注册中心。

而系统中的其他微服务，使用 Eureka 的客户端连接到 Eureka Server并维持心跳连接。这样系统的维护人员就可以通过 Eureka Server 来监控系统中各个微服务是否正常运行。SpringCloud 的一些其他模块（比如Zuul）就可以通过 Eureka Server 来发现系统中的其他微服务，并执行相关的逻辑。
==请注意和Dubbo的架构对比==

```
   ![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/eureka架构01.bmp)
```

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412195043.png)

==Eureka包含两个组件：Eureka Server和Eureka Client==
Eureka Server提供服务注册服务
各个节点启动后，会在EurekaServer中进行注册，这样EurekaServer中的服务注册表中将会存储所有可用服务节点的信息，服务节点的信息可以在界面中直观的看到

EurekaClient是一个Java客户端，用于简化Eureka Server的交互，客户端同时也具备一个内置的、使用轮询(round-robin)负载算法的负载均衡器。在应用启动后，将会向Eureka Server发送心跳(默认周期为30秒)。如果Eureka Server在多个心跳周期内没有接收到某个节点的心跳，EurekaServer将会从服务注册表中把这个服务节点移除（默认90秒）

#### 三大角色

- Eureka Server 提供服务注册和发现
- Service Provider服务提供方将自身服务注册到Eureka，从而使服务消费方能够找到
- Service Consumer服务消费方从Eureka获取注册服务列表，从而能够消费服务

#### 搭建Server注册中心

新建microservicecloud-eureka-7001作为micservicecloud的子工程

pom.xml文件

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>com.rabbit.springcloud</groupId>
		<artifactId>micservicecloud</artifactId>
		<version>0.0.1-SNAPSHOT</version>
	</parent>
	<artifactId>microservicecloud-eureka-7001</artifactId>

	<dependencies>
		<!--eureka-server服务端 -->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka-server</artifactId>
		</dependency>
		<!-- 修改后立即生效，热部署 -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>springloaded</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>
	</dependencies>
</project>
```

application.yml文件

```yml
server:
  port: 7001
eureka:
  instance:
    hostname: localhost #eureka服务端的实力名称
  client:
    register-with-eureka: false #false表示不想注册中心注册自己
    fetch-registry: false #false表示自己就是注册中心，职责就是维护服务实力，并不需要去检索
    service-url:
      # 设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址。
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/s
```

启动类:加上注解：==@EnableEurekaServer==

```java
//@EurekaServer 服务器端启动类,接受其它微服务注册进来
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001_App {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class, args);
	}
}
```

测试: 

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412222132.png)

#### actuator与注册微服务信息完善

修改之前的8001工程

在pom.xml文件加上eureka

```xml
   <!-- 将微服务provider侧注册进eureka -->
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-eureka</artifactId>
   </dependency>
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-config</artifactId>
   </dependency>

```

在yml中加上eureka配置加入注册

```yml
eureka:
  client: #客户端注册进eureka服务列表内
    service-url: 
      defaultZone: http://localhost:7001/eureka


```

在启动类上加上注解：表示客户端==@EnableEurekaClient==

```java
//启动
@SpringBootApplication
//本服务启动后会自动注册进eureka服务中
@EnableEurekaClient
public class DeptProvider8001_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_App.class, args);
	}

}


```

测试：先启动Server，再启动Client

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412222938.png)

但是这样会显示主机名称，可以自定义服务器信息名称

在8001中yml中修改：

```yml
 instance:
    #自定义服务名称信息
    instance-id: microservicecloud-dept8001
    #访问路径可以显示ip地址
    prefer-ip-address: true


```

完整:

```yml
server:
  port: 8001
  
mybatis:
  config-location: classpath:mybatis/mybatis.cfg.xml        # mybatis配置文件所在路径
  type-aliases-package: com.rabbit.springcloud.entities    # 所有Entity别名类所在包
  mapper-locations:
  - classpath:mybatis/mapper/**/*.xml                       # mapper映射文件
    
spring:
   application:
    name: microservicecloud-dept 
   datasource:
    type: com.alibaba.druid.pool.DruidDataSource            # 当前数据源操作类型
    driver-class-name: com.mysql.jdbc.Driver              # mysql驱动包
    url: jdbc:mysql://localhost:3306/cloudDB01?serverTimezone=GMT%2B8              # 数据库名称
    username: root
    password: admin
    dbcp2:
      min-idle: 5                                           # 数据库连接池的最小维持连接数
      initial-size: 5                                       # 初始化连接数
      max-total: 5                                          # 最大连接数
      max-wait-millis: 200                                  # 等待连接获取的最大超时时间
 
eureka:
  client: #客户端注册进eureka服务列表内
    service-url: 
      defaultZone: http://localhost:7001/eureka 
  instance:
    #自定义服务名称信息
    instance-id: microservicecloud-dept8001
    #访问路径可以显示ip地址
    prefer-ip-address: true


```

测试:

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412223814.png)

但是还有问题：点击超链接会出现ErrorPage

需要给其加上actuator监控信息完善，在pom.xml加上依赖

```xml
 <!-- actuator监控信息完善 -->
   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-actuator</artifactId>
   </dependency>


```

总的父工程microservicecloud修改pom.xml添加构建build信息

```xml
 <build>
   <finalName>micservicecloud</finalName>
   <resources>
     <resource>
       <directory>src/main/resources</directory>
       <filtering>true</filtering>
     </resource>
   </resources>
   <plugins>
     <plugin>
       <groupId>org.apache.maven.plugins</groupId>
       <artifactId>maven-resources-plugin</artifactId>
       <configuration>
         <delimiters>
          <delimit>$</delimit>
         </delimiters>
       </configuration>
     </plugin>
   </plugins>
  </build>



```

修改microservicecloud-provider-dept-8001:

yml修改部分:

```yml
info:
  app.name: rabbit-microservicecloud
  company.name: www.rabbit.com
  build.artifactId: $project.artifactId$
  build.version: $project.version$



```

完整:yml

```yml
server:
  port: 8001
  
mybatis:
  config-location: classpath:mybatis/mybatis.cfg.xml        # mybatis配置文件所在路径
  type-aliases-package: com.rabbit.springcloud.entities    # 所有Entity别名类所在包
  mapper-locations:
  - classpath:mybatis/mapper/**/*.xml                       # mapper映射文件
    
spring:
   application:
    name: microservicecloud-dept 
   datasource:
    type: com.alibaba.druid.pool.DruidDataSource            # 当前数据源操作类型
    driver-class-name: com.mysql.jdbc.Driver              # mysql驱动包
    url: jdbc:mysql://localhost:3306/cloudDB01?serverTimezone=GMT%2B8              # 数据库名称
    username: root
    password: admin
    dbcp2:
      min-idle: 5                                           # 数据库连接池的最小维持连接数
      initial-size: 5                                       # 初始化连接数
      max-total: 5                                          # 最大连接数
      max-wait-millis: 200                                  # 等待连接获取的最大超时时间
 
eureka:
  client: #客户端注册进eureka服务列表内
    service-url: 
      defaultZone: http://localhost:7001/eureka 
  instance:
    #自定义服务名称信息
    instance-id: microservicecloud-dept8001
    #访问路径可以显示ip地址
    prefer-ip-address: true

info:
  app.name: rabbit-microservicecloud
  company.name: www.rabbit.com
  build.artifactId: $project.artifactId$
  build.version: $project.version$


```

测试超链接：

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190412230355.png)

#### eureka自我保护

什么是自我保护模式？

默认情况下，如果EurekaServer在一定时间内没有接收到某个微服务实例的心跳，EurekaServer将会注销该实例（默认90秒）。但是当网络分区故障发生时，微服务与EurekaServer之间无法正常通信，以上行为可能变得非常危险了——因为微服务本身其实是健康的，此时本不应该注销这个微服务。Eureka通过“自我保护模式”来解决这个问题——当EurekaServer节点在短时间内丢失过多客户端时（可能发生了网络分区故障），那么这个节点就会进入自我保护模式。一旦进入该模式，EurekaServer就会保护服务注册表中的信息，不再删除服务注册表中的数据（也就是不会注销任何微服务）。当网络故障恢复后，该Eureka Server节点会自动退出自我保护模式。

在自我保护模式中，Eureka Server会保护服务注册表中的信息，不再注销任何服务实例。当它收到的心跳数重新恢复到阈值以上时，该Eureka Server节点就会自动退出自我保护模式。它的设计哲学就是宁可保留错误的服务注册信息，也不盲目注销任何可能健康的服务实例。一句话讲解：好死不如赖活着

综上，自我保护模式是一种应对网络异常的安全保护措施。它的架构哲学是宁可同时保留所有微服务（健康的微服务和不健康的微服务都会保留），也不盲目注销任何健康的微服务。使用自我保护模式，可以让Eureka集群更加的健壮、稳定。

在Spring Cloud中，可以使用eureka.server.enable-self-preservation = false 禁用自我保护模式。

 **一句话：某时刻某一个微服务不可用了，eureka不会立刻清理，依旧会对该微服务的信息进行保存**



#### microservicecloud-provider-dept-8001-服务发现Discovery

对于注册进eureka里面的微服务，可以通过服务发现来获得该服务的信息;

在8001的controller中添加方法获取该服务信息

首先要引入DiscoveryClient

```java
	@Autowired
	private DiscoveryClient client;


```

添加方法:

```java
@RequestMapping(value = "/dept/discovery", method=RequestMethod.GET)
	public Object discovery() {
		List<String> list = client.getServices();
		System.out.println("**********"+list);
		
		List<ServiceInstance> servList = client.getInstances("microservicecloud-dept");
		for (ServiceInstance serviceInstance : servList) {
			System.out.println(serviceInstance.getServiceId() + "\t" + serviceInstance.getHost() + "\t" + serviceInstance.getPort() + "\t"
			         + serviceInstance.getUri());
		}
		return this.client;
	}


```

在80中调用该服务方法:

```java
@RequestMapping("/consumer/dept/discovery")
	public Object dicovery() {
		return restTemplate.getForObject(REST_URL_PREFIX+"dept/discovery", Object.class);
	}


```

#### 集群配置

1. 原理说明

   基本原理

   ![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/集群原理.bmp)

   上图是来自eureka的官方架构图，这是基于集群配置的eureka； 

   - 处于不同节点的eureka通过Replicate进行数据同步 
   - Application Service为服务提供者 
   - Application Client为服务消费者 
   - Make Remote Call完成一次服务调用

   服务启动后向Eureka注册，Eureka Server会将注册信息向其他Eureka Server进行同步，当服务消费者要调用服务提供者，则向服务注册中心获取服务提供者地址，然后会将服务提供者地址缓存在本地，下次再调用时，则直接从本地缓存中取，完成一次调用。

   当服务注册中心Eureka Server检测到服务提供者因为宕机、网络原因不可用时，则在服务注册中心将服务置为DOWN状态，并把当前服务提供者状态向订阅者发布，订阅过的服务消费者更新本地缓存。

   服务提供者在启动后，周期性（默认30秒）向Eureka Server发送心跳，以证明当前服务是可用状态。Eureka Server在一定的时间（默认90秒）未收到客户端的心跳，则认为服务宕机，注销该实例。

2. 修改hosts文件

   ```shell
   127.0.0.1  eureka7001.com
   127.0.0.1  eureka7002.com
   127.0.0.1  eureka7003.com
   
   
   ```

3. 创建两个server工程，跟7001差不多,7002/7003

4. 配置yml:

   7001:

   ```yml
   server:
     port: 7001
   eureka:
     instance:
       hostname: eureka7001.com #eureka服务端的实力名称
     client:
       register-with-eureka: false #false表示不想注册中心注册自己
       fetch-registry: false #false表示自己就是注册中心，职责就是维护服务实力，并不需要去检索
       service-url:
         # 设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址。
         #单机 defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/      
          #设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址（单机）。
         defaultZone: http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
   
   
   ```

   7002:

   ```yml
   server:
     port: 7002
   eureka:
     instance:
       hostname: eureka7002.com #eureka服务端的实力名称
     client:
       register-with-eureka: false #false表示不想注册中心注册自己
       fetch-registry: false #false表示自己就是注册中心，职责就是维护服务实力，并不需要去检索
       service-url:
         # 设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址。
         #单机 defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/      
          #设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址（单机）。
         defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7003.com:7003/eureka/
   
   
   ```

   7003:

   ```yml
   server:
     port: 7003
   eureka:
     instance:
       hostname: eureka7003.com #eureka服务端的实力名称
     client:
       register-with-eureka: false #false表示不想注册中心注册自己
       fetch-registry: false #false表示自己就是注册中心，职责就是维护服务实力，并不需要去检索
       service-url:
         # 设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址。
         #单机 defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/      
          #设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址（单机）。
         defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/
   
   
   ```

   

将8001的provider发布到集群：

修改8001的yml:

修改处:

```yml
eureka:
  client: #客户端注册进eureka服务列表内
    service-url: 
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/ 


```

完整：

```yml
server:
  port: 8001
  
mybatis:
  config-location: classpath:mybatis/mybatis.cfg.xml        # mybatis配置文件所在路径
  type-aliases-package: com.rabbit.springcloud.entities    # 所有Entity别名类所在包
  mapper-locations:
  - classpath:mybatis/mapper/**/*.xml                       # mapper映射文件
    
spring:
   application:
    name: microservicecloud-dept 
   datasource:
    type: com.alibaba.druid.pool.DruidDataSource            # 当前数据源操作类型
    driver-class-name: com.mysql.jdbc.Driver              # mysql驱动包
    url: jdbc:mysql://localhost:3306/cloudDB01?serverTimezone=GMT%2B8              # 数据库名称
    username: root
    password: admin
    dbcp2:
      min-idle: 5                                           # 数据库连接池的最小维持连接数
      initial-size: 5                                       # 初始化连接数
      max-total: 5                                          # 最大连接数
      max-wait-millis: 200                                  # 等待连接获取的最大超时时间
 
eureka:
  client: #客户端注册进eureka服务列表内
    service-url: 
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/ 
  instance:
    #自定义服务名称信息
    instance-id: microservicecloud-dept8001
    #访问路径可以显示ip地址
    prefer-ip-address: true

info:
  app.name: rabbit-microservicecloud
  company.name: www.rabbit.com
  build.artifactId: $project.artifactId$
  build.version: $project.version$


```

#### 作为服务注册中心，Eureka比Zookeeper好在哪里

==什么是CAP:==

```text
C:Consitency：强一致性
A:Availability ：可用性
P:Partition tolerance :分区容错性


```



著名的CAP理论指出，一个分布式系统不可能同时满足C(一致性)、A(可用性)和P(分区容错性)。由于分区容错性P在是分布式系统中必须要保证的，因此我们只能在A和C之间进行权衡。
因此
Zookeeper保证的是CP,
Eureka则是AP。

4.1 Zookeeper保证CP
当向注册中心查询服务列表时，我们可以容忍注册中心返回的是几分钟以前的注册信息，但不能接受服务直接down掉不可用。也就是说，服务注册功能对可用性的要求要高于一致性。但是zk会出现这样一种情况，当master节点因为网络故障与其他节点失去联系时，剩余节点会重新进行leader选举。问题在于，选举leader的时间太长，30 ~ 120s, 且选举期间整个zk集群都是不可用的，这就导致在选举期间注册服务瘫痪。在云部署的环境下，因网络问题使得zk集群失去master节点是较大概率会发生的事，虽然服务能够最终恢复，但是漫长的选举时间导致的注册长期不可用是不能容忍的。

4.2 Eureka保证AP
Eureka看明白了这一点，因此在设计时就优先保证可用性。==Eureka各个节点都是平等的==，几个节点挂掉不会影响正常节点的工作，剩余的节点依然可以提供注册和查询服务。而Eureka的客户端在向某个Eureka注册或时如果发现连接失败，则会自动切换至其它节点，只要有一台Eureka还在，就能保证注册服务可用(保证可用性)，只不过查到的信息可能不是最新的(不保证强一致性)。除此之外，Eureka还有一种自我保护机制，如果在15分钟内超过85%的节点都没有正常的心跳，那么Eureka就认为客户端与注册中心出现了网络故障，此时会出现以下几种情况： 

1. Eureka不再从注册列表中移除因为长时间没收到心跳而应该过期的服务 
2. Eureka仍然能够接受新服务的注册和查询请求，但是不会被同步到其它节点上(即保证当前节点依然可用) 
3. 当网络稳定时，当前实例新的注册信息会被同步到其它节点中

==因此， Eureka可以很好的应对因网络故障导致部分节点失去联系的情况，而不会像zookeeper那样使整个注册服务瘫痪。==

 

### Ribbon负载均衡

**什么是Ribbon：**

Spring Cloud Ribbon是基于Netflix Ribbon实现的一套==客户端       负载均衡的工具。==

简单的说，Ribbon是Netflix发布的开源项目，主要功能是提供客户端的==软件负载均衡算法==，将Netflix的中间层服务连接在一起。Ribbon客户端组件提供一系列完善的配置项如连接超时，重试等。简单的说，就是在配置文件中列出Load Balancer（简称LB）后面所有的机器，Ribbon会自动的帮助你基于某种规则（如简单轮询，随机连接等）去连接这些机器。我们也很容易使用Ribbon实现自定义的负载均衡算法。

 官网资料:https://github.com/Netflix/ribbon/wiki/Getting-Started

 **作用：**

LB，即负载均衡(Load Balance)，在微服务或分布式集群中经常用的一种应用。
负载均衡简单的说就是将用户的请求平摊的分配到多个服务上，从而达到系统的HA。
常见的负载均衡有软件Nginx，LVS，硬件 F5等。
相应的在中间件，例如：dubbo和SpringCloud中均给我们提供了负载均衡，SpringCloud的负载均衡算法可以自定义。 

**进程内LB**

将LB逻辑集成到消费方，消费方从服务注册中心获知有哪些地址可用，然后自己再从这些地址中选择出一个合适的服务器。

==Ribbon就属于进程内LB==，它只是一个类库，集成于消费方进程，消费方通过它来获取到服务提供方的地址。

#### Ribbon的配置

修改80工程中的RestTemplate配置类:

```java
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced//开启负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}


```

启动类加上@EnableEurekaClient

```java
@EnableEurekaClient
@SpringBootApplication
public class DeptConsumer80_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}


```

在pom文件中引入ribbon依赖:

```xml
   <!-- Ribbon相关 -->
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-eureka</artifactId>
   </dependency>
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-ribbon</artifactId>
   </dependency>
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-config</artifactId>
   </dependency>


```

修改yml：

```yml
server:
  port: 80

eureka:
  client:
    register-with-eureka: false
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
      


```

修改DeptController_Consumer客户端访问类:

```java
@RestController
public class DeptController_Consumer {

	//private String REST_URL_PREFIX = "http://localhost:8001";
	//换成服务名,不关心其端口号
	private String REST_URL_PREFIX = "http://microservicecloud-dept";


```

启动3个eureka集群，再启动8001注册金eureka

再启动80测试。



==总结:Ribbon和Eureka整合后Consumer可以直接调用服务而不用再关心地址和端口号==





#### Ribbon的负载均衡

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/ribbon负载均衡架构.bmp)

Ribbon在工作时分成两步
第一步先选择 EurekaServer ,它优先选择在同一个区域内负载较少的server.
第二步再根据用户指定的策略，在从server取到的服务注册列表中选择一个地址。
其中Ribbon提供了多种策略：比如轮询、随机和根据响应时间加权。

**参考microservicecloud-provider-dept-8001，新建两份，分别命名为8002，8003**

**新建8002/8003数据库，各自微服务分别连各自的数据库**





修改8002/8003各自YML==:对外暴露的统一的服务实例名==**microservicecloud-dept** 

8002:注意**端口号**,连接的**数据库**以及**instance-id**

```yml
server:
  port: 8002
  
mybatis:
  config-location: classpath:mybatis/mybatis.cfg.xml        # mybatis配置文件所在路径
  type-aliases-package: com.rabbit.springcloud.entities    # 所有Entity别名类所在包
  mapper-locations:
  - classpath:mybatis/mapper/**/*.xml                       # mapper映射文件
    
spring:
   application:
    name: microservicecloud-dept 
   datasource:
    type: com.alibaba.druid.pool.DruidDataSource            # 当前数据源操作类型
    driver-class-name: com.mysql.jdbc.Driver              # mysql驱动包
    url: jdbc:mysql://localhost:3306/cloudDB02?serverTimezone=GMT%2B8              # 数据库名称
    username: root
    password: admin
    dbcp2:
      min-idle: 5                                           # 数据库连接池的最小维持连接数
      initial-size: 5                                       # 初始化连接数
      max-total: 5                                          # 最大连接数
      max-wait-millis: 200                                  # 等待连接获取的最大超时时间
 
eureka:
  client: #客户端注册进eureka服务列表内
    service-url: 
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/ 
  instance:
    #自定义服务名称信息
    instance-id: microservicecloud-dept8002
    #访问路径可以显示ip地址
    prefer-ip-address: true

info:
  app.name: rabbit-microservicecloud
  company.name: www.rabbit.com
  build.artifactId: $project.artifactId$
  build.version: $project.version$


```

8003：

```yml
server:
  port: 8003
  
mybatis:
  config-location: classpath:mybatis/mybatis.cfg.xml        # mybatis配置文件所在路径
  type-aliases-package: com.rabbit.springcloud.entities    # 所有Entity别名类所在包
  mapper-locations:
  - classpath:mybatis/mapper/**/*.xml                       # mapper映射文件
    
spring:
   application:
    name: microservicecloud-dept 
   datasource:
    type: com.alibaba.druid.pool.DruidDataSource            # 当前数据源操作类型
    driver-class-name: com.mysql.jdbc.Driver              # mysql驱动包
    url: jdbc:mysql://localhost:3306/cloudDB03?serverTimezone=GMT%2B8              # 数据库名称
    username: root
    password: admin
    dbcp2:
      min-idle: 5                                           # 数据库连接池的最小维持连接数
      initial-size: 5                                       # 初始化连接数
      max-total: 5                                          # 最大连接数
      max-wait-millis: 200                                  # 等待连接获取的最大超时时间
 
eureka:
  client: #客户端注册进eureka服务列表内
    service-url: 
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/ 
  instance:
    #自定义服务名称信息
    instance-id: microservicecloud-dept8003
    #访问路径可以显示ip地址
    prefer-ip-address: true

info:
  app.name: rabbit-microservicecloud
  company.name: www.rabbit.com
  build.artifactId: $project.artifactId$
  build.version: $project.version$


```

启动3个eureka集群配置区；

启动8001测试；

启动80通过<http://localhost/consumer/dept/get/3>

客户端通过Ribbo完成负载均衡并访问上一步的Dept微服务，注意观察看到返回的数据库名字，各不相同，负载均衡实现

测试如图：

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190413193726.png)

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190413193753.png)

**总结：Ribbon其实就是一个软负载均衡的客户端组件，**
**他可以和其他所需请求的客户端结合使用，和eureka结合只是其中的一个实例。**





#### Ribbon核心组件IRule

IRule：根据特定算法中从服务列表中选取一个要访问的服务

负载均衡的算法默认就是这7个:

| RoundRobinRule            | 轮询                                                         |
| ------------------------- | ------------------------------------------------------------ |
| RandomRule                | 随机                                                         |
| AvailabilityFilteringRule | 会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，<br/>还有并发的连接数量超过阈值的服务，然后对剩余的服务列表按照轮询策略进行访问 |

| WeightedResponseTimeRule  | 根据平均响应时间计算所有服务的权重，响应时间越快服务权重越大被选中的概率越高。<br/>刚启动时如果统计信息不足，则使用RoundRobinRule策略，等统计信息足够，
会切换到WeightedResponseTimeRule |
| RetryRule                 | 先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务 |
| BestAvailableRule         | 会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务 |
| ZoneAvoidanceRule         | 默认规则,复合判断server所在区域的性能和server的可用性选择服务器 |

需要使用哪种，直接根据对应的配置就行，比如配置随机算法:

```java
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced//开启负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public IRule myIRule() {
		//选择随机的算法进行负载均衡
		return new RandomRule();
	}
}



```

#### Ribbon自定义

**修改microservicecloud-consumer-dept-80**

配置自己的算法

1. 注意配置细节

   官方文档明确给出了警告：
   这个自定义配置类不能放在@ComponentScan所扫描的当前包下以及子包下，
   否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，也就是说
   我们达不到特殊化定制的目的了。

   新建包:com.rabbit.myrule;

   新建类:MySelfRule

   ```java
   @Configuration
   public class MySelfRule {
   
   	@Bean
   	public IRule myIRule() {
   		return new RandomRule();//Ribbon默认是轮询，我自定义为随机
   
   	}
   }
   
   
   
   ```

2. 修改主启动类，在主启动类加上：@RibbonClient

   ```java
   @RibbonClient(name="microservicecloud-dept",configuration=MySelfRule.class)
   @EnableEurekaClient
   @SpringBootApplication
   public class DeptConsumer80_App {
   	public static void main(String[] args) {
   		SpringApplication.run(DeptConsumer80_App.class, args);
   	}
   }
   
   
   ```

3. 问题：依旧轮询策略，但是加上新需求，每个服务器要求被调用5次。也即
   以前是每台机器一次，现在是每台机器5次

   解析源码：https://github.com/Netflix/ribbon/blob/master/ribbon-loadbalancer/src/main/java/com/netflix/loadbalancer/RandomRule.java

   根据源码编写自己的算法。

   ```java
   package com.rabbit.myrule;
   
   import java.util.List;
   
   import com.netflix.client.config.IClientConfig;
   import com.netflix.loadbalancer.AbstractLoadBalancerRule;
   import com.netflix.loadbalancer.ILoadBalancer;
   import com.netflix.loadbalancer.Server;
   /**
    * 自定义算法，定义自己的IRule
    * 
    * 依旧轮询策略，但是加上新需求，每个服务器要求被调用5次。也即
   以前是每台机器一次，现在是每台机器5次
    * @author Admin
    *
    */
   public class RandomRule_LF extends AbstractLoadBalancerRule {
   
   	private int total = 0; // 总共被调用的次数，目前要求每台被调用5次
   	private int currentIndex = 0;// 当前提供服务的机器号
   
   	public Server choose(ILoadBalancer lb, Object key) {
   		if (lb == null) {
   			return null;
   		}
   		Server server = null;
   
   		while (server == null) {
   			if (Thread.interrupted()) {
   				return null;
   			}
   			List<Server> upList = lb.getReachableServers();
   			List<Server> allList = lb.getAllServers();
   
   			int serverCount = allList.size();
   			if (serverCount == 0) {
   				/*
   				 * No servers. End regardless of pass, because subsequent passes only get more
   				 * restrictive.
   				 */
   				return null;
   			}
   
   //            int index = rand.nextInt(serverCount);
   //            server = upList.get(index);
   			if (total < 5) {
   				server = upList.get(currentIndex);
   				total++;
   			} else {
   				total = 0;
   				currentIndex++;
   				if (currentIndex >= upList.size()) {
   					currentIndex = 0;
   				}
   
   			}
   
   			if (server == null) {
   				/*
   				 * The only time this should happen is if the server list were somehow trimmed.
   				 * This is a transient condition. Retry after yielding.
   				 */
   				Thread.yield();
   				continue;
   			}
   
   			if (server.isAlive()) {
   				return (server);
   			}
   
   			// Shouldn't actually happen.. but must be transient or a bug.
   			server = null;
   			Thread.yield();
   		}
   
   		return server;
   
   	}
   
   	@Override
   	public Server choose(Object key) {
   		return choose(getLoadBalancer(), key);
   	}
   
   	@Override
   	public void initWithNiwsConfig(IClientConfig clientConfig) {
   
   	}
   
   
   }
   
   
   
   ```

4. 加入配置类:

   ```java
   @Configuration
   public class MySelfRule {
   
   	@Bean
   	public IRule myIRule() {
   //		return new RandomRule();//Ribbon默认是轮询，我自定义为随机
   		return new RandomRule_LF();//使用我们自己定义的IRule
   	}
   }
   
   
   
   ```





### Feign负载均衡

#### 概述

官网解释：
http://projects.spring.io/spring-cloud/spring-cloud.html#spring-cloud-feign

 Feign是一个声明式WebService客户端。使用Feign能让编写Web Service客户端更加简单, 它的使用方法是定义一个接口，然后在上面添加注解，同时也支持JAX-RS标准的注解。Feign也支持可拔插式的编码器和解码器。Spring Cloud对Feign进行了封装，使其支持了Spring MVC标准注解和HttpMessageConverters。Feign可以与Eureka和Ribbon组合使用以支持负载均衡。

 ![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190413221956.png)

 Feign是一个声明式的Web服务客户端，使得编写Web服务客户端变得非常容易，
==只需要创建一个接口，然后在上面添加注解即可==。
参考官网：https://github.com/OpenFeign/feign 

**Feign能干什么**
Feign旨在使编写Java Http客户端变得更容易。
前面在使用Ribbon+RestTemplate时，利用RestTemplate对http请求的封装处理，形成了一套模版化的调用方法。但是在实际开发中，由于对服务依赖的调用可能不止一处，==往往一个接口会被多处调用，所以通常都会针对每个微服务自行封装一些客户端类来包装这些依赖服务的调用。==所以，Feign在此基础上做了进一步封装，由他来帮助我们定义和实现依赖服务接口的定义。在Feign的实现下，==我们只需创建一个接口并使用注解的方式来配置它(以前是Dao接口上面标注Mapper注解,现在是一个微服务接口上面标注一个Feign注解即可)==，即可完成对服务提供方的接口绑定，简化了使用Spring cloud Ribbon时，自动封装服务调用客户端的开发量。

**Feign集成了Ribbon**
利用Ribbon维护了MicroServiceCloud-Dept的服务列表信息，并且通过轮询实现了客户端的负载均衡。而与Ribbon不同的是，==通过feign只需要定义服务绑定接口且以声明式的方法==，优雅而简单的实现了服务调用



#### 修改microservicecloud-api工程

添加feign的依赖：

```xml
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-feign</artifactId>
   </dependency>


```

新建DeptClientService接口并添加注解:**@FeignClient**

```java
package com.rabbit.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rabbit.springcloud.entities.Dept;
//通过microservicecloud-dept拿到provider服务
@FeignClient(value="microservicecloud-dept")
public interface DeptClientService {

	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept getById(@PathVariable("id") long id) ;
	
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list();
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(Dept dept);
}



```

maven install;

#### 新建microservicecloud-consumer-dept-feign

参考dept_80工程建。

添加对Feign的支持：

```xml
   <dependency>
       <groupId>org.springframework.cloud</groupId>
       <artifactId>spring-cloud-starter-feign</artifactId>
   </dependency>


```

编写Controller：添加API新建的DeptClientService接口

```java
@RestController
public class DeptController_Consumet_Feign {

	@Autowired
	private DeptClientService service;
	

	  @RequestMapping(value = "/consumer/dept/get/{id}")
	  public Dept get(@PathVariable("id") Long id)
	  {
	   return this.service.getById(id);
	  }
	 
	  @RequestMapping(value = "/consumer/dept/list")
	  public List<Dept> list()
	  {
	   return this.service.list();
	  }
	 
	  @RequestMapping(value = "/consumer/dept/add")
	  public Object add(Dept dept)
	  {
	   return this.service.add(dept);
	  }

}


```

启动eureka集群

启动provider

启动feign

测试：http://localhost/consumer/dept/list



**Feign自带负载均衡配置项**

#### 总结：

   ==Feign通过接口的方法调用Rest服务（之前是Ribbon+RestTemplate）==，
该请求发送给Eureka服务器（http://MICROSERVICECLOUD-DEPT/dept/list）,
通过Feign直接找到服务接口，由于在进行服务调用的时候融合了Ribbon技术，所以也支持负载均衡作用。







### Hystrix断路器

分布式系统面临的问题
==复杂分布式体系结构中的应用程序有数十个依赖关系，每个依赖关系在某些时候将不可避免地失败。==

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/分布式面临的问题.bmp)

**服务雪崩**
多个微服务之间调用的时候，假设微服务A调用微服务B和微服务C，微服务B和微服务C又调用其它的微服务，这就是所谓的“扇出”。如果扇出的链路上某个微服务的调用响应时间过长或者不可用，对微服务A的调用就会占用越来越多的系统资源，进而引起系统崩溃，所谓的“雪崩效应”.

对于高流量的应用来说，单一的后端依赖可能会导致所有服务器上的所有资源都在几秒钟内饱和。比失败更糟糕的是，这些应用程序还可能导致服务之间的延迟增加，备份队列，线程和其他系统资源紧张，导致整个系统发生更多的级联故障。这些都表示需要对故障和延迟进行隔离和管理，以便单个依赖关系的失败，不能取消整个应用程序或系统。

备注：一般情况对于服务依赖的保护主要有3中解决方案：

（1）熔断模式：这种模式主要是参考电路熔断，如果一条线路电压过高，保险丝会熔断，防止火灾。放到我们的系统中，如果某个目标服务调用慢或者有大量超时，此时，熔断该服务的调用，对于后续调用请求，不在继续调用目标服务，直接返回，快速释放资源。如果目标服务情况好转则恢复调用。

（2）隔离模式：这种模式就像对系统请求按类型划分成一个个小岛的一样，当某个小岛被火少光了，不会影响到其他的小岛。例如可以对不同类型的请求使用线程池来资源隔离，每种类型的请求互不影响，如果一种类型的请求线程资源耗尽，则对后续的该类型请求直接返回，不再调用后续资源。这种模式使用场景非常多，例如将一个服务拆开，对于重要的服务使用单独服务器来部署，再或者公司最近推广的多中心。

（3）限流模式：上述的熔断模式和隔离模式都属于出错后的容错处理机制，而限流模式则可以称为预防模式。限流模式主要是提前对各个类型的请求设置最高的QPS阈值，若高于设置的阈值则对该请求直接返回，不再调用后续资源。这种模式不能解决服务依赖的问题，只能解决系统整体资源分配问题，因为没有被限流的请求依然有可能造成雪崩效应。

 

#### Hystrix 是什么

Hystrix是一个用于处理分布式系统的**延迟**和**容错**的开源库，在分布式系统里，许多依赖不可避免的会调用失败，比如超时、异常等，Hystrix能够保证在一个依赖出问题的情况下，==不会导致整体服务失败，避免级联故障，以提高分布式系统的弹性。==

“断路器”本身是一种开关装置，当某个服务单元发生故障之后，通过断路器的故障监控（类似熔断保险丝），==向调用方返回一个符合预期的、可处理的备选响应（FallBack），而不是长时间的等待或者抛出调用方无法处理的异常==，这样就保证了服务调用方的线程不会被长时间、不必要地占用，从而避免了故障在分布式系统中的蔓延，乃至雪崩。

#### 作用

1. **服务降级**

   备注：Hystrix服务降级，其实就是线程池中单个线程障处理，防止单个线程请求时间太长，导致资源长期被占有而得不到释放，从而导致线程池被快速占用完，导致服务崩溃。
   Hystrix能解决如下问题：

   1. 请求超时降级，线程资源不足降级，降级之后可以返回自定义数据
   2. 线程池隔离降级，分布式服务可以针对不同的服务使用不同的线程池，从而互不影响
   3. 自动触发降级与恢复
   4. 实现请求缓存和请求合并

2. **服务熔断**

   备注：熔断模式：这种模式主要是参考电路熔断，如果一条线路电压过高，保险丝会熔断，防止火灾。放到我们的系统中，如果某个目标服务调用慢或者有大量超时，此时，熔断该服务的调用，对于后续调用请求，不在继续调用目标服务，直接返回，快速释放资源。如果目标服务情况好转则恢复调用。

3. **服务限流**

   备注：限流模式主要是提前对各个类型的请求设置最高的QPS阈值，若高于设置的阈值则对该请求直接返回，不再调用后续资源。这种模式不能解决服务依赖的问题，只能解决系统整体资源分配问题，因为没有被限流的请求依然有可能造成雪崩效应。

4. 实时监控



官网资料：https://github.com/Netflix/Hystrix/wiki/How-To-Use

总之：解决我们调微服务时因为服务故障而延迟整个程序。



#### 服务熔断

熔断机制是应对雪崩效应的一种微服务链路保护机制。
当扇出链路的某个微服务不可用或者响应时间太长时，会进行服务的降级，==进而熔断该节点微服务的调用，快速返回"错误"的响应信息==。当检测到该节点微服务调用响应正常后恢复调用链路。在SpringCloud框架里熔断机制通过Hystrix实现。Hystrix会监控微服务间调用的状况，当失败的调用到一定阈值，缺省是5秒内20次调用失败就会启动熔断机制。熔断机制的注解是**@HystrixCommand**。

##### 新建microservicecloud-provider-dept-hystrix-8001

参考8001工程新建工程

在pom工程中添加hystrix依赖

```xml
   <!--  hystrix -->
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-hystrix</artifactId>
   </dependency>


```

修改yml中的instance-id

```yml
server:
  port: 8001
  
mybatis:
  config-location: classpath:mybatis/mybatis.cfg.xml        # mybatis配置文件所在路径
  type-aliases-package: com.rabbit.springcloud.entities    # 所有Entity别名类所在包
  mapper-locations:
  - classpath:mybatis/mapper/**/*.xml                       # mapper映射文件
    
spring:
   application:
    name: microservicecloud-dept 
   datasource:
    type: com.alibaba.druid.pool.DruidDataSource            # 当前数据源操作类型
    driver-class-name: com.mysql.jdbc.Driver              # mysql驱动包
    url: jdbc:mysql://localhost:3306/cloudDB01?serverTimezone=GMT%2B8              # 数据库名称
    username: root
    password: admin
    dbcp2:
      min-idle: 5                                           # 数据库连接池的最小维持连接数
      initial-size: 5                                       # 初始化连接数
      max-total: 5                                          # 最大连接数
      max-wait-millis: 200                                  # 等待连接获取的最大超时时间
 
eureka:
  client: #客户端注册进eureka服务列表内
    service-url: 
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/ 
  instance:
    #自定义服务名称信息
    instance-id: microservicecloud-dept8001-hystrix
    prefer-ip-address: true

info:
  app.name: rabbit-microservicecloud
  company.name: www.rabbit.com
  build.artifactId: $project.artifactId$
  build.version: $project.version$


```

##### @HystrixCommand报异常后如何处理

一旦调用服务方法失败并抛出了错误信息后，会自动调用**@HystrixCommand**标注好的**fallbackMethod**调用类中的指定方法

```java
@RestController
public class DeptController {
	@Autowired
	private DeptService service = null;

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	//一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = this.service.get(id);
		if (null == dept) {
			throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
		}
		return dept;
	}
	public Dept processHystrix_Get(@PathVariable("id") Long id) {
		return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
				.setDb_source("no this database in MySQL");
	}
}


```

再在主启动类上添加注解：**@EnableCircuitBreaker**//对hystrixR熔断机制的支持

启动测试！![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190418154756.png)

#### 服务降级

##### 什么是服务降级

```
整体资源快不够了，忍痛将某些服务先关掉，待渡过难关，再开启回来。

```

服务降级处理是在客户端实现完成的，与服务端没有关系

**修改microservicecloud-api工程，**
**根据已经有的DeptClientService接口新建一个实现了**
**FallbackFactory接口的类DeptClientServiceFallbackFactory**

**千万不要忘记在类上面新增==@Component==注解，大坑！！！**

```java
@Component//一定要添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				return null;
			}
			@Override
			public Dept getById(long id) {
				 return new Dept().setDeptno(id)
			               .setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
			               .setDb_source("no this database in MySQL");
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}
}


```

修改DeptClientService的注解:在注解@FeignClient中添加fallbackFactory属性值

```java
@FeignClient(value="microservicecloud-dept",fallbackFactory=DeptClientServiceFallbackFactory.class)


```

然后install。

##### microservicecloud-consumer-dept-feign工程修改YML

```yml
server:
  port: 80

feign: 
  hystrix: 
    enabled: true

eureka:
  client:
    register-with-eureka: false
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
      


```

启动工程测试：

正常访问没问题。

故意关闭dept-8001服务

再访问：<http://localhost/consumer/dept/get/1>：如图所示

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/QQ截图20190418160641.png)

**此时服务端provider已经down了，但是我们做了服务降级处理，让客户端在服务端不可用时也会获得提示信息而不会挂起耗死服务器**





#### 服务监控hystrixDashboard

##### 概述

除了隔离依赖服务的调用以外，Hystrix还提供了==准实时的调用监控（Hystrix Dashboard）==，Hystrix会持续地记录所有通过Hystrix发起的请求的执行信息，并以统计报表和图形的形式展示给用户，包括每秒执行多少请求多少成功，多少失败等。Netflix通过hystrix-metrics-event-stream项目实现了对以上指标的监控。Spring Cloud也提供了Hystrix Dashboard的整合，对监控内容转化成可视化界面。



##### Case步骤

 新建工程microservicecloud-consumer-hystrix-dashboard

pom依赖：

```xml
<dependencies>
   <!-- 自己定义的api -->
   <dependency>
     <groupId>com.atguigu.springcloud</groupId>
     <artifactId>microservicecloud-api</artifactId>
     <version>${project.version}</version>
   </dependency>
   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-web</artifactId>
   </dependency>
   <!-- 修改后立即生效，热部署 -->
   <dependency>
     <groupId>org.springframework</groupId>
     <artifactId>springloaded</artifactId>
   </dependency>
   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-devtools</artifactId>
   </dependency>
   <!-- Ribbon相关 -->
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-eureka</artifactId>
   </dependency>
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-ribbon</artifactId>
   </dependency>
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-config</artifactId>
   </dependency>
   <!-- feign相关 -->
   <dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-feign</artifactId>
   </dependency>
   <!-- hystrix和 hystrix-dashboard相关-->
   <dependency>
       <groupId>org.springframework.cloud</groupId>
       <artifactId>spring-cloud-starter-hystrix</artifactId>
   </dependency>
   <dependency>
       <groupId>org.springframework.cloud</groupId>
       <artifactId>spring-cloud-starter-hystrix-dashboard</artifactId>
   </dependency> 
  </dependencies>


```

主启动类:**@EnableHystrixDashboard**

```java
@EnableHystrixDashboard
@SpringBootApplication
public class DeptConsumer_DashBoard_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
	}
}


```

所有provider都依赖：

```xml
   <!-- actuator监控信息完善 -->
   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-actuator</artifactId>
   </dependency>


```

启动microservicecloud-consumer-hystrix-dashboard该微服务监控消费端:http://localhost:9001/hystrix

启动3个eureka集群

启动microservicecloud-provider-dept-hystrix-8001

填写监控地址:

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/监控地址.bmp)

监控结果:

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/监控结果.png)

多次刷新：<http://localhost:8001/dept/get/1>查看监控图的变化

```shell
实心圆：共有两种含义。它通过颜色的变化代表了实例的健康程度，它的健康度从绿色<黄色<橙色<红色递减。
该实心圆除了颜色的变化之外，它的大小也会根据实例的请求流量发生变化，流量越大该实心圆就越大。所以通过该实心圆的展示，就可以在大量的实例中快速的发现==故障实例和高压力实例==。

曲线：用来记录2分钟内流量的相对变化，可以通过它来观察到流量的上升和下降趋势。


```



##### 如何看监控结果图:

![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/监控图信息.bmp)

### zuul路由网关

Zuul包含了对请求的路由和过滤两个最主要的功能：
其中路由功能负责将外部请求转发到具体的微服务实例上，是实现外部访问统一入口的基础而过滤器功能则负责对请求的处理过程进行干预，是实现请求校验、服务聚合等功能的基础.Zuul和Eureka进行整合，将Zuul自身注册为Eureka服务治理下的应用，同时从Eureka中获得其他微服务的消息，也即以后的访问微服务都是通过Zuul跳转后获得。

```powershell
注意：Zuul服务最终还是会注册进Eureka


```

提供=代理+路由+过滤三大功能

##### 能干嘛

1. 路由
2. 过滤

官方资料：https://github.com/Netflix/zuul/wiki/Getting-Started

##### 路由基本配置

1. 新建Module模块microservicecloud-zuul-gateway-9527

2. POM

   ```xml
       <dependencies>
      <!-- zuul路由网关 -->
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-zuul</artifactId>
      </dependency> 
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-eureka</artifactId>
      </dependency>
      <!-- actuator监控 -->
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
      </dependency>
      <!--  hystrix容错-->
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-hystrix</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-config</artifactId>
      </dependency>
      <!-- 日常标配 -->
      <dependency>
      	<groupId>com.rabbit.springcloud</groupId>
      	<artifactId>microservicecloud-api</artifactId>
      	<version>0.0.1-SNAPSHOT</version>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-jetty</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
      </dependency>
      <!-- 热部署插件 -->
      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>springloaded</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
      </dependency>
     </dependencies>
   
   
   ```

3. yml

   ```yml
   server:
     port: 9527
         
   spring:
      application:
       name: microservicecloud-zuul-gateway
   
   eureka:
     client: #客户端注册进eureka服务列表内
       service-url: 
         defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/ 
     instance:
       #自定义服务名称信息
       instance-id: gateway-9527.com
       prefer-ip-address: true
   zuul:
     prefix: /rabbit                               #设置统一公共前缀
     ignored-services: "*"      #设置原真实服务名忽略  单个具体，多个可以用"*"
     routes:             #路由访问映射
       mydept.serviceId: microservicecloud-dept
       mydept.path: /mydept/**
   
   info:
     app.name: rabbit-microservicecloud
     company.name: www.rabbit.com
     build.artifactId: $project.artifactId$
     build.version: $project.version$
   
   
   ```

   zuul的yml配置：

   ```yml
   zuul:
     prefix: /rabbit                               #设置统一公共前缀
     ignored-services: "*"      #设置原真实服务名忽略  单个具体，多个可以用"*"
     routes:             #路由访问映射
       mydept.serviceId: microservicecloud-dept
       mydept.path: /mydept/**
   
   
   ```

4. hosts修改:127.0.0.1  myzuul.com

5. 主启动类:@EnableZuulProxy

   ```java
   @SpringBootApplication
   @EnableZuulProxy
   public class Zuul_9527_StartSpringCloudApp {
   	public static void main(String[] args) {
   		SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
   	}
   
   }
   
   
   ```

6. 启动3个eureka集群，8001provider服务，路由

7. 使用路由访问：http://myzuul.com:9527/microservicecloud-dept/dept/get/2

##### 路由访问映射规则

1. zuul的yml配置：

   ```yml
   zuul:
     prefix: /rabbit                               #设置统一公共前缀
     ignored-services: "*"      #设置原真实服务名忽略  单个具体，多个可以用"*"
     routes:             #路由访问映射
       mydept.serviceId: microservicecloud-dept
       mydept.path: /mydept/**
   
   
   ```

   访问：<http://myzuul.com:9527/rabbit/mydept/dept/get/2>

### SpringCloud Config 分布式配置中心

##### 概述

1. 分布式系统面临的---配置问题

   微服务意味着要将单体应用中的业务拆分成一个个子服务，每个服务的粒度相对较小，因此系统中会出现大量的服务。由于每个服务都需要必要的配置信息才能运行，所以一套集中式的、动态的配置管理设施是必不可少的。SpringCloud提供了ConfigServer来解决这个问题，我们每一个微服务自己带着一个application.yml，上百个配置文件的管理

2. 是什么？

   ![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/图片.png)

   SpringCloud Config为微服务架构中的微服务提供集中化的外部配置支持，配置服务器为==各个不同微服务应用==的所有环境提供了一个==中心化的外部配置。==

3. 怎么用？

   SpringCloud Config分为==服务端和客户端两部分==。

   

   服务端也称为==分布式配置中心，它是一个独立的微服务应用==，用来连接配置服务器并为客户端提供获取配置信息，加密/解密信息等访问接口

   

   客户端则是通过指定的配置中心来管理应用资源，以及与业务相关的配置内容，并在启动的时候从配置中心获取和加载配置信息配置服务器默认采用git来存储配置信息，这样就有助于对环境配置进行版本管理，并且可以通过git客户端工具来方便的管理和访问配置内容。

###### 作用

1. 集中管理配置文件
2. 不同环境不同配置，动态化的配置更新，分环境部署比如dev/test/prod/beta/release
3. 运行期间动态调整配置，不再需要在每个服务部署的机器上编写配置文件，服务会向配置中心统一拉取配置自己的信息
4. 当配置发生变动时，服务不需要重启即可感知到配置的变化并应用新的配置
5. 将配置信息以REST接口的形式暴露

###### 与GitHub整合配置

```
由于SpringCloud Config默认使用Git来存储配置文件(也有其它方式,比如支持SVN和本地文件)，
但最推荐的还是Git，而且使用的是http/https访问的形式

```

#### SpringCloud Config服务端配置

1. 在git新建一个名为**microservicecloud-config** 的Repository

2. 使用git地址clone到本地

   ```shell
   git clone + 地址
   
   
   ```

3. 在本地microservicecloud-config文件夹中创建一个application.yml文件(**UTF-8格式**)

   ```yml
   spring:
     profiles:
       active:
       - dev
   ---
   spring:
     profiles: dev     #开发环境
     application: 
       name: microservicecloud-config-rabbit-dev
   ---
   spring:
     profiles: test   #测试环境
     application: 
       name: microservicecloud-config-rabbit-test
   #  请保存为UTF-8格式
    
   
   
   ```

4. 推送到github上面

   ```shell
   git add .
   git commit -m "init yml"
   git push origin master
   
   
   ```

5. 新建Module模块microservicecloud-config-3344
   它即为Cloud的配置中心模块

   pom文件：

   ```xml
   	<dependencies>
   		<!-- springCloud Config -->
   		<dependency>
   			<groupId>org.springframework.cloud</groupId>
   			<artifactId>spring-cloud-config-server</artifactId>
   		</dependency>
   		<!-- 避免Config的Git插件报错：org/eclipse/jgit/api/TransportConfigCallback -->
   		<dependency>
   			<groupId>org.eclipse.jgit</groupId>
   			<artifactId>org.eclipse.jgit</artifactId>
   			<version>4.10.0.201712302008-r</version>
   		</dependency>
   		<!-- 图形化监控 -->
   		<dependency>
   			<groupId>org.springframework.boot</groupId>
   			<artifactId>spring-boot-starter-actuator</artifactId>
   		</dependency>
   		<!-- 熔断 -->
   		<dependency>
   			<groupId>org.springframework.cloud</groupId>
   			<artifactId>spring-cloud-starter-hystrix</artifactId>
   		</dependency>
   		<dependency>
   			<groupId>org.springframework.cloud</groupId>
   			<artifactId>spring-cloud-starter-eureka</artifactId>
   		</dependency>
   		<dependency>
   			<groupId>org.springframework.cloud</groupId>
   			<artifactId>spring-cloud-starter-config</artifactId>
   		</dependency>
   		<dependency>
   			<groupId>org.springframework.boot</groupId>
   			<artifactId>spring-boot-starter-jetty</artifactId>
   		</dependency>
   		<dependency>
   			<groupId>org.springframework.boot</groupId>
   			<artifactId>spring-boot-starter-web</artifactId>
   		</dependency>
   		<dependency>
   			<groupId>org.springframework.boot</groupId>
   			<artifactId>spring-boot-starter-test</artifactId>
   		</dependency>
   		<!-- 热部署插件 -->
   		<dependency>
   			<groupId>org.springframework</groupId>
   			<artifactId>springloaded</artifactId>
   		</dependency>
   		<dependency>
   			<groupId>org.springframework.boot</groupId>
   			<artifactId>spring-boot-devtools</artifactId>
   		</dependency>
   	</dependencies>
   
   
   ```

   yml文件：

   ```yml
   server: 
     port: 3344 
     
   spring:
     application:
       name:  microservicecloud-config
     cloud:
       config:
         server:
           git:
             uri: https://github.com/670490334/microservicecloud-config.git #GitHub上面的git仓库名字
   
   
   ```

6. 主启动类加上注解：**@EnableConfigServer**

   ```java
   package com.rabbit.springclound;
   
   import org.springframework.boot.SpringApplication;
   import org.springframework.boot.autoconfigure.SpringBootApplication;
   import org.springframework.cloud.config.server.EnableConfigServer;
   //Config的Server
   @EnableConfigServer
   @SpringBootApplication
   public class SpringCloud_Config_App {
   
   	public static void main(String[] args) {
   		SpringApplication.run(SpringCloud_Config_App.class, args);
   	}
   }
   
   
   
   ```

7. 修改host文件映射：**127.0.0.1  config-3344.com**

8. 测试通过Config微服务是否可以从GitHub上获取配置内容

   ```shell
   启动微服务3344
   http://config-3344.com:3344/application-dev.yml
   http://config-3344.com:3344/application-dev.yml
   http://config-3344.com:3344/application-dev.yml
   
   
   ```

9. 配置读取规则

   ![rabbit](https://github.com/670490334/SpringCloud-Study-notes/blob/master/images/读取规则.bmp)

   /{application}-{profile}.yml:

   ```shell
   http://config-3344.com:3344/application-dev.yml
   http://config-3344.com:3344/application-dev.yml
   http://config-3344.com:3344/application-dev.yml
   
   
   ```

   /{application}/{profile}[/{label}]

   ```shell
   http://config-3344.com:3344/application/dev/master
   http://config-3344.com:3344/application/test/master
   http://config-3344.com:3344/application/xxx/master
   
   
   ```

   /{label}/{application}-{profile}.yml

   ```shell
   http://config-3344.com:3344/master/application-dev.yml
   http://config-3344.com:3344/master/application-test.yml
   
   
   ```

10. ==成功实现了用SpringCloud Config通过GitHub获取配置信息==



#### SpringCloud Config客户端配置与测试

1. 在本地D:\44\mySpringCloud\microservicecloud-config路径下新建文件
   microservicecloud-config-client.yml

2. microservicecloud-config-client.yml内容:

   ```yml
   spring:
     profiles:
       active:
       - dev
   ---
   server: 
     port: 8201 
   spring:
     profiles: dev
     application: 
       name: microservicecloud-config-client
   eureka: 
     client: 
       service-url: 
         defaultZone: http://eureka-dev.com:7001/eureka/   
   ---
   server: 
     port: 8202 
   spring:
     profiles: test
     application: 
       name: microservicecloud-config-client
   eureka: 
     client: 
       service-url: 
         defaultZone: http://eureka-test.com:7001/eureka/
    
   
   
   
   
   ```

3. 将上一步提交到GitHub中

4. 新建microservicecloud-config-client-3355

5. POM:

   ```xml
    <dependencies>
      <!-- SpringCloud Config客户端 -->
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-config</artifactId>
      </dependency> 
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-hystrix</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-eureka</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-config</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-jetty</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
      </dependency> 
      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>springloaded</artifactId>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
      </dependency>
     </dependencies> 
   
   
   
   ```

6. ==bootstrap.yml==

   applicaiton.yml是用户级的资源配置项
   **bootstrap.yml**是系统级的，优先级更加高

   Spring Cloud会创建一个`Bootstrap Context`，作为Spring应用的`Application Context`的父上下文。初始化的时候，`Bootstrap Context`负责从外部源加载配置属性并解析配置。这两个上下文共享一个从外部获取的`Environment`。`Bootstrap`属性有高优先级，默认情况下，它们不会被本地配置覆盖。 `Bootstrap context`和`Application Context`有着不同的约定，
   所以新增了一个`bootstrap.yml`文件，保证`Bootstrap Context`和`Application Context`配置的分离。

   ```yml
   spring:
     cloud:
       config:
         name: microservicecloud-config-client #需要从github上读取的资源名称，注意没有yml后缀名
         profile: dev   #本次访问的配置项
         label: master   
         uri: http://config-3344.com:3344  #本微服务启动后先去找3344号服务，通过SpringCloudConfig获取GitHub的服务地址
   
   
   ```

7. application.yml

   ```yml
   spring:
     application:
       name: microservicecloud-config-client
   
   
   ```

8. windows下修改hosts文件，增加映射

   ```shell
   127.0.0.1  client-config.com
   
   
   ```

9. 新建rest类，验证是否能从GitHub上读取配置

   ```java
   @RestController
   public class Rest {
   
   	@Value("${spring.application.name}")
   	private String applicationName;
   
   	@Value("${eureka.client.service-url.defaultZone}")
   	private String eurekaServers;
   
   	@Value("${server.port}")
   	private String port;
   
   	@RequestMapping("/config")
   	public String getConfig() {
   		String str = "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
   		System.out.println("******str: " + str);
   		return "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
   	}
   
   }
   
   
   ```

10. 主启动类:

    ```java
    @SpringBootApplication
    public class ConfigClient_3355_StartSpringCloudApp {
    
    	public static void main(String[] args) {
    		SpringApplication.run(ConfigClient_3355_StartSpringCloudApp.class, args);
    	}
    }
    
    
    
    ```

11. 启动Config配置中心3344微服务并自测：http://config-3344.com:3344/application-dev.yml

12. 启动3355作为Client准备访问

13. bootstrap.yml里面的profile值是什么，决定从github上读取什么

    - 假如目前是 profile: dev		：dev默认在github上对应的端口就是8201 。访问地址:http://client-config.com:8201/config
    - 假如目前是 profile: test       ：test默认在github上对应的端口就是8202。访问地址http://client-config.com:8202/config

14. ==成功实现了客户端3355访问SpringCloud Config3344通过GitHub获取配置信息==





#### SpringCloud Config配置实战

##### 目前情况

1. Config服务端配置配置OK且测试通过，我们可以和config+GitHub进行配置修改并获得内容
2. 此时我们做一个eureka服务+一个Dept访问的微服务，将两个微服务的配置统一由于github获得实现统一配置分布式管理，完成多环境的变更





##### 步骤

1. Git配置文件本地配置

   - 在本地Repository新建文件microservicecloud-config-eureka-client.yml

     ```yml
     spring: 
       profiles: 
         active: 
         - dev
     ---
     server: 
       port: 7001 #注册中心占用7001端口,冒号后面必须要有空格
        
     spring: 
       profiles: dev
       application:
         name: microservicecloud-config-eureka-client
         
     eureka: 
       instance: 
         hostname: eureka7001.com #冒号后面必须要有空格
       client: 
         register-with-eureka: false #当前的eureka-server自己不注册进服务列表中
         fetch-registry: false #不通过eureka获取注册信息
         service-url: 
           defaultZone: http://eureka7001.com:7001/eureka/
     ---
     server: 
       port: 7001 #注册中心占用7001端口,冒号后面必须要有空格
        
     spring: 
       profiles: test
       application:
         name: microservicecloud-config-eureka-client
         
     eureka: 
       instance: 
         hostname: eureka7001.com #冒号后面必须要有空格
       client: 
         register-with-eureka: false #当前的eureka-server自己不注册进服务列表中
         fetch-registry: false #不通过eureka获取注册信息
         service-url: 
           defaultZone: http://eureka7001.com:7001/eureka/
     
     
     ```

   - 新建microservicecloud-config-dept-client.yml

     ```yml
     spring: 
       profiles:
         active:
         - dev
     --- 
     server:
       port: 8001
     spring: 
        profiles: dev
        application: 
         name: microservicecloud-config-dept-client
        datasource:
         type: com.alibaba.druid.pool.DruidDataSource
         driver-class-name: com.mysql.jdbc.Driver
         url: jdbc:mysql://localhost:3306/cloudDB01?serverTimezone=GMT%2B8
         username: root
         password: admin
         dbcp2:
           min-idle: 5
           initial-size: 5
           max-total: 5
           max-wait-millis: 200 
     mybatis:
       config-location: classpath:mybatis/mybatis.cfg.xml
       type-aliases-package: com.rabbit.springcloud.entities
       mapper-locations:
       - classpath:mybatis/mapper/**/*.xml
      
     eureka: 
       client: #客户端注册进eureka服务列表内
         service-url: 
           defaultZone: http://eureka7001.com:7001/eureka
       instance:
         instance-id: dept-8001.com
         prefer-ip-address: true
      
     info:
       app.name: rabbit-microservicecloud-springcloudconfig01
       company.name: www.rabbit.com
       build.artifactId: $project.artifactId$
       build.version: $project.version$
     ---
     server:
       port: 8001
     spring: 
        profiles: test
        application: 
         name: microservicecloud-config-dept-client
        datasource:
         type: com.alibaba.druid.pool.DruidDataSource
         driver-class-name: com.mysql.jdbc.Driver
         url: jdbc:mysql://localhost:3306/cloudDB02?serverTimezone=GMT%2B8
         username: root
         password: admin
         dbcp2:
           min-idle: 5
           initial-size: 5
           max-total: 5
           max-wait-millis: 200  
       
       
     mybatis:
       config-location: classpath:mybatis/mybatis.cfg.xml
       type-aliases-package: com.rabbit.springcloud.entities
       mapper-locations:
       - classpath:mybatis/mapper/**/*.xml
      
     eureka: 
       client: #客户端注册进eureka服务列表内
         service-url: 
           defaultZone: http://eureka7001.com:7001/eureka
       instance:
         instance-id: dept-8001.com
         prefer-ip-address: true
      
     info:
       app.name: rabbit-microservicecloud-springcloudconfig02
       company.name: www.rabbit.com
       build.artifactId: $project.artifactId$
       build.version: $project.version$
     
     
     
     
     ```

2. Config版的eureka服务端

   - 新建工程microservicecloud-config-eureka-client-7001

   - pom.xml

     ```xml
     <dependencies>
         <!-- SpringCloudConfig配置 -->
         <dependency>
          <groupId>org.springframework.cloud</groupId>
          <artifactId>spring-cloud-starter-config</artifactId>
         </dependency> 
         <dependency>
          <groupId>org.springframework.cloud</groupId>
          <artifactId>spring-cloud-starter-eureka-server</artifactId>
         </dependency>
         <!-- 热部署插件 -->
         <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>springloaded</artifactId>
         </dependency>
         <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-devtools</artifactId>
         </dependency>   
       </dependencies>
     
     
     
     ```

   - bootstrap.yml:

     ```yml
     spring: 
       cloud: 
         config: 
           name: microservicecloud-config-eureka-client     #需要从github上读取的资源名称，注意没有yml后缀名
           profile: dev 
           label: master 
           uri: http://config-3344.com:3344      #SpringCloudConfig获取的服务地址
     
     
     
     
     ```

   - application.yml

     ```yml
     spring:
       application:
         name: microservicecloud-config-eureka-client
     
     
     
     
     ```

   - 主启动类

     ```java
     import org.springframework.boot.SpringApplication;
     import org.springframework.boot.autoconfigure.SpringBootApplication;
     import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
     /**
      * EurekaServer服务器端启动类,接受其它微服务注册进来
      * @author Admin
      *
      */
     @EnableEurekaServer
     @SpringBootApplication
     public class Config_Git_EurekaServerApplication {
     
     	public static void main(String[] args) {
     		SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
     	}
     }
     
     
     ```

3. Config版的dept微服务

   - 参考之前的8001拷贝后新建工程microservicecloud-config-dept-client-8001

   - 把之前microservicecloud-config-dept-client-8001的包跟类都拷贝过来，mybatis文件也拷贝过来

   - pom

   - bootstrap.yml

     ```yml
     spring:
       cloud:
         config:
           name: microservicecloud-config-dept-client #需要从github上读取的资源名称，注意没有yml后缀名
           #profile配置是什么就取什么配置dev or test
           profile: dev
           #profile: test
           label: master
           uri: http://config-3344.com:3344  #SpringCloudConfig获取的服务地址
     
     
     ```

   - application.yml

     ```yml
     spring:
       application:
         name: microservicecloud-config-dept-client
     
     
     ```

   - 启动测试访问：

     ```shell
     根据bootstarp里面的profile的值区分访问
     访问地址：http://localhost:8001/dept/list
     
     
     ```

     

### 内容技术梳理与架构

1. 整套开发技术栈以SpringCloud为主，单个微服务模块以SpringMVC+SpringBoot/Spring+MyBatis组合进行开发
2. 前端层，页面H5+thymeleaf/样式CSS3+Bootstrap/前端框架JQuery+Node|Vue等
3. 负载层，前端访问通过Http或Https协议到达服务端的LB，可以是F5等硬件做负载均衡，还可以自行部署LVS+Keepalived等（前期量小可以直接使用Nginx） 
4. 网关层，请求通过LB后，会到达整个微服务体系的网关层Zuul（Gateway），内嵌Ribbon做客户端负载均衡，Hystrix做熔断降级等
5. 服务注册，采用Eureka来做服务治理，Zuul会从Eureka集群获取已发布的微服务访问地址，然后根据配置把请求代理到相应的微服务去
6. docker容器，所有的微服务模块都部署在Docker容器里面，而且前后端的服务完全分开，各自独立部署后前端微服务调用后端微服务，后端微服务之间会有相互调用
7. 服务调用，微服务模块间调用都采用标准的Http/Https+REST+JSON的方式，调用技术采用Feign+HttpClient+Ribbon+Hystrix
8. 统一配置，每个微服务模块会跟Eureka集群、配置中心（SpringCloudConfig）等进行交互
9. 第3方框架，每个微服务模块根据实现的需要，通常还需要使用一些第三发框架，比如常见的有：缓存服务（Redis）、图片服务（FastDFS）、搜索服务（ElasticSearch）、安全管理（Shiro）等等
10. Mysql数据库，可以按照微服务模块进行拆分，统一访问公共库或者单独自己库，可以单独构建MySQL集群或者分库分表MyCat等