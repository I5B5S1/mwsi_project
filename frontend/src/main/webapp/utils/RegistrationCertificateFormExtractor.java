package main.webapp.utils;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jpa.entities.DowodEntity;
import main.webapp.exception.ValidationException;

public class RegistrationCertificateFormExtractor {
	public  static DowodEntity extractRegistrationCertificate(HttpServletRequest request) throws ValidationException{
		Map<String, String> map = Nullifier.nullify(request.getParameterMap());
		DowodEntity dowodEntity= new DowodEntity();
		dowodEntity.setNrRejestracyjny(map.get("registrationNumber"));
		dowodEntity.setSeria(map.get("series"));
		dowodEntity.setNumer(map.get("number"));
		dowodEntity.setOrganWydajacy(map.get("issuingAuthority"));
		dowodEntity.setDataRej(map.get("registrationDate"));
		if(dowodEntity.getDataRej() != null){
			Validator.validateDate(dowodEntity.getDataRej());
		}
		dowodEntity.setKrajRej(map.get("registrationCountry"));
		dowodEntity.setDataPierwszejRej(map.get("firstRegistrationDate"));
		if(dowodEntity.getDataPierwszejRej() != null){
			Validator.validateDate(dowodEntity.getDataPierwszejRej());
		}
		dowodEntity.setOkresWaznosci(map.get("expireDsate"));
		if(dowodEntity.getOkresWaznosci() != null){
			Validator.validateDate(dowodEntity.getOkresWaznosci());
		}
		dowodEntity.setDataBadania(map.get("examinationDate"));
		if(dowodEntity.getDataBadania() != null){
			Validator.validateDate(dowodEntity.getDataBadania());
		}
		dowodEntity.setDataNastBadania(map.get("nextExaminationDate"));
		if(dowodEntity.getDataNastBadania() != null){
			Validator.validateDate(dowodEntity.getDataNastBadania());
		}
		dowodEntity.setUtrataDowoduRejestracyjnego(map.get("registrationCertificateLoss"));
		if(dowodEntity.getUtrataDowoduRejestracyjnego() != null){
			Validator.validateDate(dowodEntity.getUtrataDowoduRejestracyjnego());
		}
		dowodEntity.setOdnalezienieDowoduRejestracyjnego(map.get("registrationCertificateRetrieval"));
		if(dowodEntity.getOdnalezienieDowoduRejestracyjnego() != null){
			Validator.validateDate(dowodEntity.getOdnalezienieDowoduRejestracyjnego());
		}
		
		
		
		
		
		return dowodEntity;
	}
}
