package com.lithium.lithium.controller;

import com.lithium.lithium.dto.project.FileContentResponse;
import com.lithium.lithium.dto.project.FileNode;
import com.lithium.lithium.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
public class FileController {
    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId) {
        Long userId = 1L;
        List<FileNode> fileNodeList = fileService.getFileTree(projectId, userId);
        return ResponseEntity.ok(fileNodeList);
    }

    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getFile(@PathVariable Long projectId, @PathVariable String path) {
        Long userId = 1L;
        FileContentResponse fileContent = fileService.getFileContent(projectId, path, userId);
        return ResponseEntity.ok(fileContent);
    }


}
