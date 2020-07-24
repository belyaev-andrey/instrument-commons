package com.eth.proposals.web.screens.proposal;

import com.haulmont.cuba.gui.screen.*;
import com.eth.proposals.entity.Proposal;

@UiController("proposals_Proposal.browse")
@UiDescriptor("proposal-browse.xml")
@LookupComponent("proposalsTable")
@LoadDataBeforeShow
public class ProposalBrowse extends StandardLookup<Proposal> {
}