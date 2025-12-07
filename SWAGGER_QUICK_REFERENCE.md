# Quick Reference - Swagger Access

## 🔗 Quick Links

After starting the application with `./gradlew bootRun`:

### Swagger UI (Interactive Documentation)
```
http://localhost:8080/swagger-ui.html
```

### OpenAPI JSON Specification
```
http://localhost:8080/api-docs
```

### OpenAPI YAML Specification
```
http://localhost:8080/api-docs.yaml
```

## 📋 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /v1/users | Create a new user |
| GET    | /v1/users/{id} | Get user by ID |
| GET    | /v1/users | Get all users |
| PUT    | /v1/users/{id} | Update user |
| DELETE | /v1/users/{id} | Delete user |

## 🎨 Swagger Features

✅ Fully documented API with:
- Operation descriptions
- Request/response schemas
- Example values
- Response codes
- Interactive testing

✅ All endpoints tagged as "User Management"

✅ Alphabetically sorted for easy navigation

## 🚀 Start Command

```bash
cd /Users/kfatullayev/Documents/java_projects/ms-user/ms-user
./gradlew bootRun
```

Then open: http://localhost:8080/swagger-ui.html

## 📝 Example Request Body (Create User)

```json
{
  "name": "John",
  "surname": "Doe",
  "email": "john.doe@example.com",
  "phone": "+1234567890"
}
```

## ✅ Build Verification

```bash
./gradlew clean build -x test
```

Expected: **BUILD SUCCESSFUL**

