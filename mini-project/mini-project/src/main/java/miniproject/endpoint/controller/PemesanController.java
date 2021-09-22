package miniproject.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import miniproject.endpoint.request.PemesanCreateRequest;
import miniproject.endpoint.request.PemesanIdRequest;
import miniproject.endpoint.request.PemesanUpdateRequest;
import miniproject.endpoint.request.converter.impl.PemesanCreateConverter;
import miniproject.endpoint.request.converter.impl.PemesanUpdateConverter;
import miniproject.endpoint.response.PemesanResponse;
import miniproject.endpoint.response.converter.PemesanResponseConverter;
import miniproject.repository.dto.PemesanDto;
import miniproject.service.PemesanService;

@RestController
public class PemesanController {
	@Autowired
	private PemesanService service;
	@Autowired
	private PemesanCreateConverter pemesanCreateConverter;
	@Autowired
	private PemesanUpdateConverter pemesanUpdateConverter;
	@Autowired
	private PemesanResponseConverter pemesanResponConverter;
	
	@PostMapping(value = "/api/pemesan/create")
	public ResponseEntity<PemesanResponse> createPemesan (@RequestBody PemesanCreateRequest request){
		PemesanDto pemesanDto = service.Create(pemesanCreateConverter.converterToDto(request));
		PemesanResponse pemesanResponse = pemesanResponConverter.convertToResponse(pemesanDto);
		return new ResponseEntity<PemesanResponse>(pemesanResponse, HttpStatus.OK);
	}

	@PostMapping(value = "/api/pemesan/getbyId")
	public ResponseEntity<PemesanResponse> getByIdPemesan (@RequestBody PemesanIdRequest request){
		PemesanResponse pemesanResponse = pemesanResponConverter.convertToResponse(service.findById(request.getIdPemesan()));
		return new ResponseEntity<PemesanResponse>(pemesanResponse, HttpStatus.OK);
	}

	@PostMapping(value = "/api/pemesan/getAll")
	public ResponseEntity<List<PemesanResponse>> getAllPemesan (){
		 List<PemesanResponse> pemesanResponse = pemesanResponConverter.convertToResponses(service.findAll());
		return new ResponseEntity<List<PemesanResponse>>(pemesanResponse, HttpStatus.OK);
	}

	@PostMapping(value = "/api/pemesan/update")
	public ResponseEntity<PemesanResponse> updatePemesan (@RequestBody PemesanUpdateRequest request){
		PemesanDto pemesanDto = service.update(pemesanUpdateConverter.converterToDto(request));
		PemesanResponse pemesanResponse = pemesanResponConverter.convertToResponse(pemesanDto);
		return new ResponseEntity<PemesanResponse>(pemesanResponse, HttpStatus.OK);
	}

	@DeleteMapping(value = "/api/pemesan/deletebyId")
	public ResponseEntity<String> pemesanByIdBarang (@RequestBody PemesanIdRequest request){
		service.deleteById(request.getIdPemesan());
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}
}
