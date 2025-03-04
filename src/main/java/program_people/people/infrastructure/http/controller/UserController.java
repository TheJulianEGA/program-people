package program_people.people.infrastructure.http.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import program_people.people.application.dto.userdto.PeopleRequest;
import program_people.people.application.dto.userdto.PeopleResponse;
import program_people.people.application.handler.userhandler.IPeopleHandler;

import java.util.List;

@RestController
@RequestMapping("/api/people")
@RequiredArgsConstructor
public class UserController {

    private final IPeopleHandler userHandler;


    @PostMapping("/create_people")
    public ResponseEntity<PeopleResponse> createUser(@Valid @RequestBody PeopleRequest userRequest) {

        PeopleResponse userResponse = userHandler.registerUser(userRequest);

        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PeopleResponse>> getAllPeople() {
        List<PeopleResponse> peopleResponses = userHandler.getAllPeople();
        return new ResponseEntity<>(peopleResponses, HttpStatus.OK);
    }


}
