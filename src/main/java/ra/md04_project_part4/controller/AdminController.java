package ra.md04_project_part4.controller;

import ra.md04_project_part4.security.principle.UserDetailsCustom;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/list")
    public ResponseEntity<List<String>> home(@AuthenticationPrincipal UserDetailsCustom currentUser) {
        return new ResponseEntity<>(Arrays.asList("hh", "ll", "dd"), HttpStatus.OK);
    }
}
