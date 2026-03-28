# ☕ Sistema de Pedidos de Cafeteria

> Aplicación web desarrollada con Spring Boot y Thymeleaf para simular pedidos en una cafetería como parte de un laboratorio académico.

## 📋 Tabla de Contenidos

- [Descripción](#-descripción-del-proyecto)
- [Tecnologías](#-tecnologías-usadas)
- [Estructura](#-estructura-principal)
- [Flujo Funcional](#-flujo-funcional-implementado)
- [Cálculo](#-regla-de-cálculo-actual)
- [Estado](#-estado-frente-a-la-consigna)
- [Ejecución](#-cómo-ejecutar)

---

## 📝 Descripción del Proyecto

Una aplicación web que simula un sistema de pedidos de cafetería, permitiendo a los usuarios:

✅ Registrar un pedido con productos, tamaño, cantidad y adicionales  
✅ Calcular el total en backend  
✅ Mostrar un resumen detallado del pedido  
✅ Recibir y procesar calificación de 1 a 5 estrellas con comentario opcional

## 💻 Tecnologías Usadas

| Tecnología | Versión | Uso |
|-----------|---------|-----|
| Java | 25 | Lenguaje base |
| Spring Boot | 4.0.3 | Framework MVC |
| Spring MVC | Incluido | Controladores HTTP |
| Thymeleaf | Starter | Motor de plantillas |
| Maven | Wrapper | Gestor de dependencias |
| Lombok | Latest | Anotaciones de código |

## 📂 Estructura Principal

```
cafeteria/
├── src/
│   ├── main/
│   │   ├── java/com/example/cafeteria/
│   │   │   ├── CafeteriaApplication.java
│   │   │   ├── controller/
│   │   │   │   └── PedidoController.java
│   │   │   └── model/
│   │   │       ├── OrderConfig.java
│   │   │       ├── OrderSession.java
│   │   │       └── RatingForm.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   │           ├── formulariom.html
│   │           ├── resumenpedidom.html
│   │           └── graciasm.html
│   └── test/
├── pom.xml
├── mvnw
├── mvnw.cmd
├── HELP.md
└── README.md
```

## 🔄 Flujo Funcional Implementado

```
┌─────────────────────────────────────────────────────────────┐
│                    FLUJO DE PEDIDOS                         │
├─────────────────────────────────────────────────────────────┤
│  1. GET /                                                   │
│     ↓ Muestra formulario de pedido                          │
│                                                             │
│  2. POST /procesar-pedido                                   │
│     ↓ Recibe datos + calcula total                          │
│                                                             │
│  3. GET resumenpedidom.html                                 │
│     ↓ Muestra resumen y form de calificación                │
│                                                             │
│  4. POST /enviar-calificacion                               │
│     ↓ Recibe estrellas + comentario                         │
│                                                             │
│  5. GET graciasm.html                                       │
│     ↓ Mensaje final de agradecimiento                       │
└─────────────────────────────────────────────────────────────┘
```

| Endpoint | Método | Descripción |
|----------|--------|-------------|
| `/` | GET | Formulario de pedido inicial |
| `/procesar-pedido` | POST | Procesa pedido y calcula total |
| `/enviar-calificacion` | POST | Recibe calificación del cliente |

## 🧮 Regla de Cálculo Actual

La fórmula de precio implementada:

```math
total = (precioBase × cantidad) + (extra × numeroDeAdicionales)
```

**Valores actuales:**

| Variable | Valor |
|----------|-------|
| `precioBase` | 6.0 |
| `extra` | 1.0 |

**Ejemplo:**
- Cantidad: 2 unidades
- Adicionales: 3 (Leche vegetal + Sin azúcar + Toppings)
- **total = (6.0 × 2) + (1.0 × 3) = 15.0**

## ✅ Estado frente a la Consigna

### ✔️ Implementado

- [x] Controlador con rutas de formulario, procesamiento y calificación
- [x] Data binding de pedido y calificación con Thymeleaf
- [x] Vistas de formulario, resumen y agradecimiento
- [x] Modelos solicitados (OrderConfig, OrderSession y RatingForm)
- [x] Cálculo de total en backend
- [x] Formulario con opciones de personalización (tamaño, cantidad, adicionales)
- [x] Resumen detallado del pedido
- [x] Sistema de calificación por estrellas
- [x] Mensaje de agradecimiento final

### 💡 Observación de Mejora

⚠️ El cálculo actual **no diferencia precio por tipo de producto** (café, té, postre).

**Recomendación:** Para cumplir estrictamente la sumatoria por producto, se sugiere:
- Agregar un precio base diferenciado para cada tipo de producto
- Sumar cada item individual: `total = Σ(precioProducto × cantidad) + extras`

## 🚀 Cómo Ejecutar

### Requisitos Previos

- Java 25+ (o compatible con Spring Boot 4.0.3)
- Maven 3.6+ (incluido como wrapper)

### Ejecutar la Aplicación

**En Windows (PowerShell):**

```powershell
.\mvnw.cmd spring-boot:run
```

**En Linux/macOS:**

```bash
chmod +x mvnw
./mvnw spring-boot:run
```

### Acceder a la Aplicación

Una vez iniciada, abre tu navegador en:

```
http://localhost:8080
```

**Puerto por defecto:** 8080

---

## 📚 Recursos Adicionales

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Thymeleaf Guide](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)

---

## 📄 Licencia

Este proyecto es de uso académico y educativo como parte de un laboratorio de curso universitario.
