package com.xinxi_Action.struts.jdom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom.Content;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.ProcessingInstruction;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class Insert {

	public void InsertXMLDoc() throws IOException, JDOMException {

//		ProcessingInstruction pi = new ProcessingInstruction("xml-stylesheet",
//				"href=\"user.xsl\" type=\"text/xsl\"");
		Document myDocument = new Document();
//		myDocument.addContent(pi);

		Element rootElement = new Element("MyInfo");
		myDocument.addContent(rootElement);
		rootElement.setAttribute("comment", "������Ϣ");

		rootElement.addContent((Content) (new Element("����").addContent("whp")));
		rootElement.addContent((Content) (new Element("����").addContent("25")));
		rootElement.addContent((Content) (new Element("��������")
				.addContent((Content) (new Element("��˾")
						.addContent("�����ſ�����������޹�˾")))));
		Format format = Format.getRawFormat();
		format.setEncoding("utf-8");
		format.setIndent("  ");
		// stylesheet
		XMLOutputter xmlout = new XMLOutputter(format);
		try {
			xmlout.output(myDocument, System.out);
			// xmlout.output(myDocument, new FileOutputStream(
			// "src/com/xinxi_Action/struts/jdom/�ɹ�.xml"));
			xmlout.output(myDocument, new FileOutputStream(
					"WebRoot/web/jdom/OK.xml"));
			// ����ָ�����ֵ��ӽڵ�,���ͬһ���ж��ͬ���ӽڵ㣬��ֻ���ص�һ�������û�з���nullֵ��
			// xmlout.output(rootElement.getChild("sex"), System.out);
			// String outString=xmlout.outputString(myDocument);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void UpdateXMLDoc() throws IOException, JDOMException {
		SAXBuilder saxbuider = new SAXBuilder();
		Document doc = saxbuider.build(new File("WebRoot/web/jdom/OK.xml"));
		Element root = doc.getRootElement();
		// String str1 = root.getAttributeValue("comment");
		// System.out.println("Ŀ¼��:" + str1);
		// ɾ��Ԫ��
		// root.removeChild("sex");// ɾ��Ԫ��
		// root.removeChild(root.getChild("contract").getChildText("telephone"));
		// ���Ԫ��
		Element inputElement = root.getChild("��������");

		inputElement
				.addContent((Content) (new Element("����").addContent("���ʲ�")));
		inputElement.addContent(new Element("email").setAttribute("value",
				"wang_830608@163.com"));

		Format format = Format.getPrettyFormat();// getCompactFormat();
		format.setEncoding("utf-8");
		format.setIndent("  ");
		XMLOutputter xmlout = new XMLOutputter(format);
		// xmlout.output(doc, new FileOutputStream(
		// "src/com/xinxi_Action/struts/jdom/�ɹ�.xml"));
		xmlout.output(doc, new FileOutputStream("WebRoot/web/jdom/OK.xml"));
		String outStr = xmlout.outputString(root);
		System.out.println(outStr);
	}

	public static void main(String[] args) {
		try {
			Insert insert = new Insert();
			System.out.println("xml���ݿ�ʼ");
			insert.InsertXMLDoc();
			System.out.println("xml���ݽ���");
			System.out.println("--------------------");
			// //////////////////////////////
			insert.UpdateXMLDoc();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		}
	}

}
