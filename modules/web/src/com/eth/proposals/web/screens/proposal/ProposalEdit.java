package com.eth.proposals.web.screens.proposal;

import com.haulmont.cuba.gui.screen.*;
import com.eth.proposals.entity.Proposal;

@UiController("proposals_Proposal.edit")
@UiDescriptor("proposal-edit.xml")
@EditedEntityContainer("proposalDc")
@LoadDataBeforeShow
public class ProposalEdit extends StandardEditor<Proposal> {
}