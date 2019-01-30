# Learnings

From the command line, inside the project folder, runs the project
```bash
./mvnw spring-boot:run
```

JPA

- Official API to work with relational database in java
- Bridge between java objects world and how data is stored in relational database
- Is only a specification
- Is not a concrete implementation (=> hibernate, eclipselink, openjpa)
- Offers java developers database independence


Enable JPA on a pojo

```java
@Entity
```

H2 console

- To enable it : in application.properties, add ```spring.h2.console.enabled=true```
- make sur url is ```jdbc:h2:mem:testdb```


### Spring Framework 5: Beginner to Guru

This repository is for an example application built in my [Spring Framework 5 - Beginner to Guru](https://www.udemy.com/testing-spring-boot-beginner-to-guru/?couponCode=GITHUB_REPO) online course

The application is a simple Spring Boot 2 / Spring Framework 5 web application.

If you would like learn about what's new in Spring Framework 5, click [here](https://springframework.guru/what-is-new-with-spring-framework-5/)

You can learn about my Spring Framework 5 Online course [here.](https://www.udemy.com/testing-spring-boot-beginner-to-guru/?couponCode=GITHUB_REPO)

### Spring Framework 5: Beginner to Guru Course FAQs

Check out this [page](https://github.com/springframeworkguru/spring5webapp/wiki) for answers to frequently asked questions! 

