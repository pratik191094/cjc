package com.app.mfi.oe.main.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.mfi.oe.main.model.DocumentDetails;
import com.app.mfi.oe.main.repository.DocumentRepository;

import com.app.mfi.oe.main.service.DocumentService;

@Service
public class DocumentServeiceImpl implements DocumentService{

	@Autowired
	DocumentRepository dr;
	@Override
	public String saveDocumetDetails(DocumentDetails d) throws IOException {
		
		dr.save(d);
		return "Record Inserted Sucessfully";
	}
	

//	@Override
//	public void updateDocumentDetails(MultipartFile[] files) throws IOException {
//		DocumentDetails dd=new DocumentDetails();
//		dd.setAdharCard(files[0].getBytes());
//		dd.setPanCard(files[0].getBytes());
//		dd.setPhoto(files[0].getBytes());
//		dd.setSignature(files[0].getBytes());
//		
//		dd.setBankcheck(files[0].getBytes());
//		dd.setBankStatement(files[0].getBytes());
//		dd.setAddressProof(files[0].getBytes());
//		dr.saveAndFlush(dd);
//	}
//
//	@Override
//	public List<DocumentDetails> getDocumentDetails() {
//		// TODO Auto-generated method stub
//		return dr.findAll();
//	}
//
//	@Override
//	public void deleteDocumentDetails(int documentid) {
//		// TODO Auto-generated method stub
//		dr.deleteById(documentid);
//		
//	}
//
//	@Override
//	public List<DocumentDetails> getDocumentDetails(int documentid) {
//		// TODO Auto-generated method stub
//		return dr.findByDocumentid(documentid);
//	}


	
	
}