# Project Name

Spring Boot Modular Monolith With DDD(Domain Driven Design)

## Description

This project is a modular monolith application built with Java, Spring Boot, and Maven. It includes several modules such as `order`, `notification`, `common`, and `inventory`.

## Installation

To install this project, you need to have Java and Maven installed on your machine. After that, you can clone the repository and run the following command in the project directory:

```bash
mvn clean install
```

## What is a Modular Monolith?

A Modular Monolith is a software architecture style that combines the simplicity of a monolith with the modularity of microservices. In this architecture, the application is structured as a single deployable unit (like a monolith), but internally it is divided into several modules. Each module corresponds to a specific business domain and is highly decoupled from the others, similar to how microservices are designed.

Here are some key characteristics of a Modular Monolith:

1. **Single Deployable Unit**: The entire application is packaged and deployed as a single unit, just like a traditional monolith. This simplifies deployment and operations as there's only one application to manage.

2. **Modular Structure**: Internally, the application is divided into several modules. Each module is responsible for a specific business domain or functionality. The modules are highly decoupled and can be developed and tested independently.

3. **Shared Database**: Unlike microservices where each service has its own database, in a modular monolith, all modules typically share the same database. However, each module should have its own separate schema and should not access the schemas of other modules directly.

4. **Synchronous Communication**: Since all modules are part of the same application, they communicate with each other synchronously through method calls. This is more efficient and simpler than the asynchronous, message-based communication used in microservices.

5. **Consistent Technology Stack**: All modules in a modular monolith use the same technology stack. This makes it easier to manage dependencies and ensures consistency across the application.

A Modular Monolith can be a good choice for applications that need the simplicity and consistency of a monolith, but also want to avoid the problems of a large, monolithic codebase by dividing the application into smaller, more manageable modules.

## Domain Driven Design (DDD)

Domain-Driven Design (DDD) is a software development approach that focuses on understanding the business domain, its needs, and its complexity, and using that understanding to drive the design and architecture of the software. The goal of DDD is to create software that is a high-fidelity model of the real-world business domain.

Here are some key concepts in DDD:

1. **Ubiquitous Language**: This is a common language used by all team members (both technical and non-technical) to describe the business domain. It helps to ensure that everyone understands the domain in the same way and reduces misunderstandings.

2. **Bounded Context**: This is a boundary within which a particular model is defined and applicable. Different bounded contexts can have different models for the same real-world concepts, depending on their needs and perspective.

3. **Entities**: These are objects that have a distinct identity that persists over time and across different representations.

4. **Value Objects**: These are objects that do not have an identity. They are defined by their attributes and are usually immutable.

5. **Aggregates**: These are clusters of entities and value objects that are treated as a single unit.

6. **Repositories**: These are interfaces that provide access to aggregates for use cases and other domain services.

7. **Domain Events**: These are events that signify something important has happened in the domain that other parts of the system may need to react to.

8. **Domain Services**: These are services that perform operations that don't naturally fit within an entity or value object.

By focusing on the business domain and using these and other DDD concepts, teams can create software that is more aligned with the business needs, easier to understand and maintain, and more flexible to changing business requirements.

## What I am Doing Here?

This project is a sample application that demonstrates how to build a modular monolith with DDD using Spring Boot Modulith.


References:
- [Spring Modulith](https://docs.spring.io/spring-modulith/reference/fundamentals.html)
- [Working with Application Events](https://docs.spring.io/spring-modulith/reference/events.html)



 **NOTE**: If you are publishing any event that event publishing method or class should annotated with the @Transactional annotation. otherwise you will not be able to listen the event.
