/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tizo.challenge.repo;

import com.tizo.challenge.model.Tags;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author JADPA-09
 */
public interface ITagsRepo extends JpaRepository<Tags, Integer> {
    
}
