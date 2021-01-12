package com.iamgrodrigues.boardroommanagerapi.controller;

import com.iamgrodrigues.boardroommanagerapi.exception.ResourceNotFoundException;
import com.iamgrodrigues.boardroommanagerapi.model.Boardroom;
import com.iamgrodrigues.boardroommanagerapi.repository.BoardroomRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BoardroomController {

    private BoardroomRepository boardroomRepository;

    @GetMapping("/boardrooms")
    public List<Boardroom> getAllBoardrooms() {
        return boardroomRepository.findAll();
    }

    @GetMapping("/boardrooms/{id}")
    public ResponseEntity<Boardroom> getBoardroomById(@PathVariable(value = "id") long boardroomId)
        throws ResourceNotFoundException{
        Boardroom boardroom = boardroomRepository.findById(boardroomId)
                .orElseThrow(() -> new ResourceNotFoundException("Boardroom not found:: " + boardroomId));
        return ResponseEntity.ok().body(boardroom);
    }

    @PostMapping("/boardrooms")
    public Boardroom createBoardroom (@Valid @RequestBody Boardroom boardroom) {
        return boardroomRepository.save(boardroom);
    }

    @PutMapping("/boardroom/{id}")
    public ResponseEntity<Boardroom> updateBoardroom(@PathVariable(value = "id") Long boardroomId,
                                                     @Valid @RequestBody Boardroom boardroomDetails)
            throws ResourceNotFoundException {
        Boardroom boardroom = boardroomRepository.findById(boardroomId)
                .orElseThrow(() -> new ResourceNotFoundException("Boardroom not found for this id:: " + boardroomId));
        boardroom.setName(boardroom.getName());
        boardroom.setDate(boardroom.getDate());
        boardroom.setStarHour(boardroom.getStarHour());
        boardroom.setEndHour(boardroom.getEndHour());
        final Boardroom updateBoardroom = boardroomRepository.save(boardroom);
        return ResponseEntity.ok(updateBoardroom);
    }

    public Map<String, Boolean> deleteBoardroom(@PathVariable(value = "id") Long boardroomId)
        throws ResourceNotFoundException {
        Boardroom boardroom = boardroomRepository.findById(boardroomId)
                .orElseThrow(() -> new ResourceNotFoundException("Boardroom not found for this id:: " + boardroomId));
        boardroomRepository.delete(boardroom);
        Map<String, Boolean> response = new HashMap<>();
        response.put ("Deleted", Boolean.TRUE);
        return response;
    }
}
