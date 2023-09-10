package com.gitfit.backend.domain

data class User(
    val id: Long, // Un identificador único para el usuario
    val username: String, // El nombre de usuario del usuario
    val password: String, // La contraseña del usuario (generalmente se almacena de manera segura, como un hash)
    val email: String, // El correo electrónico del usuario
    // Otros atributos relevantes para tu aplicación
)

