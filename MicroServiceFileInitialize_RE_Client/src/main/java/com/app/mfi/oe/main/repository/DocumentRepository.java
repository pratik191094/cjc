package com.app.mfi.oe.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.mfi.oe.main.model.DocumentDetails;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentDetails, Integer>{
	
	public List<DocumentDetails> findByDocumentid(int documentid);

}