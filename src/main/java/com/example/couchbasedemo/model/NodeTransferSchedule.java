package com.example.couchbasedemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.repository.Scope;
import org.springframework.data.couchbase.repository.Collection;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Document
@Scope("test")
@Collection("node_schedules")
public class NodeTransferSchedule {

    @Id
    private String id;

    @JacksonXmlProperty(isAttribute = true, localName = "NodeTransferScheduleKey")
    private String nodeTransferScheduleKey;

    @JacksonXmlProperty(isAttribute = true, localName = "DefaultTransitTime")
    private String defaultTransitTime;

    @JacksonXmlProperty(isAttribute = true, localName = "EffectiveFromDate")
    private String effectiveFromDate;

    @JacksonXmlProperty(isAttribute = true, localName = "EffectiveToDate")
    private String effectiveToDate;

    @JacksonXmlProperty(isAttribute = true, localName = "FridayCutOffTime")
    private String fridayCutOffTime;

    @JacksonXmlProperty(isAttribute = true, localName = "FridayShip")
    private String fridayShip;

    @JacksonXmlProperty(isAttribute = true, localName = "FridayTransitTime")
    private String fridayTransitTime;

    @JacksonXmlProperty(isAttribute = true, localName = "FromNode")
    private String fromNode;

    @JacksonXmlProperty(isAttribute = true, localName = "MondayCutOffTime")
    private String mondayCutOffTime;

    @JacksonXmlProperty(isAttribute = true, localName = "MondayShip")
    private String mondayShip;

    @JacksonXmlProperty(isAttribute = true, localName = "MondayTransitTime")
    private String mondayTransitTime;

    @JacksonXmlProperty(isAttribute = true, localName = "Operation")
    private String operation;

    @JacksonXmlProperty(isAttribute = true, localName = "SaturdayCutOffTime")
    private String saturdayCutOffTime;

    @JacksonXmlProperty(isAttribute = true, localName = "SaturdayShip")
    private String saturdayShip;

    @JacksonXmlProperty(isAttribute = true, localName = "SaturdayTransitTime")
    private String saturdayTransitTime;

    @JacksonXmlProperty(isAttribute = true, localName = "SundayCutOffTime")
    private String sundayCutOffTime;

    @JacksonXmlProperty(isAttribute = true, localName = "SundayShip")
    private String sundayShip;

    @JacksonXmlProperty(isAttribute = true, localName = "SundayTransitTime")
    private String sundayTransitTime;

    @JacksonXmlProperty(isAttribute = true, localName = "ThursdayCutOffTime")
    private String thursdayCutOffTime;

    @JacksonXmlProperty(isAttribute = true, localName = "ThursdayShip")
    private String thursdayShip;

    @JacksonXmlProperty(isAttribute = true, localName = "ThursdayTransitTime")
    private String thursdayTransitTime;

    @JacksonXmlProperty(isAttribute = true, localName = "ToNode")
    private String toNode;

    @JacksonXmlProperty(isAttribute = true, localName = "TransitUnitOfMeasure")
    private String transitUnitOfMeasure;

    @JacksonXmlProperty(isAttribute = true, localName = "TuesdayCutOffTime")
    private String tuesdayCutOffTime;

    @JacksonXmlProperty(isAttribute = true, localName = "TuesdayShip")
    private String tuesdayShip;

    @JacksonXmlProperty(isAttribute = true, localName = "TuesdayTransitTime")
    private String tuesdayTransitTime;

    @JacksonXmlProperty(isAttribute = true, localName = "WednesdayCutOffTime")
    private String wednesdayCutOffTime;

    @JacksonXmlProperty(isAttribute = true, localName = "WednesdayShip")
    private String wednesdayShip;

    @JacksonXmlProperty(isAttribute = true, localName = "WednesdayTransitTime")
    private String wednesdayTransitTime;

    @JacksonXmlProperty(isAttribute = true, localName = "FromNodeType")
    private String fromNodeType;


    public NodeTransferSchedule() {}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getNodeTransferScheduleKey() {
        return nodeTransferScheduleKey;
    }

    public void setNodeTransferScheduleKey(String nodeTransferScheduleKey) {
        this.nodeTransferScheduleKey = nodeTransferScheduleKey;
    }

    public String getDefaultTransitTime() {
        return defaultTransitTime;
    }

    public void setDefaultTransitTime(String defaultTransitTime) {
        this.defaultTransitTime = defaultTransitTime;
    }

    public String getEffectiveFromDate() {
        return effectiveFromDate;
    }

    public void setEffectiveFromDate(String effectiveFromDate) {
        this.effectiveFromDate = effectiveFromDate;
    }

    public String getEffectiveToDate() {
        return effectiveToDate;
    }

    public void setEffectiveToDate(String effectiveToDate) {
        this.effectiveToDate = effectiveToDate;
    }

    public String getFridayCutOffTime() {
        return fridayCutOffTime;
    }

    public void setFridayCutOffTime(String fridayCutOffTime) {
        this.fridayCutOffTime = fridayCutOffTime;
    }

    public String getFridayShip() {
        return fridayShip;
    }

    public void setFridayShip(String fridayShip) {
        this.fridayShip = fridayShip;
    }

    public String getFridayTransitTime() {
        return fridayTransitTime;
    }

    public void setFridayTransitTime(String fridayTransitTime) {
        this.fridayTransitTime = fridayTransitTime;
    }

    public String getFromNode() {
        return fromNode;
    }

    public void setFromNode(String fromNode) {
        this.fromNode = fromNode;
    }

    public String getMondayCutOffTime() {
        return mondayCutOffTime;
    }

    public void setMondayCutOffTime(String mondayCutOffTime) {
        this.mondayCutOffTime = mondayCutOffTime;
    }

    public String getMondayShip() {
        return mondayShip;
    }

    public void setMondayShip(String mondayShip) {
        this.mondayShip = mondayShip;
    }

    public String getMondayTransitTime() {
        return mondayTransitTime;
    }

    public void setMondayTransitTime(String mondayTransitTime) {
        this.mondayTransitTime = mondayTransitTime;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getSaturdayCutOffTime() {
        return saturdayCutOffTime;
    }

    public void setSaturdayCutOffTime(String saturdayCutOffTime) {
        this.saturdayCutOffTime = saturdayCutOffTime;
    }

    public String getSaturdayShip() {
        return saturdayShip;
    }

    public void setSaturdayShip(String saturdayShip) {
        this.saturdayShip = saturdayShip;
    }

    public String getSaturdayTransitTime() {
        return saturdayTransitTime;
    }

    public void setSaturdayTransitTime(String saturdayTransitTime) {
        this.saturdayTransitTime = saturdayTransitTime;
    }

    public String getSundayCutOffTime() {
        return sundayCutOffTime;
    }

    public void setSundayCutOffTime(String sundayCutOffTime) {
        this.sundayCutOffTime = sundayCutOffTime;
    }

    public String getSundayShip() {
        return sundayShip;
    }

    public void setSundayShip(String sundayShip) {
        this.sundayShip = sundayShip;
    }

    public String getSundayTransitTime() {
        return sundayTransitTime;
    }

    public void setSundayTransitTime(String sundayTransitTime) {
        this.sundayTransitTime = sundayTransitTime;
    }

    public String getThursdayCutOffTime() {
        return thursdayCutOffTime;
    }

    public void setThursdayCutOffTime(String thursdayCutOffTime) {
        this.thursdayCutOffTime = thursdayCutOffTime;
    }

    public String getThursdayShip() {
        return thursdayShip;
    }

    public void setThursdayShip(String thursdayShip) {
        this.thursdayShip = thursdayShip;
    }

    public String getThursdayTransitTime() {
        return thursdayTransitTime;
    }

    public void setThursdayTransitTime(String thursdayTransitTime) {
        this.thursdayTransitTime = thursdayTransitTime;
    }

    public String getToNode() {
        return toNode;
    }

    public void setToNode(String toNode) {
        this.toNode = toNode;
    }

    public String getTransitUnitOfMeasure() {
        return transitUnitOfMeasure;
    }

    public void setTransitUnitOfMeasure(String transitUnitOfMeasure) {
        this.transitUnitOfMeasure = transitUnitOfMeasure;
    }

    public String getTuesdayCutOffTime() {
        return tuesdayCutOffTime;
    }

    public void setTuesdayCutOffTime(String tuesdayCutOffTime) {
        this.tuesdayCutOffTime = tuesdayCutOffTime;
    }

    public String getTuesdayShip() {
        return tuesdayShip;
    }

    public void setTuesdayShip(String tuesdayShip) {
        this.tuesdayShip = tuesdayShip;
    }

    public String getTuesdayTransitTime() {
        return tuesdayTransitTime;
    }

    public void setTuesdayTransitTime(String tuesdayTransitTime) {
        this.tuesdayTransitTime = tuesdayTransitTime;
    }

    public String getWednesdayCutOffTime() {
        return wednesdayCutOffTime;
    }

    public void setWednesdayCutOffTime(String wednesdayCutOffTime) {
        this.wednesdayCutOffTime = wednesdayCutOffTime;
    }

    public String getWednesdayShip() {
        return wednesdayShip;
    }

    public void setWednesdayShip(String wednesdayShip) {
        this.wednesdayShip = wednesdayShip;
    }

    public String getWednesdayTransitTime() {
        return wednesdayTransitTime;
    }

    public void setWednesdayTransitTime(String wednesdayTransitTime) {
        this.wednesdayTransitTime = wednesdayTransitTime;
    }

    public String getFromNodeType() {
        return fromNodeType;
    }

    public void setFromNodeType(String fromNodeType) {
        this.fromNodeType = fromNodeType;
    }
}
