package com.itheima;

/**
 * ��дһ�����Ի�ȡ�ļ���չ���ĺ������βν���һ���ļ����ַ���������һ����չ���ַ�����
 * 
 * @author one
 * 
 */

public class Test8 {
	public static void main(String[] args) {
		String fileName = "test.fake_extension_name.java.txt";
		System.out.println("�ļ�����" + fileName); // ����ļ���
		String extensionName = getExtensionName(fileName); // ��ȡ�ļ���չ��
		System.out.println("��չ����" + extensionName); // �����չ��
	}

	/**
	 * ���Ի�ȡ�ļ���չ���ĺ���
	 * ʹ���������ʽ��.*\.��ƥ��ֱ�����һ����֮ǰ����������㣩�������ַ�����
	 * ���滻Ϊ���ַ�������ɾ������չ������������ַ���������չ��
	 * 
	 * @param fileName
	 * @return extensionName
	 */
	private static String getExtensionName(String fileName) {
		return fileName.replaceAll(".*\\.", "");
	}
}