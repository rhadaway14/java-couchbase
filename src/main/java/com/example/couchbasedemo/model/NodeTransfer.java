package com.example.couchbasedemo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.List;

@JacksonXmlRootElement(localName = "NodeTransfer")
public class NodeTransfer {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "NodeTransferSchedule")
    private List<NodeTransferSchedule> schedules;

    public NodeTransfer() {}
    public List<NodeTransferSchedule> getSchedules() { return schedules; }
    public void setSchedules(List<NodeTransferSchedule> schedules) { this.schedules = schedules; }
}