package miniproject.endpoint.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import miniproject.endpoint.request.BarangCreateRequest;
import miniproject.endpoint.request.BarangIdRequest;
import miniproject.endpoint.request.BarangUpdateRequest;
import miniproject.endpoint.request.converter.impl.BarangCreateConverter;
import miniproject.endpoint.request.converter.impl.BarangUpdateConverter;
import miniproject.endpoint.response.BarangResponse;
import miniproject.endpoint.response.converter.BarangResponseConverter;
import miniproject.repository.dto.BarangDto;
import miniproject.service.BarangService;

@RestController()
public class BarangController {
	
@Autowired
private BarangService service;
@Autowired
private BarangCreateConverter barangCreateConverter;
@Autowired
private BarangUpdateConverter barangUpdateConverter;
@Autowired
private BarangResponseConverter barangResponConverter;

@PostMapping(value = "/api/barang/create")
public ResponseEntity<BarangResponse> createBarang (@RequestBody BarangCreateRequest request){
	BarangDto barangDto = service.Create(barangCreateConverter.converterToDto(request));
	BarangResponse barangResponse = barangResponConverter.convertToResponse(barangDto);
	return new ResponseEntity<BarangResponse>(barangResponse, HttpStatus.OK);
}

@PostMapping(value = "/api/barang/getbyId")
public ResponseEntity<BarangResponse> getByIdBarang (@RequestBody BarangIdRequest request){
	BarangResponse barangResponse = barangResponConverter.convertToResponse(service.findById(request.getIdBarang()));
	return new ResponseEntity<BarangResponse>(barangResponse, HttpStatus.OK);
}

@PostMapping(value = "/api/barang/getAll")
public ResponseEntity<List<BarangResponse>> getAllBarang (@RequestBody BarangIdRequest request){
	 List<BarangResponse> barangResponse = barangResponConverter.convertToResponses(service.findAll());
	return new ResponseEntity<List<BarangResponse>>(barangResponse, HttpStatus.OK);
}

@PostMapping(value = "/api/barang/update")
public ResponseEntity<BarangResponse> updateBarang (@RequestBody BarangUpdateRequest request){
	BarangDto barangDto = service.update(barangUpdateConverter.converterToDto(request));
	BarangResponse barangResponse = barangResponConverter.convertToResponse(barangDto);
	return new ResponseEntity<BarangResponse>(barangResponse, HttpStatus.OK);
}

@DeleteMapping(value = "/api/barang/deletebyId")
public ResponseEntity<String> deleteByIdBarang (@RequestBody BarangIdRequest request){
	service.deleteById(request.getIdBarang());
	return new ResponseEntity<String>("deleted", HttpStatus.OK);
}

}
