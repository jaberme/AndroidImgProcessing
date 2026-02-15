# DemoGoingFasterCPP

Este es un proyecto de Android que demuestra el procesamiento de imágenes de alto rendimiento en tiempo real desde la cámara del dispositivo. La aplicación captura el feed de la cámara, aplica varias transformaciones de imagen y las muestra en la pantalla, destacando la diferencia de rendimiento entre las implementaciones en Java y C++ nativo.

## Características

*   **Vista previa de la cámara en tiempo real:** Muestra el feed de la cámara en vivo.
*   **Procesamiento de imágenes:** Convierte los fotogramas de la cámara del formato YUV a RGB y aplica varios efectos.
*   **Comparación de rendimiento:** Permite cambiar entre diferentes implementaciones de algoritmos para comparar su rendimiento:
    *   **Java puro:** Implementación base en Java.
    *   **Nativo (C++):** Implementación utilizando el NDK de Android para un rendimiento mejorado.
    *   **Paralelización (pthreads/OMP):** Utiliza subprocesos múltiples para acelerar el procesamiento en C++.
    *   **NEON:** Aprovecha las intrínsecas de NEON en arquitecturas ARM para una optimización de bajo nivel.
*   **Algoritmos de procesamiento:**
    *   Conversión a espacio de color RGB.
    *   Conversión a escala de grises.
    *   Filtro de convolución personalizable.

## Cómo construir y ejecutar

1.  Clona este repositorio.
2.  Abre el proyecto en la última versión de Android Studio.
3.  Asegúrate de tener instalado el **Android NDK**. El proyecto está configurado para usar la versión `25.1.8937393`.
4.  Android Studio debería sincronizar el proyecto y descargar las dependencias necesarias automáticamente.
5.  Construye y ejecuta la aplicación en un dispositivo físico para obtener las métricas de rendimiento más precisas, especialmente para las optimizaciones de NEON.

## Cómo usar la aplicación

1.  Inicia la aplicación.
2.  Usa los **RadioButtons** en la parte superior para seleccionar el algoritmo de procesamiento de imagen que deseas aplicar (RGB, Escala de grises, Convolución).
3.  Usa los **CheckBoxes** para habilitar diferentes modos de optimización (Paralelo, Nativo, OMP, NEON). Ten en cuenta que algunas opciones pueden depender de otras.
4.  Presiona el botón **START PREVIEW** para comenzar a procesar el video de la cámara.
5.  La pantalla mostrará el resultado del procesamiento. El tiempo medio de ejecución por fotograma se muestra en la parte inferior, lo que te permite comparar la eficiencia de las diferentes combinaciones de algoritmos y optimizaciones.
