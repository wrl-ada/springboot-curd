# springboot-curd
## 使用jpa操作数据库
GirlRespority.java
1. interface GirlRespority extends JpaRespority<Girl,Integer>{}
## 使用mybatis操作数据库
UserDao.java
1. @Insert( "insert into t_user(id,name,age) values(#{id},#{name},#{age})" )
2. void addUser(User user);
## 事务控制
Service层使用@Transactional注解
## 备注
mysql表存储引擎MyISAM，不支持事务回滚，必须为设置为InnoDB
