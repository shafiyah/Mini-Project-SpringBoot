package miniproject.endpoint.handler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import miniproject.endpoint.request.PemesanNameRequest;
import miniproject.model.DetailPemesananModel;
import miniproject.model.PemesanModel;
import miniproject.model.PemesananModel;
import miniproject.repository.dto.DetailPemesananDto;
import miniproject.repository.dto.PemesanDto;
import miniproject.repository.dto.PemesananDto;
import miniproject.service.BarangService;
import miniproject.service.DetailPemesanaService;
import miniproject.service.PemesanService;
import miniproject.service.PemesananService;
import miniproject.service.converter.PemesananConverter;

public class PemesananHandler {
	
	@Autowired
	private PemesananService pemesananService;
	@Autowired
	private DetailPemesanaService detailPemesananService;
	@Autowired
	private PemesanService pemesanService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private PemesananConverter converter;
	
	
	public PemesananModel insert(PemesananDto pemesananDto) {
		PemesanModel pemesan= converter.convertPemesanEntity(pemesanService.findById(pemesananDto.getPemesan()));
		PemesananModel pemesanan = converter.createFrom(pemesananService.Create(pemesananDto));
		List<DetailPemesananModel> detailPemesananModel = handlerDetailPemesanan(pemesanan.getIdPemesanan(),pemesananDto.getDetailPemesanan()); 
		pemesanan.setPemesan(pemesan);
		pemesanan.setDetailPesanan(new HashSet<DetailPemesananModel>(detailPemesananModel));
		return pemesananService.getDao().merge(pemesanan);
		
	}
	public List<DetailPemesananModel> handlerDetailPemesanan(int id, List<DetailPemesananDto> detailList) {
		List<DetailPemesananModel> detailPemesanan = detailPemesananService.getConverter().createFromDtos(detailList);
		for(int i=0;i<detailPemesanan.size();i++) {
			detailPemesanan.get(i).setBarang (barangService.getDao().findById(detailList.get(i).getIdBarang()));
			detailPemesanan.get(i).setPemesanan(pemesananService.getDao().findById(id));
			detailPemesananService.getDao().save(detailPemesanan.get(i));
		}
		return detailPemesanan;
	}
	
	public DetailPemesananDto updateBarangPemesanan(DetailPemesananDto dPemesananDto) {
		PemesananModel pemesanan = pemesananService.getDao().findById(dPemesananDto.getIdPemesanan());
		List<DetailPemesananModel> detailList=new ArrayList<DetailPemesananModel>();
		pemesanan.getDetailPesanan().stream().forEach(x->detailList.add(x));
		for (DetailPemesananModel element : detailList) {
			if(element.getBarang().getBarangId()==dPemesananDto.getIdBarang()) {
				dPemesananDto.setIdDetailpemesanan(element.getIdDetailpemesanan());
			}
		}
	    return detailPemesananService.update(dPemesananDto);
	}
	
	public List<DetailPemesananModel> getBarangPesananbyName (PemesanNameRequest request){
		PemesanDto pemesan = pemesanService.findByName(request.getNamaPemesan());
		List<PemesananModel> pemesananLists = pemesananService.getDao().findbyPemesanId(pemesan.getIdPemesan());
		List<DetailPemesananModel> detailPemesananList = new ArrayList<DetailPemesananModel>();
		for (PemesananModel element : pemesananLists ) {
		  element.getDetailPesanan().stream().forEach(x -> detailPemesananList.add(x));
		}
		return detailPemesananList;
	}
}
		
