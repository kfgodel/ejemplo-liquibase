# Springboot Liquibase example

Ejemplo basado en la documentacion de [esta pagina](https://www.baeldung.com/liquibase-refactor-schema-of-java-app)
con un setup inicial a mano (no incluido en la pagina).

#### Pasos seguidos
1. Crear el proyecto con [Spring Initialzr](https://start.spring.io/)
  - Indicar que es proyecto con jpa, liquibase y postgres como base
2. Crear el compose para una base postgres contenida
3. Modificar el [application.properties](src/main/resources/application.properties) para apuntar a la base
4. Agregar [el changelog](src/main/resources/db/changelog/db.changelog-master.yaml) para liquibase (basado [en esto](http://www.liquibase.org/documentation/yaml_format.html) para el formato yaml)
5. Agregar [config de logback](src/main/resources/logback.xml) para mejorar el output
6. Agregar cambios al [el changelog](src/main/resources/db/changelog/db.changelog-master.yaml) para probar cambios en la base
   