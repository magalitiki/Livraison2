package com.objis.cameroun.neostore.service;

import com.objis.cameroun.neostore.domaine.Articles;

public interface ITraitementsArticles {
	
	public void enregistrerArticle (Articles article);
	
	public void afficherDetailsArticle(Articles article) ;
	
	public String genererReference(Articles article) throws Exception;
}
