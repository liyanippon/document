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
		rootElement.setAttribute("comment", "个人信息");

		rootElement.addContent((Content) (new Element("姓名").addContent("whp")));
		rootElement.addContent((Content) (new Element("年龄").addContent("25")));
		rootElement.addContent((Content) (new Element("工作经验")
				.addContent((Content) (new Element("公司")
						.addContent("大连信开数码软件有限公司")))));
		Format format = Format.getRawFormat();
		format.setEncoding("utf-8");
		format.setIndent("  ");
		// stylesheet
		XMLOutputter xmlout = new XMLOutputter(format);
		try {
			xmlout.output(myDocument, System.out);
			// xmlout.output(myDocument, new FileOutputStream(
			// "src/com/xinxi_Action/struts/jdom/成功.xml"));
			xmlout.output(myDocument, new FileOutputStream(
					"WebRoot/web/jdom/OK.xml"));
			// 返回指定名字的子节点,如果同一级有多个同名子节点，则只返回第一个；如果没有返回null值。
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
		// System.out.println("目录树:" + str1);
		// 删除元素
		// root.removeChild("sex");// 删除元素
		// root.removeChild(root.getChild("contract").getChildText("telephone"));
		// 添加元素
		Element inputElement = root.getChild("工作经验");

		inputElement
				.addContent((Content) (new Element("部门").addContent("国际部")));
		inputElement.addContent(new Element("email").setAttribute("value",
				"wang_830608@163.com"));

		Format format = Format.getPrettyFormat();// getCompactFormat();
		format.setEncoding("utf-8");
		format.setIndent("  ");
		XMLOutputter xmlout = new XMLOutputter(format);
		// xmlout.output(doc, new FileOutputStream(
		// "src/com/xinxi_Action/struts/jdom/成功.xml"));
		xmlout.output(doc, new FileOutputStream("WebRoot/web/jdom/OK.xml"));
		String outStr = xmlout.outputString(root);
		System.out.println(outStr);
	}

	public static void main(String[] args) {
		try {
			Insert insert = new Insert();
			System.out.println("xml数据开始");
			insert.InsertXMLDoc();
			System.out.println("xml数据结束");
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
