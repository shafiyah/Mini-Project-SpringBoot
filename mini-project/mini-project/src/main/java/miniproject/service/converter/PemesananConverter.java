package miniproject.service.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import miniproject.model.DetailPemesananModel;
import miniproject.model.PemesanModel;
import miniproject.model.PemesananModel;
import miniproject.repository.dto.DetailPemesananDto;
import miniproject.repository.dto.PemesanDto;
import miniproject.repository.dto.PemesananDto;

public class PemesananConverter implements IPemesananConverter{

	@Override
	public PemesananDto createFrom(PemesananModel pemesananEntity) {
		PemesananDto pemesananDto = new PemesananDto();
		pemesananDto.setIdPemesanan(pemesananEntity.getIdPemesanan());
		pemesananDto.setKeteranganPemesanan(pemesananEntity.getKeteranganPemesanan());
		pemesananDto.setTanggalPemesanan(pemesananEntity.getTanggalPemesanan());
		pemesananDto.setPemesan(pemesananEntity.getPemesanPemesanan().getIdPemesan());
		return pemesananDto;
	}
	
	public PemesananDto convertCreat(PemesananModel pemesananEntity) {
		PemesananDto pemesananDto = new PemesananDto();
		pemesananDto.setIdPemesanan(pemesananEntity.getIdPemesanan());
		pemesananDto.setKeteranganPemesanan(pemesananEntity.getKeteranganPemesanan());
		pemesananDto.setTanggalPemesanan(pemesananEntity.getTanggalPemesanan());
		return pemesananDto;
	}
	
	public PemesananDto convertToDto(PemesananModel pemesanan) {
		PemesananDto pemesanandto = new PemesananDto();
		pemesanandto.setIdPemesanan(pemesanan.getIdPemesanan());
		pemesanandto.setPemesan(pemesanan.getPemesanPemesanan().getIdPemesan());
		pemesanandto.setKeteranganPemesanan(pemesanan.getKeteranganPemesanan());
		pemesanandto.setTanggalPemesanan(pemesanan.getTanggalPemesanan());
		pemesanandto.setDetailPemesanan(pemesanandetailConvert(pemesanan.getDetailPesanan()));;
		return pemesanandto;
	}
	public List<DetailPemesananDto>pemesanandetailConvert(Set<DetailPemesananModel> detail){
		List<DetailPemesananDto> detailPemesanalist = new ArrayList<DetailPemesananDto>();
		detail.stream().forEach(x -> detailPemesanalist.add(convertToDtodetail(x)));
		return detailPemesanalist;
	}
	
	public DetailPemesananDto convertToDtodetail(DetailPemesananModel detailPemesanan) {
		DetailPemesananDto dto = new DetailPemesananDto();
		dto.setIdDetailpemesanan(detailPemesanan.getIdDetailpemesanan());
		dto.setIdPemesanan(detailPemesanan.getPemesananId());
		dto.setIdBarang(detailPemesanan.getBarang().getIdBarang());
		dto.setJumlah_barang(detailPemesanan.getJumlah_barang());
		return dto;
	}
	
	@Override
	public PemesananModel createFrom(PemesananDto pemesananDto) {
		return updateEntity(new PemesananModel(), pemesananDto);
	}

	@Override
	public PemesananModel updateEntity(PemesananModel pemesanan, PemesananDto pemesananDto) {
		pemesanan.setIdPemesanan(pemesananDto.getIdPemesanan());
		pemesanan.setKeteranganPemesanan(pemesananDto.getKeteranganPemesanan());
		pemesanan.setTanggalPemesanan(pemesananDto.getTanggalPemesanan());
		return pemesanan;
	}
	
	public PemesanModel convertPemesanEntity(PemesanDto pemesanDto) {
		PemesanModel pemesan = new PemesanModel();
		pemesan.setAlamatPemesan(pemesanDto.getAlamatPemesan());
		pemesan.setIdPemesan(pemesanDto.getIdPemesan());
		pemesan.setNamaPemesan(pemesanDto.getNamaPemesan());
		pemesan.setTelphonePemesan(pemesanDto.getTelphonePemesan());	
		return pemesan;
	}
	
}
