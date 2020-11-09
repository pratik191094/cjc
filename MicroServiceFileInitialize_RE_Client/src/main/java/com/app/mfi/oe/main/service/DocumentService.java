package com.app.mfi.oe.main.service;

import java.io.IOException;
import com.app.mfi.oe.main.model.DocumentDetails;

public interface DocumentService {
	public String saveDocumetDetails(DocumentDetails d) throws IOException;

}


//[ngModelOptions]="{standalone: true}"