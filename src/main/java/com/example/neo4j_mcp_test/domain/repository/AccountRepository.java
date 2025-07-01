package com.example.neo4j_mcp_test.domain.repository;

import com.example.neo4j_mcp_test.domain.node.AccountNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AccountRepository extends Neo4jRepository<AccountNode, Long> {
}
