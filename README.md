  
# Microservices com monitoramento de performance de cada API

## 🔗 Links  ➡️ 
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://br.linkedin.com/in/luiza-andrade-ti/)  

[![git](https://img.shields.io/badge/github-000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/luizaandradeti/) 
 

## Tech Stack 🔨
**Client:** Any: Thunder Client, Curl, Swagger 

**Backend softwares:** Java 17, IntelliJ, VsCode, Docker , DBeaver

# Get Started 🚀  
To get started... Follow the steps in the flow

## Table of contents 🖥️
1. [Run docker-compose MySQL](#run-docker-compose-mysql-in-git-bash)
2. [Create a spring project](#add-actuator-and-run)
  
## Run Docker Compose MySQL in git bash
``` docker-compose up -d ```

![App Screenshot](images/conexao-docker.png)  


## Create Spring Project  ⚡️
- https://start.spring.io/ 
    - Spring Web 
    - Spring Boot DevTools Developer Tools
    - MySQL Driver SQL
    - Spring Data JPA SQL

## Add actuator and run

- branch actuator
- Run application and test 

```
curl --location 'localhost:8085/v1/api/health'
```
output

```
{"status":"UP"}
```

![App Screenshot](images/actuator-image.png) 

![App Screenshot](images/swagger.png) 
