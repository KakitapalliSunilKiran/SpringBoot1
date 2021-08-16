package com.info.Student1.StudRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.Student1.Model.ModelClass;

public interface StudentRepo extends JpaRepository<ModelClass,Integer> {

}
