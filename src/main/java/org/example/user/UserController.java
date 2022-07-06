package org.example.user;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user/")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserMapper userMapper;

    @PostMapping("v1")
    public ResponseEntity<Void> save(@RequestBody UserDTO userDTO) {
        userService.save(userMapper.toUser(userDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("v1/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable Long id) {
        User user = userService.getById(id);
        UserDTO userDTO = userMapper.toUserDTO(user);
        return ResponseEntity.ok(userDTO);
    }

    @GetMapping("v1/")
    public ResponseEntity<List<UserDTO>> getAll() {
        List<User> users = userService.getAll();
        List<UserDTO> usersDTO = userMapper.toUserDTOS(users);
        return ResponseEntity.ok(usersDTO);
    }


    @DeleteMapping("/v1/{id}")
    public ResponseEntity deleteById(@PathVariable Long id)
    {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/v1")
    public ResponseEntity update(@RequestBody User user)
    {
        userService.update(user);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("v1/{page}/{size}")
//    public ResponseEntity<PaginationDTO> getAllWithPage(@PathVariable(name = "page") int page, @PathVariable(name = "size") int size) {
//
//        Page<User> bankPage = userService.getAllWithPage(page, size);
//        int totalPage = bankPage.getTotalPages();
//        Long totalElement = bankPage.getTotalElements();
//
//        List<User> users = bankPage.getContent();
//
//
//        List<UserDTO> usersDTO = userMapper.toUserDTOS(users);
//
//        PaginationDTO<UserDTO> paginationDTO = new PaginationDTO<>(totalElement, totalPage, usersDTO);
//
//
//        return ResponseEntity.ok(paginationDTO);
//    }


}
