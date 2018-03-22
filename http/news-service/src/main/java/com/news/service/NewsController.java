package com.news.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




import com.subra.model.Article;

// testing curl "http://localhost:8080/service/"

@RestController
@RequestMapping("/news")
public class NewsController {
	
	static private Logger log = LoggerFactory.getLogger(NewsController.class);
	
	@RequestMapping(value="/latest/count/{count}", produces="application/json", headers="Accept=*/*")
	@ResponseBody
	//List<Article> getNewsfeed(@PathVariable int count){
	String getNewsfeed(@PathVariable int count) throws JsonGenerationException, JsonMappingException, IOException{
		log.info("entered getNewsfeed() ...");
		
		List<Article> ls = new ArrayList<Article>();
		Article a1 = new Article(); a1.setArrivalId(5L); a1.setContent("Test 11111"); a1.setNid(44L); a1.setTitle("AA");
		Article a2 = new Article(); a2.setArrivalId(7L); a2.setContent("Test 33333"); a2.setNid(33L); a2.setTitle("BB");
		ls.add(a1); ls.add(a2);
		log.info(ls.toString());
		ObjectMapper om = new ObjectMapper();
		String jsonString = om.writeValueAsString(ls);
		log.info(jsonString);
		return jsonString;
		
	}
	
}
