package com.example.tacocloud.controller;

import com.example.tacocloud.entity.Taco;
import com.example.tacocloud.entity.TacoOrder;
import com.example.tacocloud.repository.OrderRepository;
import com.example.tacocloud.repository.TacoRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
//
//@RestController
//@RequestMapping(path = "/api/tacos", produces = "application/json")
//@CrossOrigin(origins = "http://tacocloud:8080")
public class TacoController {

//    private final TacoRepository tacoRepo;
//    private final OrderRepository orderRepo;
//
//
//    public TacoController(TacoRepository tacoRepo, OrderRepository orderRepo) {
//        this.tacoRepo = tacoRepo;
//        this.orderRepo = orderRepo;
//    }
//
//    @GetMapping(params = "recent")
//    public Iterable<Taco> recentTAcos(){
//        PageRequest page = PageRequest.of(0, 12, Sort.by("createdAt").descending());
//        return tacoRepo.findAll(page).getContent();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id) {
//        Optional<Taco> optTaco = tacoRepo.findById(id);
//        return optTaco.map(taco -> new ResponseEntity<>(taco, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
//    }
//
//    @PostMapping(consumes = "application/json")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Taco postTaco(@RequestBody Taco taco) {
//        return tacoRepo.save(taco);
//    }
//
//    @PatchMapping(path="/{orderId}", consumes="application/json")
//    public TacoOrder patchOrder(@PathVariable("orderId") Long orderId,
//                                @RequestBody TacoOrder patch) {
//
//        TacoOrder order = orderRepo.findById(orderId).get();
//        if (patch.getDeliveryName() != null) {
//            order.setDeliveryName(patch.getDeliveryName());
//        }
//        if (patch.getDeliveryStreet() != null) {
//            order.setDeliveryStreet(patch.getDeliveryStreet());
//        }
//        if (patch.getDeliveryCity() != null) {
//            order.setDeliveryCity(patch.getDeliveryCity());
//        }
//        if (patch.getDeliveryState() != null) {
//            order.setDeliveryState(patch.getDeliveryState());
//        }
//        if (patch.getDeliveryZip() != null) {
//            order.setDeliveryZip(patch.getDeliveryZip());
//        }
//        if (patch.getCcNumber() != null) {
//            order.setCcNumber(patch.getCcNumber());
//        }
//        if (patch.getCcExpiration() != null) {
//            order.setCcExpiration(patch.getCcExpiration());
//        }
//        if (patch.getCcCVV() != null) {
//            order.setCcCVV(patch.getCcCVV());
//        }
//        return orderRepo.save(order);
//    }
//
//    @DeleteMapping("/{orderId}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteOrder(@PathVariable("orderId") Long orderId) {
//        try {
//            orderRepo.deleteById(orderId);
//        } catch (EmptyResultDataAccessException e) {}
//    }

}
