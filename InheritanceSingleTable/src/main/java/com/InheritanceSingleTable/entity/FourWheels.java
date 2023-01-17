package com.InheritanceSingleTable.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue(value = "FourWheels")
public class FourWheels  extends Vehicle{
private int modelno;
private String modelname;
private boolean musicSystem;
private String etype;
private boolean ac;
}
