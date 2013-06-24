package cn.com.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {
		try {
			// 用xxx.hbm.xml形式配置实体映射
			// sessionFactory = new
			// Configuration().configure().buildSessionFactory();
			// 用Annotation形式配置实体映射
			// sessionFactory = new AnnotationConfiguration().configure()
			// .buildSessionFactory();
			Configuration configuration = new Configuration();
			configuration.configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}