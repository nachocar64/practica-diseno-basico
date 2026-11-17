# Práctica de diseño básico con Jetpack Compose

Aquí están las apps desarrolladas con indicaciones del pathway [Crea un diseño básico](https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-3?hl=es-419) de *Android Basics with Compose* (Unidad 1). Cada carpeta es un proyecto de Android Studio aparte.

## Proyectos

| Carpeta | Qué hace |
|---|---|
| `HappyBirthday` | Tarjeta de cumpleaños digital. Primero solo texto con `Column` y `Text`, después con imágenes. |
| `LearnTogether` | Un artículo con imagen de cabecera, título y texto justificado. |
| `TaskManager` | Pantalla de "All tasks completed" con una imagen y dos textos centrados. |
| `ComposeQuadrant` | Cuadrícula de 2x2 que explica los composables Text, Image, Row y Column. |
| `BusinessCard` | Tarjeta de presentación de mi persona, con logo de Android, nombre, cargo y datos de contacto. |

## ¿Cómo abrirlos?

1. Clone el repositorio:
   ```
   git clone https://github.com/nachocar64/practica-diseno-basico.git
   ```
2. En Android Studio, ve a *File > Open* y elija la carpeta de **un** proyecto (**no** la raíz del repo).
3. Espere a que termine el sync de Gradle y ejecuta la app en un emulador o en un celular.

## ¿Qué se usó?

- Kotlin
- Jetpack Compose con Material 3
- Android Studio (minSdk 24)

## Lo que practiqué

- Organizar la pantalla con `Column` y `Row`
- `Text` e `Image`, con distintos tamaños, pesos y colores
- `Modifier`: `padding`, `weight`, `background`, `size`
- Alineación y distribución con `horizontalAlignment` y `verticalArrangement`
- Textos en `strings.xml` y `@Preview` para ver los cambios sin ejecutar la app

## Autor

Ignacio Cardenas Olivares, estudiante de Ingeniería de Sistemas Computacionales en la UPB.
