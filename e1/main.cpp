#include <iostream>
#include "Persona.h"
#include "Saudo.h"

int main() {
    Persona p("Xulio", 30);
    p.mostrarInfo();
    Saudo::saudar(p.getNome());
    return 0;
}
