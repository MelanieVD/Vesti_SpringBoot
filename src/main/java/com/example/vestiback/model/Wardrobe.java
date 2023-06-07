package com.example.vestiback.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
public class Wardrobe {
        @Id
        private String wardrobeId;
        private String name;
        private List<Item> items;
}
