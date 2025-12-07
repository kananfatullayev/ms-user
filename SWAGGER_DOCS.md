# User Management Service - Swagger Documentation

## Overview
This project includes Swagger/OpenAPI documentation for the User Management API.

## Accessing Swagger UI

Once the application is running, you can access the Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

Or use the alternative path:
```
http://localhost:8080/swagger-ui/index.html
```

## Accessing OpenAPI JSON/YAML

The raw OpenAPI specification is available at:

```
http://localhost:8080/api-docs
```

For YAML format:
```
http://localhost:8080/api-docs.yaml
```

## API Endpoints

### User Management API (v1)

All user endpoints are under the `/v1/users` base path:

1. **POST /v1/users** - Create a new user
2. **GET /v1/users/{id}** - Get user by ID
3. **GET /v1/users** - Get all users
4. **PUT /v1/users/{id}** - Update user
5. **DELETE /v1/users/{id}** - Delete user

## Configuration

The Swagger configuration can be customized in `application.yml`:

```yaml
springdoc:
  api-docs:
    path: /api-docs
    enabled: true
  swagger-ui:
    path: /swagger-ui.html
    enabled: true
    tags-sorter: alpha
    operations-sorter: alpha
  show-actuator: true
```

## Dependencies

The project uses SpringDoc OpenAPI:
- `org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0`

This dependency provides:
- Swagger UI interface
- OpenAPI 3.0 specification generation
- Automatic endpoint documentation
- Interactive API testing

## Features

- **Interactive API Testing**: Test endpoints directly from the browser
- **Schema Documentation**: Detailed request/response models
- **Parameter Descriptions**: Clear parameter documentation
- **Response Codes**: Documented HTTP response codes
- **Example Values**: Sample request/response data

## Usage Example

1. Start the application:
   ```bash
   ./gradlew bootRun
   ```

2. Open browser and navigate to:
   ```
   http://localhost:8080/swagger-ui.html
   ```

3. Explore and test the API endpoints using the interactive UI

## Additional Notes

- The API is tagged as "User Management" for easy organization
- All endpoints include detailed operation descriptions
- Request and response schemas are fully documented with examples
- Error responses (400, 404) are documented where applicable

