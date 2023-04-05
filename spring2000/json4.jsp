<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
//스크릿트릿 
	JSONObject json3 = new JSONObject();
	
	json3.put("high", 1000); 
	json3.put("low", 1); 
	json3.put("end", 10); 
	
	JSONObject json4 = new JSONObject();

	json4.put("high", 2000); 
	json4.put("low", 2); 
	json4.put("end", 20); 
	
	
	JSONArray array = new JSONArray();
	array.add(json3);
	array.add(json4);
	
%><%= array.toJSONString() %>