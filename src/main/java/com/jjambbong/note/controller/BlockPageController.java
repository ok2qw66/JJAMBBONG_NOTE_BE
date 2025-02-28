package com.jjambbong.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jjambbong.note.common.ApiResponse;
import com.jjambbong.note.dto.BlockPageDto;
import com.jjambbong.note.entity.BlockPage;
import com.jjambbong.note.service.BlockPageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BlockPageController {

	@Autowired
	private final BlockPageService blockPageService;


	@PostMapping(path = "/api/block/page/create")
	public ApiResponse<String> createBlock(@RequestBody BlockPageDto blockPageDto) {
		return blockPageService.createBlockPage(blockPageDto);
	}

	@GetMapping(path = "/api/block/page/{id}")
	public BlockPage getBlock(@PathVariable String id) {
		return blockPageService.getBlockPage(id);
	}

	@PutMapping(path = "/api/block/page/{id}")
	public ApiResponse<String> updateBlock(@PathVariable String id, @RequestBody BlockPageDto blockPageDto){
		return blockPageService.updateBlockPage(blockPageDto, id);
	}

	@DeleteMapping(path = "/api/block/page/{id}")
	public ApiResponse<String> deleteBlock(@PathVariable String id){
		 return blockPageService.deleteBlockPage(id);
	}
}
