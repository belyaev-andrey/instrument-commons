package com.eth.proposals.core.role;

import com.haulmont.cuba.security.app.role.AnnotatedRoleDefinition;
import com.haulmont.cuba.security.app.role.annotation.Role;

@Role(name = ExecutiveRole.NAME)
public class ExecutiveRole extends AnnotatedRoleDefinition {
    public final static String NAME = "Executive";
}
