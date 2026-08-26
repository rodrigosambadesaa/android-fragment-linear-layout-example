# Revisión del ejemplo original

El ejemplo docente de 2019 añadía un `android.app.Fragment` directamente a un `LinearLayout` y modificaba manualmente sus `LayoutParams` desde el propio Fragment. Era adecuado para mostrar la mecánica concreta que se estaba enseñando, pero quedó ligado a APIs hoy obsoletas o desaconsejadas.

## Problemas detectados

- `android.app.Fragment` y `getFragmentManager()` pertenecen al modelo de Fragments de plataforma; el ecosistema actual usa AndroidX.
- Support Library 28 y configuración Gradle antigua.
- Sin View Binding y sin limpieza explícita de referencias a vistas del Fragment.
- Strings hardcodeados.
- Tests generados sin relación con el ejemplo.
- La transacción se ejecutaba en cada `onCreate()`, por lo que no protegía frente a duplicados tras recrear la Activity.
- En los dos primeros ejemplos, el botón mostrado en el Fragment no tenía comportamiento, por lo que era difícil comprobar visualmente que la vista estaba operativa.

## Revisión 2026

La versión actual usa AndroidX `Fragment`, View Binding con liberación en `onDestroyView()`, recursos, una interacción mínima comprobable, pruebas de la lógica independiente y CI. Se conserva la técnica específica del ejemplo para que los tres repositorios sigan siendo comparables.
