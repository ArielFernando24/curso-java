/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.controllers.PersonController
 *  br.com.ariel.curso_java.dto.v1.PersonDTO
 *  br.com.ariel.curso_java.dto.v2.PersonDTOV2
 *  br.com.ariel.curso_java.services.PersonService
 *  io.swagger.v3.oas.annotations.Operation
 *  io.swagger.v3.oas.annotations.media.ArraySchema
 *  io.swagger.v3.oas.annotations.media.Content
 *  io.swagger.v3.oas.annotations.media.Schema
 *  io.swagger.v3.oas.annotations.responses.ApiResponse
 *  io.swagger.v3.oas.annotations.tags.Tag
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.http.ResponseEntity
 *  org.springframework.web.bind.annotation.DeleteMapping
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.PutMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package br.com.ariel.curso_java.controllers;

import br.com.ariel.curso_java.dto.v1.PersonDTO;
import br.com.ariel.curso_java.dto.v2.PersonDTOV2;
import br.com.ariel.curso_java.services.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/api/person/v1"})
@Tag(name="People", description="Endpoints for managing people")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping(value={"/{id}"}, produces={"application/json", "application/xml", "application/yaml"})
    @Operation(summary="Find a person", description="Find a person by their ID", tags={"People"}, responses={@ApiResponse(description="Success", responseCode="200", content={@Content(schema=@Schema(implementation=PersonDTO.class))}), @ApiResponse(description="No Content", responseCode="204", content={@Content}), @ApiResponse(description="Bad Request", responseCode="400", content={@Content}), @ApiResponse(description="Unauthorized", responseCode="401", content={@Content}), @ApiResponse(description="Not Found", responseCode="404", content={@Content}), @ApiResponse(description="Internal Server Error", responseCode="500", content={@Content})})
    public PersonDTO findById(@PathVariable(value="id") Long id) {
        return this.service.findById(id);
    }

    @GetMapping(produces={"application/json", "application/xml", "application/yaml"})
    @Operation(summary="Find all people", description="Returns a list of all people in the system", tags={"People"}, responses={@ApiResponse(description="Success", responseCode="200", content={@Content(mediaType="application/json", array=@ArraySchema(schema=@Schema(implementation=PersonDTO.class)))}), @ApiResponse(description="No Content", responseCode="204", content={@Content}), @ApiResponse(description="Bad Request", responseCode="400", content={@Content}), @ApiResponse(description="Unauthorized", responseCode="401", content={@Content}), @ApiResponse(description="Not Found", responseCode="404", content={@Content}), @ApiResponse(description="Internal Server Error", responseCode="500", content={@Content})})
    public List<PersonDTO> findAll() {
        return this.service.findAll();
    }

    @PostMapping(consumes={"application/json", "application/xml", "application/yaml"}, produces={"application/json", "application/xml", "application/yaml"})
    @Operation(summary="Create a person", description="Creates a new person and persists it in the database", tags={"People"}, responses={@ApiResponse(description="Created", responseCode="200", content={@Content(schema=@Schema(implementation=PersonDTO.class))}), @ApiResponse(description="Bad Request", responseCode="400", content={@Content}), @ApiResponse(description="Unauthorized", responseCode="401", content={@Content}), @ApiResponse(description="Internal Server Error", responseCode="500", content={@Content})})
    public PersonDTO create(@RequestBody PersonDTO person) {
        return this.service.create(person);
    }

    @PostMapping(value={"/v2"}, consumes={"application/json", "application/xml", "application/yaml"}, produces={"application/json", "application/xml", "application/yaml"})
    @Operation(summary="Create a person (V2)", description="Creates a new person using birth date instead of age (V2)", tags={"People"}, responses={@ApiResponse(description="Created", responseCode="200", content={@Content(schema=@Schema(implementation=PersonDTOV2.class))}), @ApiResponse(description="Bad Request", responseCode="400", content={@Content}), @ApiResponse(description="Unauthorized", responseCode="401", content={@Content}), @ApiResponse(description="Internal Server Error", responseCode="500", content={@Content})})
    public PersonDTOV2 createV2(@RequestBody PersonDTOV2 person) {
        return this.service.createV2(person);
    }

    @PutMapping(consumes={"application/json", "application/xml", "application/yaml"}, produces={"application/json", "application/xml", "application/yaml"})
    @Operation(summary="Update a person", description="Updates an existing person's data", tags={"People"}, responses={@ApiResponse(description="Updated", responseCode="200", content={@Content(schema=@Schema(implementation=PersonDTO.class))}), @ApiResponse(description="Bad Request", responseCode="400", content={@Content}), @ApiResponse(description="Unauthorized", responseCode="401", content={@Content}), @ApiResponse(description="Not Found", responseCode="404", content={@Content}), @ApiResponse(description="Internal Server Error", responseCode="500", content={@Content})})
    public PersonDTO update(@RequestBody PersonDTO person) {
        return this.service.update(person);
    }

    @DeleteMapping(value={"/{id}"})
    @Operation(summary="Delete a person", description="Deletes a person by their ID", tags={"People"}, responses={@ApiResponse(description="No Content", responseCode="204", content={@Content}), @ApiResponse(description="Bad Request", responseCode="400", content={@Content}), @ApiResponse(description="Unauthorized", responseCode="401", content={@Content}), @ApiResponse(description="Not Found", responseCode="404", content={@Content}), @ApiResponse(description="Internal Server Error", responseCode="500", content={@Content})})
    public ResponseEntity<?> delete(@PathVariable(value="id") Long id) {
        this.service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

