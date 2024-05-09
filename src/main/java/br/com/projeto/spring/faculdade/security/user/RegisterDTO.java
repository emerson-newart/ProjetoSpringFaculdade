package br.com.projeto.spring.faculdade.security.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
