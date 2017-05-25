package com.ggr.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.annotation.Resource;

/**
 * Created by GuiRunning on 2017/5/23.
 */
public class CommonDaoImpl<T> extends HibernateDaoSupport implements IcommonDao<T> {

    /**
     * spring容器中定义
     * <bean id="commonDao" class="cn.itcast.elec.dao.impl.CommonDaoImpl">
     <property name="sessionFactory" ref="sessionFactory"></property>
     </bean>
     */

    @Resource(name="sessionFactory")
    public final void setSessionFactoryDi(SessionFactory sessionFactory) {
       this.setSessionFactory(sessionFactory);
    }

    /**保存*/
    public void save(T entity) {
        this.getHibernateTemplate().save(entity);
    }
}
