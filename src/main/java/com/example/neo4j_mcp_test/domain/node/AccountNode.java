package com.example.neo4j_mcp_test.domain.node;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

import java.util.HashSet;
import java.util.Set;

@Node("Account")
@Data
public class AccountNode {

    @Id
    @GeneratedValue
    private Long id;

    @Property("username")
    private String username;

    @Relationship(type = "FOLLOWS", direction = Relationship.Direction.OUTGOING)
    private Set<AccountNode> following = new HashSet<>();

    @Relationship(type = "FOLLOWS", direction = Relationship.Direction.INCOMING)
    private Set<AccountNode> followers = new HashSet<>();

}
