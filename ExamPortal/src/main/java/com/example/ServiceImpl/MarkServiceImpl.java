package com.example.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.MarkRepository;
import com.example.Services.MarkService;

@Service
public class MarkServiceImpl implements MarkService
{
	@Autowired
	private MarkRepository markRepository;
	
	
}
