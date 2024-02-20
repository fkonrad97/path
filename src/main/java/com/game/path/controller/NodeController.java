package com.game.path.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.game.path.entity.Node;
import com.game.path.repository.NodeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController {
    
    @Autowired
    private NodeRepository nodeRepository;

    @GetMapping("/find")
    public Iterable<Node> findAllNodes() {
        return this.nodeRepository.findAll();
    }
    
    @PostMapping("/")
    public void addNode() {
        Node node = new Node();
        this.nodeRepository.save(node);
    }
    

}
