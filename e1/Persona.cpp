#include "Persona.h"
#include <iostream>

Persona::Persona(const std::string& nome, int idade)
    : nome(nome), idade(idade) {}

std::string Persona::getNome() const { return nome; }
int Persona::getIdade() const { return idade; }

void Persona::mostrarInfo() const {
    std::cout << "Nome: " << nome << " | Idade: " << idade << std::endl;
}
