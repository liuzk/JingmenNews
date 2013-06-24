package cn.com.test;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

/**
 * ����AbstractTransactionalSpringContextTests�ĳ��������
 * 
 * �̳д��࣬ĳ�����Է�����Ҫ����ع�ʱ��ֱ���ڷ���ǰ��@Rollback(true)����
 * 
 * @author Bruce Qin 2010.10.11
 */
public abstract class AbstractServiceTests extends
		AbstractTransactionalDataSourceSpringContextTests {

	// ��Ŀclasspath·��
	String applicationContextFile = "classpath:applicationContext-common.xml";

	/**
	 * �޲ι��캯��
	 */
	public AbstractServiceTests() {
		super();
	}

	/**
	 * �вι��캯��
	 * 
	 * @param name
	 */
	public AbstractServiceTests(String name) {
		super(name);
	}

	/**
	 * ��Ҫ���ص������ļ���ַ�б�
	 * 
	 * @return new String[] { applicationContextFile };
	 */
	abstract String[] getOtherConfigs();

	/**
	 * ���ǵĻ�ȡ�����ļ���ַ�ķ���
	 */
	protected String[] getConfigLocations() {
		String[] otherConfigs = getOtherConfigs();
		// ���������ļ��б�
		String[] configFiles = new String[otherConfigs.length + 1];
		configFiles[0] = applicationContextFile;

		/**
		 * public static void arraycopy(Object src, int srcPos, Object dest, int
		 * destPos, int length) Դ������λ���� srcPos��srcPos+length-1 ֮����������
		 * ���Ƶ�Ŀ�������е� destPos �� destPos+length-1 λ�á�
		 */
		System.arraycopy(otherConfigs, 0, configFiles, 1, otherConfigs.length);
		return configFiles;
	}
}