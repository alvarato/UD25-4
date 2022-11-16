package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pacoteck.springboot.app.dto.Sala;

public interface ISalaDAO extends JpaRepository<Sala, Integer>{

}
