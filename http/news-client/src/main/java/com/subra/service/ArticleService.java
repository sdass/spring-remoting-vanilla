package com.subra.service;

import java.util.List;

import com.subra.model.Article;

public interface ArticleService {
	List<Article> fetchFewArticles(int count);

	String fetchJson(int count);

}
