#ifndef PERSONA_H
#define PERSONA_H
#include <string>

class Persona {
private:
    std::string nome;
    int idade;

public:
    Persona(const std::string& nome, int idade);
    std::string getNome() const;
    int getIdade() const;
    void mostrarInfo() const;
};
#endif
