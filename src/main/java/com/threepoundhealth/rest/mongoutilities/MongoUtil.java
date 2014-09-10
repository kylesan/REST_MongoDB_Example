package com.threepoundhealth.rest.mongoutilities;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.mongodb.Mongo;

public class MongoUtil {

	private final static Logger logger = LoggerFactory.getLogger(MongoUtil.class);
	private static Mongo mongo = null;
	
	 
	
	public static Mongo getMongo() {
		String host = null;
		int port = 0;
		
		try {
			  //Parse data from MongoConfig.xml
			
			  File file = new File("src/main/resources/MongoConfig.xml");
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  Document doc = db.parse(file);
			  doc.getDocumentElement().normalize();
			  NodeList nodeLst = doc.getElementsByTagName("mongoconfig");
			  
			  //Get the host value
			  
			  Node fstNode1 = nodeLst.item(0);
			  Element fstElmnt1 = (Element) fstNode1;
			  NodeList fstNmElmntLst1 = fstElmnt1.getElementsByTagName("host");
			  Element fstNmElmnt1 = (Element) fstNmElmntLst1.item(0);
			  NodeList fstNm1 = fstNmElmnt1.getChildNodes();
			  host = ((Node) fstNm1.item(0)).getNodeValue();
			  
			  //Get the port value
			  
			  Node fstNode2 = nodeLst.item(0);
			  Element fstElmnt2 = (Element) fstNode2;
			  NodeList fstNmElmntLst2 = fstElmnt2.getElementsByTagName("port");
			  Element fstNmElmnt2 = (Element) fstNmElmntLst2.item(0);
			  NodeList fstNm2 = fstNmElmnt2.getChildNodes();
			  port = Integer.parseInt(((Node) fstNm2.item(0)).getNodeValue());
			  
			  
			  
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		
		if (mongo == null) {
			try {
				mongo = new Mongo(host, port);
				logger.debug("New Mongo created with [" + host + "] and ["
						+ port + "]");

			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return mongo;
	}
	
	//Get the DB name
	
	public static String getDB(){
		String DB = null;
		try {
			  File file = new File("src/main/resources/MongoConfig.xml");
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  Document doc = db.parse(file);
			  doc.getDocumentElement().normalize();
			  NodeList nodeLst = doc.getElementsByTagName("mongoconfig");
			  
			  Node fstNode3 = nodeLst.item(0);
			  Element fstElmnt3 = (Element) fstNode3;
			  NodeList fstNmElmntLst3 = fstElmnt3.getElementsByTagName("DB");
			  Element fstNmElmnt3 = (Element) fstNmElmntLst3.item(0);
			  NodeList fstNm3 = fstNmElmnt3.getChildNodes();
			  DB = ((Node) fstNm3.item(0)).getNodeValue();
		}catch (Exception e){
			e.printStackTrace();
		}
		return DB;
	}
	
	//Get the Collection name
	
	public static String getCollection(){
		String Collection = null;
		try {
			  File file = new File("src/main/resources/MongoConfig.xml");
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  Document doc = db.parse(file);
			  doc.getDocumentElement().normalize();
			  NodeList nodeLst = doc.getElementsByTagName("mongoconfig");
			  
			  Node fstNode4 = nodeLst.item(0);
			  Element fstElmnt4 = (Element) fstNode4;
			  NodeList fstNmElmntLst4 = fstElmnt4.getElementsByTagName("collection");
			  Element fstNmElmnt4 = (Element) fstNmElmntLst4.item(0);
			  NodeList fstNm4 = fstNmElmnt4.getChildNodes();
			  Collection = ((Node) fstNm4.item(0)).getNodeValue();
		}catch (Exception e){
			e.printStackTrace();
		}
		return Collection;
	}
}