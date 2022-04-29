package org.espositos.mapping.combatarms.models;

import javax.persistence.*;

@Entity
@Table(name = "sightings")
public class Sighting {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    @Enumerated(EnumType.STRING)
    private CombatArmsType type;
    @Embedded
    private Location location;
}
