###项目开发过程中的保错及解决方案
1. 在配置bean.xml的注解事务时，
一直报org.hibernate.service.UnknownUnwrapTypeException: Cannot unwrap to requeste 

    **解决:** 直接引入sessionFactory的时候并没有将dataSources和sessionFactory之间
    建立事务关联所致。
    解决方法就是将dataSources手动配置到事务管理的bean中去。
    
> <!-- datasource,这里的话一定要手动将datesources交给事务管理bean(transactionManager)管理，否者会报错 -->
      <bean id="datasource" class="com.mchange.v2.c3p0.ComboPooledDataSource" destroy-method="close">
          <property name="driverClass" value="com.mysql.jdbc.Driver"/>
          <property name="jdbcUrl" value="jdbc:mysql://localhost:3306/itcast1115elec?useUnicode=true&amp;characterEncoding=utf8" />
          <property name="user" value="root" />
          <property name="password" value="362427gg"/>
      </bean>
  
      <!-- 4:创建事务管理器 -->
      <!-- 配置事务管理器 -->
      <bean id="transactionManager"
            class="org.springframework.orm.hibernate4.HibernateTransactionManager">
          <property name="sessionFactory" ref="sessionFactory" />
          <property name="dataSource" ref="datasource"></property>
      </bean>
>---
2. 调试过程中配置没有任何问题的情况下,报错could not get database metadata,Connections could not be acquired from the underlying database!
    
   **解决:** 这种错误通常是数据库配置文件有问题所致，排查过程如下
  
  - 驱动配置有误：driver=com.mysql.jdbc.Driver
  
  - 数据库连接地址有误：url=jdbc:mysql://localhost:3306/test?3useUnicode=true&characterEncoding=utf8
 
  - 密码或帐号有误：username=root
                password=你的密码
  
  - 数据库未启动或无权访问
 
  - 项目未引入对应的驱动jar包mysql-connector-java-5.1.6-bin.jar
      mysql root没有远程访问的权限，需要增加权限，增加权限的步骤如下：
       进入mysql数据库：
       grant all privileges on *.* to 'root'@'%' identified by 'root' with grant option;flush privileges;


note:检查发现原来是我写db.properties时,root后面多了个空格,真的好气，不过学习了一下也不亏。还好我地IDEA在多出的空格都标黄了，不然真的很难找到


 
3.框架基本搭建完成后发现一直加载不到web.xml文件
原因:使用maven创建项目时选错了模板。导致此项目成为一个java项目而不是web项目,前期
由于测试都不涉及到web层，所以没发现目录结构的问题

解决方案:
     重构项目结构,并将文件全部复制过来便可。
     

  
  