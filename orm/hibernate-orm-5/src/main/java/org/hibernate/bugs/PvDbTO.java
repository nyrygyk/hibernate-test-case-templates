package org.hibernate.bugs;

import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "PV_DB")
@Entity
@Immutable
public class PvDbTO extends PvDbCommon {
}
