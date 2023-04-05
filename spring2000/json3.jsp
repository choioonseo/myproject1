<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
JSONObject json = new JSONObject();
	json.put("today", "rain"); //{name : hong}
	json.put("temp", 100); 
	json.put("hu", "aa"); 
	

	JSONArray array = new JSONArray();
	array.add(json);

	
%><%= json.toJSONString() %>