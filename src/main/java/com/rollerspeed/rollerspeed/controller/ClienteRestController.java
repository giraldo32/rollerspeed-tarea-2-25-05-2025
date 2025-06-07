package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Cliente;
import com.rollerspeed.rollerspeed.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

    private final ClienteService clienteService;

    public ClienteRestController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    @Operation(summary = "Listar todos los clientes")
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo cliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteService.guardarCliente(cliente);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener cliente por ID")
    public Cliente obtenerCliente(@PathVariable Long id) {
        return clienteService.obtenerClientePorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar cliente por ID")
    public Cliente actualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteService.guardarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar cliente por ID")
    public void eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
    }
}