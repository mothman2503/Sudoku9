package org.example.sudoku.controllers;

import org.example.sudoku.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    //private GameService gameService;


    // GET method to retrieve a specific game by ID
    @GetMapping("/{id}")
    public ResponseEntity<Game> getGameById(@PathVariable Long id) {
        Game game = new Game();
        if (game != null) {
            return ResponseEntity.ok(game);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST method to create a new game
    @PostMapping
    public ResponseEntity<Game> createGame(@RequestBody Game game) {
        Game createdGame = new Game();
        return ResponseEntity.ok(createdGame);
    }

    // PUT method to update an existing game
    @PutMapping("/{id}")
    public ResponseEntity<Game> updateGame(@PathVariable Long id, @RequestBody Game game) {
        Game updatedGame = new Game();
        if (updatedGame != null) {
            return ResponseEntity.ok(updatedGame);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE method to delete a game by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable Long id) {
        boolean deleted = false;
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
