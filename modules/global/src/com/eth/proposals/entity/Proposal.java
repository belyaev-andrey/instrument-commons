package com.eth.proposals.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "PROPOSALS_PROPOSAL")
@Entity(name = "proposals_Proposal")
@NamePattern("%s|projectTitle")
public class Proposal extends StandardEntity {
    private static final long serialVersionUID = 5974648616344281908L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "INSTRUMENT_ID")
    private Instrument instrument;

    @NotNull
    @Column(name = "PROJECT_TITLE", nullable = false)
    private String projectTitle;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "APPLICANT_ID")
    private User applicant;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DELEGATE_ID")
    private User delegate;

    @NotNull
    @Column(name = "PROPOSAL_STATUS", nullable = false)
    private String proposalStatus;

    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;

    public ProposalStatus getProposalStatus() {
        return proposalStatus == null ? null : ProposalStatus.fromId(proposalStatus);
    }

    public void setProposalStatus(ProposalStatus proposalStatus) {
        this.proposalStatus = proposalStatus == null ? null : proposalStatus.getId();
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public User getDelegate() {
        return delegate;
    }

    public void setDelegate(User delegate) {
        this.delegate = delegate;
    }

    public User getApplicant() {
        return applicant;
    }

    public void setApplicant(User applicant) {
        this.applicant = applicant;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }
}