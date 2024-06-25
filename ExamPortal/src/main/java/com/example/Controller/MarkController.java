package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Enum.ResponseHandler;
import com.example.Services.MarkService;

@RestController
public class MarkController 
{
	@Autowired
	MarkService markService;
	
	ResponseHandler responseHandler = new ResponseHandler();
	
	
}
