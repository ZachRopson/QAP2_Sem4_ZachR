package com.todo.golfclub.controllers;

import com.todo.golfclub.entities.Tournament;
import com.todo.golfclub.services.TournamentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {

    private final TournamentService tournamentService;

    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @GetMapping
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }
    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return tournamentService.addTournament(tournament);
    }
    @PostMapping("/{tournamentId}/add-member/{memberId}")
    public Tournament addMemberToTournament(
            @PathVariable Long tournamentId,
            @PathVariable Long memberId
    ) {
        return tournamentService.addMemberToTournament(tournamentId, memberId);
    }


}
