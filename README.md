# PhotoApp Discovery Service

A Spring Boot-based Eureka Discovery Server for the Photo App microservices architecture. This service acts as a central registry where other microservices can register themselves and discover each other dynamically.

## 🚀 Overview

The PhotoApp Discovery Service is built using:
- **Spring Boot** - Main framework
- **Spring Cloud Netflix Eureka Server** - Service discovery and registration
- **Maven** - Build tool and dependency management

## 📋 Prerequisites

- Java 8 or higher
- Maven 3.6 or higher
- Git

## 🛠️ Setup and Installation

### 1. Clone the Repository
```bash
git clone <repository-url>
cd PhotoAppDiscoveryService
```

### 2. Build the Project
```bash
mvn clean install
```

### 3. Run the Application
```bash
mvn spring-boot:run
```

Or using the Maven wrapper:
```bash
./mvnw spring-boot:run
```

## ⚙️ Configuration

The application is configured via `src/main/resources/application.properties`:

```properties
server.port=8010
spring.application.name=discoveryservice
eureka.instance.hostname=localhost
eureka.client.register-with-eureka=false
eureka.client.service-url.defaultZone=http://${eureka.instance.hostname}:${server.port}/eureka
```

### Key Configuration Properties

| Property | Value | Description |
|----------|-------|-------------|
| `server.port` | 8010 | Port on which the discovery service runs |
| `spring.application.name` | discoveryservice | Name of the application |
| `eureka.instance.hostname` | localhost | Hostname for the Eureka instance |
| `eureka.client.register-with-eureka` | false | Don't register with another Eureka server |
| `eureka.client.fetch-registry` | false | Don't fetch registry from another Eureka server |

## 🌐 Accessing the Eureka Dashboard

Once the application is running, you can access the Eureka dashboard at:

```
http://localhost:8010
```

### Dashboard Features

The Eureka dashboard provides:
- **Registered Applications**: List of all microservices currently registered
- **Instance Details**: Status, URLs, health checks for each service
- **Server Information**: Eureka server health and configuration
- **Real-time Monitoring**: Live status updates of registered services

## 🔧 Development

### Project Structure
```
src/
├── main/
│   ├── java/
│   │   └── com/appsdeveloperblog/photoapp/discovery/
│   │       └── PhotoAppDiscoveryServiceApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/appsdeveloperblog/photoapp/discovery/
            └── PhotoAppDiscoveryServiceApplicationTests.java
```

### Key Components

#### Main Application Class
- `@SpringBootApplication`: Enables Spring Boot auto-configuration
- `@EnableEurekaServer`: Enables Eureka server functionality
- PID file generation with timestamp for process management

#### PID File Management
The application generates a PID file with format:
```
C:\Zenith\Process\discovery{timestamp}{random}.pid
```

## 🧪 Testing

Run the tests using:
```bash
mvn test
```

## 📦 Building for Production

### Create JAR File
```bash
mvn clean package
```

### Run JAR File
```bash
java -jar target/PhotoAppDiscoveryService-{version}.jar
```

## 🔒 Security Considerations

- The application exposes all actuator endpoints (`management.endpoints.web.exposure.include=*`)
- Shutdown endpoint is enabled for management purposes
- Consider securing the Eureka dashboard in production environments

## 📝 Git Commit Rules

This project enforces specific commit message formats:

### Valid Formats
- `E1234 Your epic description` (min 10 chars)
- `F5678 Your feature description` (min 10 chars)
- `US1234567 Your user story description` (min 10 chars)
- `DE1234567 Your defect description` (min 10 chars)

### Examples
✅ **Valid:**
- `E1234 Implement comprehensive user authentication system`
- `F5678 Add photo upload functionality with cloud storage`
- `US1234567 Create user profile management interface`
- `DE1234567 Fix database connection timeout issues`

❌ **Invalid:**
- `Fixed bug` (no prefix)
- `E1234 Short` (description too short)
- `F123 Too few digits` (wrong number of digits)

## 🤝 Contributing

1. Follow the commit message format rules
2. Ensure all tests pass
3. Update documentation as needed

## 📞 Support

For issues and questions, please refer to the project documentation or contact the development team.

## 📄 License

[Add your license information here]

---

**Note**: This discovery service is part of a larger microservices architecture. Other services in the Photo App ecosystem will register with this discovery service to enable service-to-service communication. 