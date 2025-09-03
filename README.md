# Ejercicio E2E - Flujo de Compra en SauceDemo

Este proyecto realiza una prueba funcional automatizada (Prueba E2E) para un flujo de compra en la página [SauceDemo](https://www.saucedemo.com/) utilizando **SerenityBDD** con **ScreenPlay**.

## 📋 Prerequisitos

Antes de ejecutar el proyecto, asegúrate de cumplir con los siguientes requisitos:

- **Sistema Operativo**: Windows 10 / macOS / Linux
- **IDE Recomendado**: IntelliJ IDEA 2023.1 o superior
- **JDK**: Versión 17 (configurado en la variable de entorno `JAVA_HOME`)
- **Google Chrome**: cualquiera (de preferencia la última versión)
- **Gradle Wrapper**: No necesitas instalarlo globalmente; el proyecto incluye el wrapper.
- **Conexión a Internet**: Necesaria para descargar dependencias y ejecutar las pruebas.


📂 Estructura del proyecto

```bash


src/

├── main/

│   └── java/

│       └── com/nttdata/ejercicio1E2E/

│           ├── tasks/                      # Implementaciones de tareas en ScreenPlay

│           ├── questions/                  # Preguntas para verificar estados

│           ├── actors/                     # Configuración del actor


│           ├── models/                     # Modelos para datos del JSON

│           ├── utils/                      # Utilidades como lectura de JSON y WebDriver

│           ├── interfaces/                 # Selectores de elementos web

│           └── resources/

│               └── datos.json              # Datos de prueba

└── test/

    └── java/
    
        └── com/nttdata/ejercicio1E2E/
        
            ├── runner/                     # Para la ejecución (Runner)
            
            ├── stepdefinitions/            # Definición de los pasos de los escenarios
            
            └── features/                   # Escenarios escritos en Cucumber

```
