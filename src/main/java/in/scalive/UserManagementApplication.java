package in.scalive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UserManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagementApplication.class, args);
        System.out.println("\n✅ User Management API is running!");
        System.out.println("   → API Base URL  : http://localhost:8080");
        System.out.println("   → GET  users    : http://localhost:8080/users");
        System.out.println("   → POST users    : http://localhost:8080/users");
        System.out.println("   → H2 Console    : http://localhost:8080/h2-console\n");
    }
}
