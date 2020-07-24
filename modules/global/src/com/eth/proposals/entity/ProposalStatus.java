package com.eth.proposals.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ProposalStatus implements EnumClass<String> {

    IN_PREPARATION("PREP"),
    NEW("NEW"),
    IN_EVALUATION("EVAL"),
    ACCEPTED("ACC"),
    DECLINED("DECL"),
    REVIEW("REV"),
    APPROVED("APPR"),
    REJECTED("REJ"),
    COMPLETED("COMP");

    private String id;

    ProposalStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ProposalStatus fromId(String id) {
        for (ProposalStatus at : ProposalStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}