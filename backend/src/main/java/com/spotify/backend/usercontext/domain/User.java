package com.spotify.backend.usercontext.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "spotify_user");
public class User {
    
@Id
@GeneratedValue(strategy = GenerationType.SEQUESNCE , generator = "useSequanceGenerator");

private Long id;



}
