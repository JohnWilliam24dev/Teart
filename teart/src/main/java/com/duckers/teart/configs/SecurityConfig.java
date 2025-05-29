package com.duckers.teart.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import javax.sql.DataSource;

@Configuration
public class SecurityConfig {
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
        jdbcUserDetailsManager.setUsersByUsernameQuery("SELECT usuario, senha, enabled FROM usuarios WHERE usuario = ?");
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("SELECT usuario, papel FROM usuarios INNER JOIN papeis on usuarios.id = papeis.id_usuario where usuario = ?");
        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(configurer -> {
            configurer
                    .requestMatchers("/guest").permitAll()
                    .requestMatchers("/produto").permitAll()
                    .requestMatchers("/servico").permitAll()
                    .requestMatchers("/atelier").permitAll()
                    .requestMatchers("/comprador/**").hasRole("ADMIN")
                    .requestMatchers("/atelier/**").hasRole("ADMIN")
                    .requestMatchers("/dono-atelier/**").hasRole("ADMIN")
                    .requestMatchers("/produto/**").hasAnyRole("ADMIN", "BUSINESS")
                    .requestMatchers("/servico/**").hasAnyRole("ADMIN", "BUSINESS")
                    .requestMatchers("/endereco-atelier/**").hasAnyRole("ADMIN", "BUSINESS")
                    .requestMatchers("/pedido/**").hasAnyRole("ADMIN", "BUSINESS", "COMPRADOR")
                    .requestMatchers("/item-pedido-produto/**").hasAnyRole("ADMIN", "BUSINESS", "PURCHASER")
                    .requestMatchers("/item-pedido-servico/**").hasAnyRole("ADMIN", "BUSINESS", "PURCHASER")
                    .requestMatchers("/endereco-usuario/**").hasAnyRole("ADMIN", "BUSINESS", "PURCHASER")
                    .anyRequest().authenticated();
        });
        httpSecurity.httpBasic(Customizer.withDefaults());
        httpSecurity.csrf(csrf -> csrf.disable());
        return httpSecurity.build();
    }
}
