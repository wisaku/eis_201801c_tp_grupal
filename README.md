## Objetivos del TP grupal
Ejercitar la escritura de código en ambientes colaborativos utilizando una metodología de diseño guiada por pruebas ejecutanto un flujo de trabajo que facilite la integración frecuente de código.

### Lo que se espera

1. Implementar ATDD como técnica de diseño.  
2. Implementar FeatureBranch + Forking como flujo de trabajo, creando para esto un repositorio público con cualquier servicio de versionado de fuentes (Bitbucket, GitHub, etc.)
3. Cada cambio necesita ser integrado con la mayor frecuencia posiblie, utilizando para la verificación de este un servicio de CI (Continous Integration).
4. Generar el modelo tal que cumpla con las [Pruebas de Aceptación][3] para el problema listado en la próxima sección ([Pacman][4]).
5. Completar tados de los integrantes del grupo utilizando este archivo (```README.md```)

### Integrantes

Nro | Nombre | Legajo | Mail
----|--------|--------|------
1   |        |        |
2   |        |        |
3   |        |        |
4   |        |        |
    
### Entrega

16 / 05 / 2018

## Pacman

El objetivo de este ejercicio es implementar parcialmente el modelo del juego [Pacman][2] aplicando la técnica ATDD e integrando los cambios de manera frecuente e iterativa. Para eso implementar un CI (preferentemente [Travis][1]).

### Pruebas de aceptación

1. Pacman come un biscuit se vuelve más gordo (suma puntos).
2. Pacman come una fruta se vuelve más gordo (suma puntos).
3. Pacman choca contra un fantasma y muere.
4. Pacman come un pellet y los fantasmas se debilitan.
5. Pacman choca contra un fantasma debilitado y no muero. Adicionalmente la digestión es el fantasma sin cuerpo.
6. Pacman choca contra un fantasma sin cuerpo y no muere.


[1]: https://travis-ci.org/
[2]: https://en.wikipedia.org/wiki/Pac-Man
[3]: ./pruebas_de_aceptacion
[4]: ./pacman
