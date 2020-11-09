package com.app.mfi.oe.main.controller;

import java.io.IOException;

import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.app.mfi.oe.main.model.DocumentDetails;
import com.app.mfi.oe.main.service.DocumentService;
import com.google.gson.Gson;
@RestController
@CrossOrigin("*")
@RequestMapping()
	public class DocumentController
	{
	@Autowired
	DocumentService ds;
	@RequestMapping(value = "/fileupload",method =RequestMethod.POST,consumes=MediaType.MULTIPART_FORM_DATA)
	
	public String fileupload(@RequestPart("adharCard")MultipartFile adharCard,
			@RequestPart("panCard")MultipartFile panCard,
			@RequestPart("photo")MultipartFile photo,
			@RequestPart("signature")MultipartFile signature,
			@RequestPart("addressProof")MultipartFile addressProof,
			@RequestPart("bankStatement")MultipartFile bankStatement,
			@RequestPart("bankcheck")MultipartFile bankcheck,
			@RequestPart("custid")String id) throws IOException 
	{

			DocumentDetails d=new DocumentDetails();
			d.setAdharCard(adharCard.getBytes());
			d.setPanCard(panCard.getBytes());
			d.setPhoto(photo.getBytes());
			d.setSignature(signature.getBytes());
			d.setAddressProof(addressProof.getBytes());
			d.setBankStatement(bankStatement.getBytes());
			d.setBankcheck(bankcheck.getBytes());
			Gson gson =new Gson();
			DocumentDetails d1=gson.fromJson(id, DocumentDetails.class);
			d.setCustid(d1.getCustid());
			ds.saveDocumetDetails(d);
			return "Data inserted Successfully";
	}	
}