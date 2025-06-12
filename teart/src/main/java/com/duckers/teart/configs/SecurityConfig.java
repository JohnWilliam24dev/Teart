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

                    .requestMatchers("/atelier/parceiro").hasRole("PARCEIRO")
                    .requestMatchers("/atelier/parceiro/admin/**").hasAnyRole("ADMIN", "PARCEIRO")
                    .requestMatchers("/atelier/{id}").permitAll()
                    .requestMatchers("/atelier").permitAll()

                    .requestMatchers("/comprador/consumidor").hasRole("CONSUMIDOR")
                    .requestMatchers("/comprador").hasRole("ADMIN")
                    .requestMatchers("/comprador/{id}").hasAnyRole("ADMIN", "CONSUMIDOR")
                    .requestMatchers("/comprador/consumidor/admin/**").hasAnyRole("ADMIN", "CONSUMIDOR")

                    .requestMatchers("/dono-atelier").hasRole("ADMIN")
                    .requestMatchers("/dono-atelier/parceiro").hasRole("PARCEIRO")
                    .requestMatchers("/dono-atelier/{id}").hasAnyRole("ADMIN", "PARCEIRO")
                    .requestMatchers("/dono-atelier/parceiro/admin/**").hasAnyRole("ADMIN", "PARCEIRO")

                    .requestMatchers("/endereco-atelier/parceiro").hasRole("PARCEIRO")
                    .requestMatchers("/endereco-atelier/parceiro/admin/**").hasAnyRole("ADMIN", "PARCEIRO")
                    .requestMatchers("/endereco-atelier/{id}").permitAll()
                    .requestMatchers("/endereco-atelier").permitAll()

                    .requestMatchers("/endereco-usuario/consumidor").hasRole("CONSUMIDOR")
                    .requestMatchers("/endereco-usuario").hasRole("ADMIN")
                    .requestMatchers("/endereco-usuario/consumidor/admin/**").hasAnyRole("ADMIN", "CONSUMIDOR")
                    .requestMatchers("/endereco-usuario/{id}").permitAll()


                    .requestMatchers("/item-pedido-produto/consumidor").hasRole("CONSUMIDOR")
                    .requestMatchers("/item-pedido-produto/{id}").hasAnyRole("ADMIN", "CONSUMIDOR")
                    .requestMatchers("/item-pedido-produto").hasAnyRole("ADMIN", "CONSUMIDOR")
                    .requestMatchers("/item-pedido-produto/consumidor/admin/**").hasAnyRole("ADMIN", "CONSUMIDOR")

                    .requestMatchers("/item-pedido-servico/consumidor").hasRole("CONSUMIDOR")
                    .requestMatchers("/item-pedido-servico/{id}").hasAnyRole("ADMIN", "CONSUMIDOR")
                    .requestMatchers("/item-pedido-servico").hasAnyRole("ADMIN", "CONSUMIDOR")
                    .requestMatchers("/item-pedido-servico/consumidor/admin/**").hasAnyRole("ADMIN", "CONSUMIDOR")

                    .requestMatchers("/pedido/consumidor").hasRole("CONSUMIDOR")
                    .requestMatchers("/pedido/{id}").hasAnyRole("ADMIN", "CONSUMIDOR")
                    .requestMatchers("/pedido").hasAnyRole("ADMIN", "CONSUMIDOR")
                    .requestMatchers("/pedido/consumidor/admin/**").hasAnyRole("ADMIN", "CONSUMIDOR")

                    .requestMatchers("/produto/parceiro").hasRole("PARCEIRO")
                    .requestMatchers("/produto/{id}").hasAnyRole("ADMIN", "PARCEIRO")
                    .requestMatchers("/produto").hasAnyRole("ADMIN", "PARCEIRO")
                    .requestMatchers("/produto/parceiro/admin/**").hasAnyRole("ADMIN", "PARCEIRO")

                    .requestMatchers("/servico/parceiro").hasRole("PARCEIRO")
                    .requestMatchers("/servico/{id}").hasAnyRole("ADMIN", "PARCEIRO")
                    .requestMatchers("/servico").hasAnyRole("ADMIN", "PARCEIRO")
                    .requestMatchers("/servico/parceiro/admin/**").hasAnyRole("ADMIN", "PARCEIRO")

                    .anyRequest().authenticated();
        });
        httpSecurity.httpBasic(Customizer.withDefaults());
        httpSecurity.csrf(csrf -> csrf.disable());
        return httpSecurity.build();
    }
}
