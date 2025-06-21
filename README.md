# 🚀 J2EE-Interceptors

## 📝 Project Overview

**J2EE-Interceptors** is a simple yet detailed Java EE project that demonstrates the power of interceptors in enterprise applications. The project showcases how to use custom annotations and interceptors to manage cross-cutting concerns such as logging, authentication, and timer event handling in EJB components. By leveraging interceptor bindings, this project provides a modular and reusable approach to adding behavior before, after, or around business method invocations.

---

## 📽️ Demo Video
[![J2EE-Interceptors Project Demo](https://github.com/chamikathereal/J2EE-Interceptors/blob/main/J2EE-Interceptors.png)](https://youtu.be/gBETeOlbXQk)

---

## 🗂️ Project Structure

```
J2EE-Interceptors/
├── src/
│   └── main/
│       ├── java/
│       │   └── lk.jlat.web.interceptor/
│       │       ├── annotation/
│       │       │   ├── Login.java
│       │       │   └── TimeOutLogger.java
│       │       ├── ejb/
│       │       │   ├── TimerSessionBean.java
│       │       │   └── UserSessionBean.java
│       │       ├── interceptor/
│       │       │   ├── AInterceptor.java
│       │       │   ├── LoginInterceptor.java
│       │       │   ├── TestInterceptor.java
│       │       │   └── TimerInterceptor.java
│       │       └── servlet/
│       │           └── Test.java
│       └── resources/
├── pom.xml
```

## 📦 Module Details

#### 🟦 **annotation**
- **Login.java**  
  Custom annotation for marking methods or classes that require login-related interception.
  
- **TimeOutLogger.java**  
  Custom annotation for binding timeout logging interceptors to EJB timer methods.

##

#### 🟦 **ejb**
- **TimerSessionBean.java**  
  Stateless EJB demonstrating scheduled tasks with timer events, using the `@TimeOutLogger` annotation for interception.
  
- **UserSessionBean.java**  
  Stateless EJB for user actions, annotated with `@Login` to trigger authentication and logging interceptors.

##

#### 🟦 **interceptor**
- **AInterceptor.java**  
  Interceptor bound to `@Login`, logs and processes method invocations with a specified priority.
  
- **LoginInterceptor.java**  
  Another `@Login`-bound interceptor, demonstrating ordered execution and authentication checks.
  
- **TestInterceptor.java**  
  Demonstrates lifecycle interception (`@AroundConstruct`, `@PostConstruct`, `@PreDestroy`) and method-level interception.
  
- **TimerInterceptor.java**  
  Intercepts timer events (`@AroundTimeout`) for beans annotated with `@TimeOutLogger`.

##

#### 🟦 **servlet**
- **Test.java**  
  Servlet that triggers EJB methods to demonstrate interceptor execution in action.

---

## ⚙️ Key Features

- ✅ Demonstrates creation and use of custom interceptor binding annotations.
- ✅ Shows how to apply multiple interceptors to EJB components and control execution order with priorities.
- ✅ Covers both business method and timer event interception.
- ✅ Includes lifecycle event interception for advanced use cases.
- ✅ Modular and extensible structure for easy learning and experimentation.

---

## 💡 How It Works

- **Custom Annotations:**  
  `@Login` and `@TimeOutLogger` are used to declaratively bind interceptors to EJB methods or classes.

- **Multiple Interceptors:**  
  Interceptors like `AInterceptor` and `LoginInterceptor` are executed in order of their `@Priority` values, enabling layered cross-cutting logic.

- **Timer Interception:**  
  `TimerSessionBean` uses `@Schedule` for periodic tasks, with `TimerInterceptor` capturing and logging timer events.

- **Lifecycle Interception:**  
  `TestInterceptor` demonstrates how to intercept bean construction, initialization, and destruction phases.

- **Servlet Trigger:**  
  The `Test` servlet invokes EJB methods, providing an entry point to observe interceptor behavior in a real web environment.

---

## 🛠️ Technologies Used

- Java 11
- Jakarta EE 10 (EJB, Interceptors, Servlet)
- Maven

---

## 📚 Learning Outcomes

- ✅ Understand the concept and implementation of interceptors in Java EE.
- ✅ Learn to design custom interceptor binding annotations.
- ✅ Explore advanced use cases like timer and lifecycle event interception.
- ✅ Gain practical experience with modular enterprise Java application structure.

---

## 🧑‍💻 Author

Chamika Gayashan  
Undergraduate Software Engineer | Sri Lanka  
Linkedin: @chamikathereal  
Current date: Sunday, June 22, 2025, 12:30 AM +0530
