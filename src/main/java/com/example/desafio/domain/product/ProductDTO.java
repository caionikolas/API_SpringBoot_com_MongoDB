package com.example.desafio.domain.product;

import com.example.desafio.domain.category.Category;

public record ProductDTO(String title, String description, String ownerId, Integer price, String categoryId) {
}
