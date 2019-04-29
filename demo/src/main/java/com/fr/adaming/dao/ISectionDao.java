package com.fr.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.entities.Section;
@Repository
public interface ISectionDao extends JpaRepository<Section, Long>{

}
