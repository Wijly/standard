package com.xml;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			
			// Dom Document 객체를 생성하기위한 팩토리 생성
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder parser = f.newDocumentBuilder();
			
			Document xmlDoc = null;
			
			String url = "book.xml";
			
			if(url.indexOf("http://")!= -1) {
			
				URL u = new URL(url);
				InputStream is = u.openStream();
				xmlDoc = parser.parse(is);
				
				
			}else {
			
				xmlDoc = parser.parse(url);
				
			}
			
			//Element : xml 문서의 요소를 표현하기위해 사용
			Element root = xmlDoc.getDocumentElement();
			
			System.out.println(root.getTagName()); 		// booklist
			
			//첫번째 book
			// Node : 각 요소를 읽고쓰기위해 사용
			Node book1 = root.getElementsByTagName("book").item(0);
			System.out.println(((Element)book1).getAttribute("kind"));
			
			Node title = book1.getFirstChild();
			Node title1 = title.getNextSibling();
			System.out.println(title1.getNodeName());	// title
			
			Node title1_1 = title1.getFirstChild();		//출력
			System.out.println(title1_1.getNodeValue());
			
			//\=-=-=-=-=-=-=-------------------------------------------------------
			NodeList books = root.getElementsByTagName("book");
			
			String out ="";
			String str;
			
			for(int i=0; i<books.getLength();i++) {
				Node book = books.item(i);
				str = book.getNodeName();
				
				out += "노드명 : " + str;
				
				NamedNodeMap bookMap = book.getAttributes();
				str = bookMap.getNamedItem("kind").getNodeValue();
				
				out += ", kind: " + str;
				
				NodeList elementList = book.getChildNodes();
				
				for(int j=0;j<elementList.getLength();j++) {
					
					Node e = elementList.item(j);
					
					str = "";
					
					if(e.getNodeType() == Node.ELEMENT_NODE) {
						str = ", " + e.getNodeName();
						
						out += str + " : ";
						out += e.getChildNodes().item(0).getNodeValue();
					}
				}
				out += "\n";
			}
			
			System.out.println(out);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
