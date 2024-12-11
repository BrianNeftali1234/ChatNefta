package com.miProyecto.NeftChat;
import jakarta.persistence .*;
import lombok.Data;

@Data
@Entity

public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String username;
        private String password;

        // Getter para username
        public String getUsername() {
                return username;
        }

        // Setter para username
        public void setUsername(String username) {
                this.username = username;
        }

        // Getter para password
        public String getPassword() {
                return password;
        }

        // Setter para password
        public void setPassword(String password) {
                this.password = password;
        }

        // Getter para id
        public Long getId() {
                return id;
        }

        // Setter para id
        public void setId(Long id) {
                this.id = id;
        }
}
