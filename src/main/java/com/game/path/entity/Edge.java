package com.game.path.entity;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "Edge")
@Getter
@Setter
@NoArgsConstructor
public class Edge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Node source;
    @ManyToOne
    private Node target;
 
    public Edge(Node source, Node target) {
       this.source = source;
       this.target = target;
    }
 
    public Edge(Node target) {
       this.target = target;
    }
 
    public Node getSource() {
       return this.source;
    }
 
    public void setSource(Node source) {
       this.source = source;
    }
 
    public Node getTarget() {
       return this.target;
    }
 
    public void setTarget(Node target) {
       this.target = target;
    }
}
