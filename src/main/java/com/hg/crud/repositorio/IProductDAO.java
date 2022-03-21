package com.hg.crud.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;
import com.hg.crud.modelo.ProductDTO;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {

}