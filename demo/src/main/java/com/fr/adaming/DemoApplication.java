package com.fr.adaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fr.adaming.dao.IEleveDao;
import com.fr.adaming.entities.Eleve;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		IEleveDao eldao = ctx.getBean(com.fr.adaming.dao.IEleveDao.class); 
		Eleve e = new Eleve("Epinard", "Constance", "3 avril 1992", "Sciences de l'informatique"); 
		eldao.save(e); 
		
	}

}
