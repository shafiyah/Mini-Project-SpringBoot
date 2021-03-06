package miniproject.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import miniproject.endpoint.handler.PemesananHandler;
import miniproject.endpoint.request.DetailPemesananUpdateRequest;
import miniproject.endpoint.request.PemesanNameRequest;
import miniproject.endpoint.request.PemesananCreateRequest;
import miniproject.endpoint.request.PemesananIdRequest;
import miniproject.endpoint.request.converter.impl.DetailPemesananUpdateConverter;
import miniproject.endpoint.request.converter.impl.PemesananCreateConvert;
import miniproject.endpoint.response.DetailPemesananResponse;
import miniproject.endpoint.response.PemesananBaseResponse;
import miniproject.endpoint.response.PemesananResponse;
import miniproject.endpoint.response.converter.DetailPemesananResponseConverter;
import miniproject.endpoint.response.converter.PemesanaResponseConverter;
import miniproject.repository.dto.DetailPemesananDto;
import miniproject.repository.dto.PemesananDto;
import miniproject.service.PemesananService;


@RestController()
public class PemesananController {
	
	@Autowired
	private PemesananCreateConvert pemesananCreateConverter;
	@Autowired
	private PemesanaResponseConverter pemesananResponConverter;
	@Autowired
	private PemesananHandler pemesanananHandler;
	@Autowired
	private PemesananService pemesananService;
	@Autowired
	private DetailPemesananUpdateConverter detailPemesananUpdateConverter;
	@Autowired
	private DetailPemesananResponseConverter detailPemesananResponseConverter;
	
	
	
	@PostMapping(value = "/api/pemesanan/create")
	public ResponseEntity<PemesananBaseResponse> pemesananBarang (@RequestBody PemesananCreateRequest request){
		PemesananDto pemesananDtos = pemesananCreateConverter.converterToDto(request);
		PemesananResponse response = pemesananResponConverter.convertToResponses(pemesanananHandler.insert(pemesananDtos));
		PemesananBaseResponse pemesanaRespon = new PemesananBaseResponse(response);
		return new ResponseEntity<PemesananBaseResponse>(pemesanaRespon, HttpStatus.OK);
	}
	
	@PostMapping(value = "/api/pemesanan/updateBarang")
	public ResponseEntity<DetailPemesananResponse> updatepemesananBarang (@RequestBody DetailPemesananUpdateRequest request){
		DetailPemesananDto dpemesananDto = detailPemesananUpdateConverter.converterToDto(request);
		DetailPemesananResponse response = detailPemesananResponseConverter.convertToResponse(pemesanananHandler.updateBarangPemesanan(dpemesananDto));
		return new ResponseEntity<DetailPemesananResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(value = "/api/pemesanan/getByName")
	public ResponseEntity<List<DetailPemesananResponse>> getbarangPesananbyname (@RequestBody PemesanNameRequest request){
		List<DetailPemesananResponse> response = detailPemesananResponseConverter.convertToResponses(pemesanananHandler.getBarangPesananbyName(request));
		return new ResponseEntity<List<DetailPemesananResponse>>(response, HttpStatus.OK);
	}
	@PostMapping(value = "/api/pemesanan/getAll")
	public ResponseEntity<List<PemesananResponse>> getAllPemesanan (){
		 List<PemesananResponse> pemesananResponse = pemesananResponConverter.convertToResponses(pemesananService.findAll());
		return new ResponseEntity<List<PemesananResponse>>(pemesananResponse, HttpStatus.OK);
	}
	
	@PostMapping(value = "/api/pemesanan/getbyId")
	public ResponseEntity<PemesananResponse> getByIdPemesanan (@RequestBody PemesananIdRequest request){
		PemesananResponse pemesananResponse = pemesananResponConverter.convertToResponse(pemesananService.findById(request.getIdPemesanan()));
		return new ResponseEntity<PemesananResponse>(pemesananResponse, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/api/pemesanan/deletebyId")
	public ResponseEntity<String> deletepemesananByIdBarang (@RequestBody PemesananIdRequest request){
		pemesananService.deleteById(request.getIdPemesanan());
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}


}
