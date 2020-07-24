package com.eth.proposals.web.screens.instrument;

import com.haulmont.cuba.gui.screen.*;
import com.eth.proposals.entity.Instrument;

@UiController("proposals_Instrument.browse")
@UiDescriptor("instrument-browse.xml")
@LookupComponent("instrumentsTable")
@LoadDataBeforeShow
public class InstrumentBrowse extends StandardLookup<Instrument> {
}