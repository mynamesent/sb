/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.mfec.repository;

import me.mfec.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sent
 */
public interface PersonRepository  extends  JpaRepository<Person, Long>{
    
}
