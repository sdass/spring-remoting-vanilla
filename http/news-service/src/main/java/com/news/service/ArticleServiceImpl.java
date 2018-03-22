package com.news.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.subra.model.Article;
import com.subra.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {

	Logger log = LoggerFactory.getLogger(ArticleServiceImpl.class);
	@Override
	public List<Article> fetchFewArticles(int count) {
		log.info("fetchFewArticles() . . ."); 
		List<Article> ls = new ArrayList<Article>();
		Article a1 = new Article(); a1.setArrivalId(5L); a1.setContent("Test 11111"); a1.setNid(44L); a1.setTitle("AA");
		Article a2 = new Article(); a2.setArrivalId(7L); a2.setContent("Test 33333"); a2.setNid(33L); a2.setTitle("BB");
		ls.add(a1); ls.add(a2);
		log.info(ls.toString());
		return ls;
		

	}

	@Override
	public String fetchJson(int count) {
		log.info("fetchJson() . . ."); 
		List<Article> ls = new ArrayList<Article>();
		Article a1 = new Article(); a1.setArrivalId(5L); a1.setContent("Test 11111"); a1.setNid(44L); a1.setTitle("AA");
		Article a2 = new Article(); a2.setArrivalId(7L); a2.setContent("Test 33333"); a2.setNid(33L); a2.setTitle("BB");
		ls.add(a1); ls.add(a2);
		log.info(ls.toString());
		ObjectMapper om = new ObjectMapper();
		String jsonString="empty";
		try {
			jsonString = om.writeValueAsString(ls);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		log.info(jsonString);
		return jsonString;
		

	}

}
