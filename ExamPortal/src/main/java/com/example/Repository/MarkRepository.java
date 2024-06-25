package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.MarksEntity;

@Repository
public interface MarkRepository extends JpaRepository<MarksEntity, Integer> 
{

}
