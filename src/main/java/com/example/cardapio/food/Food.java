package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "foods") //tabela no bd
@Entity(name = "foods") //nome da entidade
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    // @Id @GeneratedValue(strategy = GenerationType.IDENTITY) indica que é o id da tabela, @GeneratedValue indica que vai ser gerado automaticamente pela estrategia de identity
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food (FoodRequestDTO data){
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}
