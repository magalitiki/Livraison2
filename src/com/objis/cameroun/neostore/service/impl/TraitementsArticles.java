package com.objis.cameroun.neostore.service.impl;

import java.util.Scanner;

import com.objis.cameroun.neostore.domaine.Articles;
import com.objis.cameroun.neostore.service.ITraitementsArticles;


/**
 * @author "Magali TIKI"
 * Cette classe regroupe les traitements m�tiers d'enregistrement et affichage des d�tails d'un article
 *
 */
public class TraitementsArticles implements ITraitementsArticles {
	
	/**
	 * @param article
	 * Cette m�thode permet � l'utilisateur d'entrer les d�tails d'un article 
	 */
	
	public void enregistrerArticle (Articles article) {
		Scanner sc = new Scanner(System.in);
		
		Articles articles= new  Articles();
		System.out.println("\nNous allons proc�der � l'enregistrement d'un nouvel article");
		
		/*System.out.println("\nVeuillez saisir la r�f�rence de l'article");
		article.setReference(sc.nextLine());*/
		
		System.out.println("\nVeuillez saisir le nom de l'article");
		article.setNom(sc.nextLine());
		
		System.out.println("Veuillez saisir le nom du fournisseur de l'article");
		article.setFournisseur(sc.nextLine());
		
		System.out.println("Veuillez saisir la marque de l'article");
		article.setMarque(sc.nextLine());
		
		System.out.println("Veuillez saisir la quantit� de l'article");
		article.setQuantite(sc.nextInt());
		
		System.out.println("Veuillez saisir le prix d'achat de l'article");
		article.setPrixachat(sc.nextInt());
		
		System.out.println("Veuillez saisir le prix de vente");
		article.setPrixdevente(sc.nextInt());
		
		System.out.println();
		
	}
	
	@Override
	// Generation de la reference et gestion de l'exception sur son format 
	
	public String genererReference(Articles articl) throws Exception {
		if (articl.getMarque().length()<4)	{
			throw new Exception("La marque doit avoir au moins 4 caract�res!");
		}
		else if (articl.getNom().length()<4) {
			articl.setReference(articl.getMarque()/*.substring(0,4)*/+ articl.getNom());
		}
		else {
			articl.setReference(articl.getMarque()/*.substring(0,3)*/+ articl.getNom().substring(0,3));
		}
		return articl.getReference();
	}
	
	/**
	 * @param article
	 * Cette methode affiche les informations entr�es par l'utilisateur 
	 */
	public void afficherDetailsArticle(Articles article) {
		System.out.println("Reference: " +article.getReference());
		System.out.println("Nom: "+article.getNom());
		System.out.println("Fournisseur: " +article.getFournisseur());
		System.out.println("Marque: " +article.getMarque());
		System.out.println("Quantit�: "+article.getQuantite());
		System.out.println("Prix d'achat: "+ article.getPrixachat());
		System.out.println("Prix de vente: " + article.getPrixdevente());
	}

}
