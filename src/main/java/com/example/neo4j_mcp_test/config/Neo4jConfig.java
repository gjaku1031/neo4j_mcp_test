package com.example.neo4j_mcp_test.config;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.transaction.Neo4jTransactionManager;

@Configuration
public class Neo4jConfig {

    @Bean
    public Driver neo4jDriver() {
        return GraphDatabase.driver(
                "bolt://183.99.3.15:7687",
                AuthTokens.basic("neo4j", "dkwk0616")
        );
    }

    @Bean
    public Neo4jClient neo4jClient(Driver driver) {
        return Neo4jClient.create(driver);
    }

    @Bean
    public Neo4jTransactionManager neo4jTransactionManager(Driver driver) {
        return new Neo4jTransactionManager(driver);
    }
}
