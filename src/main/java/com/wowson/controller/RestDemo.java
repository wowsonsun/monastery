package com.wowson.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class RestDemo {
	protected static Logger logger = Logger.getLogger(RestDemo.class);
	@RequestMapping(value = "/getdate", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getDate(HttpServletResponse response) throws IOException {
		SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd");
		String datetime = tempDate.format(new Date());
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(datetime+"：时间---------------------");
		map.put("data", datetime);
		return map;
	}
	@RequestMapping(value = "/getString", method = RequestMethod.GET)
	public String getString(HttpServletResponse response) throws IOException {
		System.out.println("demo2------------");
		return "demo";
	}

	@RequestMapping(value = "/gettime", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getTime(HttpServletResponse response) throws IOException {
		SimpleDateFormat tempDate = new SimpleDateFormat("HH:mm:ss");
		String datetime = tempDate.format(new java.util.Date());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", datetime);
		return map;
	}

	@RequestMapping(value = "/getdatetime", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getDateTime(HttpServletResponse response) throws IOException {
		SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datetime = tempDate.format(new java.util.Date());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", datetime);
		return map;
	}
	@RequestMapping(value = "/demo")
	public String demo(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("----------------Demovo-------------------------");
		return "demo";
	}
	
}
